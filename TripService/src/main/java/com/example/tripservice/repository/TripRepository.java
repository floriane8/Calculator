package com.example.tripservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tripservice.entity.Person;
import com.example.tripservice.entity.Trip;

public interface TripRepository extends  JpaRepository<Trip, Long>{
    // Méthodes de requête personnalisées, si nécessaire
    Trip findByTrip(String trip);
}
