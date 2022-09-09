package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.digitalone.appgmuzbekistan.entity.AutoShop;

@Repository
public interface AutoShopRepository extends JpaRepository<AutoShop, Long> {
}
