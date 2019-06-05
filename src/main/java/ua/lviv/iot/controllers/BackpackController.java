package ua.lviv.iot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.models.Backpack;
import ua.lviv.iot.repository.BackpackRepository;



@RestController

public class BackpackController {

		@Autowired
		private BackpackRepository backpackRepository;

		@GetMapping("/backpack")
		public List<Backpack> getbackpacks() {
			return (List<Backpack>) backpackRepository.findAll();
		}

		@GetMapping("/backpack/{id}")
		public Backpack getBackpack(@PathVariable Integer id) {
			return backpackRepository.findById(id).get();
		}

		@PostMapping("/backpack")
		public Backpack postBackpack(@RequestBody Backpack backpack) {
			return backpackRepository.save(backpack);
		}

		@PutMapping("/backpack")
		public Backpack updateBackpack(@RequestBody Backpack newBackpack) {
			return backpackRepository.save(newBackpack);
		}

		@DeleteMapping("/backpack/{id}")
		public Backpack deleteBackpack(@PathVariable Integer id) {
			backpackRepository.deleteById(id);
			return null;
		}
}
		