package ua.lviv.iot.lab9.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.lab9.model.Coffee;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Integer> {
}
