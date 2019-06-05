package ua.lviv.iot.repository;

import ua.lviv.iot.models.Tent;
import ua.lviv.iot.repository.CampingRepository;

import javax.transaction.Transactional;

@Transactional

public interface TentRepository  extends CampingRepository<Tent> {

}
