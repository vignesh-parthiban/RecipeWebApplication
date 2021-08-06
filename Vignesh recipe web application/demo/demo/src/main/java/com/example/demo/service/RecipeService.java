package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.RecipeEntity;
import com.example.demo.repository.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
    private RecipeRepository repo;
	
	public List<RecipeEntity> listAll() {
        return repo.findAll();
    }
     
    public void save(RecipeEntity std) {
        repo.save(std);
    }
     
    public RecipeEntity get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}


