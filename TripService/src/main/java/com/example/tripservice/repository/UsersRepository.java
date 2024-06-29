package com.example.tripservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tripservice.entity.Person;
import com.example.tripservice.entity.Trip;


public interface UsersRepository extends JpaRepository<Person, Long> {
    // Méthodes de requête personnalisées, si nécessaire
    Person findByUsername(String username);
}
