package com.junit.apitest.service;

import java.util.List;

import com.junit.apitest.model.Player;

public interface PlayerService {
	Player saveDPlayer(Player player);
	List<Player> fetchPlayerList();
	Player updatePlayer(Player player,int jersyid);
	void deletePlayerById(int jersyid);
	
	
}
