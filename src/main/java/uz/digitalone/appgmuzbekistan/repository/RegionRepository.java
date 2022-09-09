package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.digitalone.appgmuzbekistan.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
