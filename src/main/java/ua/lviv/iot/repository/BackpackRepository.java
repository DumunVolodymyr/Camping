package ua.lviv.iot.repository;


import ua.lviv.iot.models.Backpack;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional

public interface BackpackRepository extends CampingRepository<Backpack> {
}
