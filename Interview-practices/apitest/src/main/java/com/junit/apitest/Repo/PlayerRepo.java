package com.junit.apitest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.apitest.model.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer> {

}
