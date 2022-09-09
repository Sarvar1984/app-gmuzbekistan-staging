package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.digitalone.appgmuzbekistan.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
