package com.java.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
	@Autowired 
	private ModelRepository repo;
	
	public Model SaveModel(Model model) {
		return repo.save(model);
	}
	public List<Model> getModels(){
		return repo.getAllModels();
	}
	public Model getModelbyId(int id) {
		return repo.findbyId(id);
	}
	public String deleteProduct(int id ) {
		repo.delete(id);
		return "Model Removed = "+id;
	}
	public Model Updatemodel(Model model) {
		return repo.update(model);
	}
	

}
