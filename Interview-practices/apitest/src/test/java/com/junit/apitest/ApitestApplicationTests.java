package com.junit.apitest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import com.junit.apitest.Repo.PlayerRepo;
import com.junit.apitest.model.Player;

import ch.qos.logback.core.model.Model;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ApitestApplicationTests {
	@Autowired
	PlayerRepo repo;

	@Test
	void contextLoads() {
	}
	@Test
	@Order(1)
	public void testCreate () {
		Player cp = new Player();
		cp.setJersyid(0);
		cp.setPlayerName("MSD");
		cp.setTeamname("CSK");
		cp.setJersycolor("YELLOW");
		cp.setNoOfmatches(120);		
		
	}
	@Test
	@Order(2)
	public void testReadAll () {
		List list = repo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	@Order(3)
	public void testRead () {
		Player product = repo.findById(1).get();
		assertEquals("MSD", product.getPlayerName());
	}
	@Test
	@Order(4)
	public void testUpdate () {
		Player p = repo.findById(1).get();
		
		p.setNoOfmatches(370);
		repo.save(p);
		assertNotEquals(700, repo.findById(1).get().getNoOfmatches());
	}
	@Test
	@Order(5)
	public void testDelete () {
		repo.deleteById(1);
		assertThat(repo.existsById(1)).isFalse();
	}
	

}
