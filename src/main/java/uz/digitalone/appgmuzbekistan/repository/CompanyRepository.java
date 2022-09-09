package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.digitalone.appgmuzbekistan.entity.GM;

@Repository
public interface CompanyRepository extends JpaRepository<GM, Long> {
}
