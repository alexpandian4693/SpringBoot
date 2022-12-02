package com.junit.apitest.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.junit.apitest.Repo.PlayerRepo;
import com.junit.apitest.service.PlayerService;


public class PlayerController {
	@Autowired
	private PlayerService serv;
	@PostMapping("save")
	public Player savePLayer(@RequestBody Player player ) {
		return serv.saveDPlayer(player);
		
	}
	@GetMapping("/players")
	public List<Player> fetchPlayerList()
	{
		return serv.fetchPlayerList();}
	
	@PutMapping("/players/{id}")
	public Player UpdatePlayer(@RequestBody Player player, @PathVariable ("id")int jersyid) {
		return serv.updatePlayer(player, jersyid);
		
	}
	@DeleteMapping ("/player/{}id")
	public String deletePlayerById(@PathVariable ("id")int jersyid) {
		serv.deletePlayerById(jersyid);
		return "Player Deleted Successfully";
		
	}
	
	

}
