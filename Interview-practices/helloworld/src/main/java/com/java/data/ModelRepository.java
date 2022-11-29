package com.java.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;


@Repository
public class ModelRepository {
	private List<Model> list= new ArrayList<Model>();
	
	public void creatModels() {
		list=List.of(new Model(1,"model1","modelDetail"),new Model(2,"model21","model2Detail"));
	}
	public List <Model> getAllModels() {
		return list;
		
	}
	public Model findbyId(int id) {
		for (int i =0 ; i< list.size(); i++) {
			if (list.get(i).getId()==(id)){
				return list.get(i);
				
			}
		}
		return null;
		
	}
	public Model  save(Model m){
		Model model= new Model();
		model.setId(m.getId());
		model.setName(m.getName());
		model.setData(m.getData());
		list.add(model);
		return model;
		
	}
	public List<Model> search(String name){
		return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
		
	}
	public String delete(Integer id) {
		list.removeIf(x -> x.getId()==(id));
		return null;
	}
	public Model update(Model model) {
		int idx=0;
		int id=0;
		for (int i=0; i<list.size();i++) {
			id=model.getId();
			idx=i;
			break;
		}
		Model model1=new Model();
		model1.setId(id);
		model1.setName(model.getName());
		model1.setData(model.getData());
		list.set(idx, model);
		return model1;
		
		
		
	}
	
	

}
