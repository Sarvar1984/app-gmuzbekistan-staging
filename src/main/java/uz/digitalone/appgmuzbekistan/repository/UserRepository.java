package uz.digitalone.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.digitalone.appgmuzbekistan.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
