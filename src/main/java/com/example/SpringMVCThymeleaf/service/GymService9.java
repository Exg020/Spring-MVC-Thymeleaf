package com.example.SpringMVCThymeleaf.service;

import com.example.SpringMVCThymeleaf.Gym9;
import com.example.SpringMVCThymeleaf.repository.GymRepository9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GymService9 {

    @PersistenceContext
    public EntityManager entityManager;

    @Autowired
    private GymRepository9 gymRepository9;


    //Methods
    public Gym9 addGym(Gym9 gym) {
        return gymRepository9.save(gym);
    }

    public List<Gym9> getFindByNameContaining(String name) {
        return gymRepository9.findByNameContaining(name);
    }

    public Gym9 getFindById(int id) {
        return gymRepository9.findById(id);
    }

    public List<Gym9> getAll() {
        return gymRepository9.findAll();
    }
}
