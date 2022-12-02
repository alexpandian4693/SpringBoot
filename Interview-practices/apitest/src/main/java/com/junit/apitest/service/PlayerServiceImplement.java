package com.junit.apitest.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.junit.apitest.Repo.PlayerRepo;
import com.junit.apitest.model.Player;

public class PlayerServiceImplement implements PlayerService {
	@Autowired
	PlayerRepo repo;

	@Override
	public Player saveDPlayer(Player player) {
		// TODO Auto-generated method stub
		return repo.save(player);
	}

	@Override
	public List<Player> fetchPlayerList() {
		// TODO Auto-generated method stub
		return (List<Player>) repo.findAll();
	}

	@Override
	public Player updatePlayer(Player player, int jersyid) {
		Player depDB= repo.findById(jersyid).get();
		if (Objects.nonNull(player.getPlayerName())
				&& !"".equalsIgnoreCase(player.getPlayerName())) {
			depDB.setPlayerName(player.getPlayerName());
			}
		if (Objects.nonNull(player.getTeamname())
				&& !"".equalsIgnoreCase(player.getTeamname())) {
			depDB.setTeamname(player.getTeamname());}
		if (Objects.nonNull(player.getJersycolor())
				&& !"".equalsIgnoreCase(player.getJersycolor())) {
			depDB.setJersycolor(player.getJersycolor());}
		return repo.save(depDB);}
	
	

	@Override
	public void deletePlayerById(int jersyid) {
		repo.deleteById(jersyid);}
	

}
