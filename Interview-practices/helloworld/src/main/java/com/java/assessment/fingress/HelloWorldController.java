package com.java.assessment.fingress;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.authenticator.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.data.Model;
import com.java.data.ModelService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private ModelService service;

	Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	@Value("${SMTP_USER_PORT:-1}")
	private String SMTP_SERVER_PORT;
	@Value("${Name}")
	String name;

	@Value("${app.name}")
	private String AppName;

	@GetMapping(value = "url")
	private String getApplication() {
		LOG.info(AppName);

		return AppName;
	}

	@GetMapping(path = "/echo/{name}")
	public String sayHello(String name) {
		StringBuilder str = new StringBuilder();
		LOG.info("It is the name for the post method" + name);
		str.append("fingress");

		return str.toString();

	}

	@PostMapping("/post/{name}")
	public String saveText(String name) {

		StringBuilder str = new StringBuilder();
		LOG.info("It is the name for the post method=" + name);
		str.append("fingress");

		return str.toString();

	}

	@PutMapping("/put/{string}")

	public String AlterName(String name) {
		StringBuilder str = new StringBuilder();
		LOG.info("name for the put method=" + name);
		str.append("Altere");

		return str.toString();

	}
	
	@DeleteMapping("/delete/{string}")

	public String deleteName(String name) {
		StringBuilder str = new StringBuilder();
		LOG.info("name for the put method=" + name);
		str.append("Deleted");

		return str.toString();

	}

	@GetMapping("/data")
	public ArrayList<Model> get() {

		ArrayList<Model> arr = new ArrayList<>();

		Model userOne = new Model();
		userOne.setId(1);
		userOne.setName("MSD");
		userOne.setData("batsman");

		arr.add(userOne);

		return arr;
	}
	@PostMapping
	public Model addproduct(@RequestBody Model model)
	{
		return service.SaveModel(model);
	}
	@GetMapping
	public List<Model> findbyallModel(){
		return service.getModels();
	}
	@GetMapping("{id}")
	public Model findModelbyId(@PathVariable int id) {
		return service.getModelbyId(id);
		
	}
	@PutMapping
	public Model Updatemodel(@RequestBody Model model) {
		return service.Updatemodel(model);
	}
	@DeleteMapping("{id}")
	public String deletemodel(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
