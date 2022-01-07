package com.example.SpringMVCThymeleaf.repository;

import com.example.SpringMVCThymeleaf.model.Gym9;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymRepository9 extends JpaRepository<Gym9, Integer> {
    List<Gym9> findByNameContaining(String name);

    Gym9 findById(int id);

    Gym9 deleteById(int id);
}
