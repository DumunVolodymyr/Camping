package ua.lviv.iot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.models.CampingProduct;


public interface CampingRepository<T extends CampingProduct> extends CrudRepository<T, Integer> {

}

