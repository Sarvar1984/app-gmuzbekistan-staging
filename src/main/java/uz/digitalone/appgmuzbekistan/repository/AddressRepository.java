package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.digitalone.appgmuzbekistan.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
