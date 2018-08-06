package com.example.june.servises;


import com.example.june.entities.Player;
import com.example.june.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    // ①
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findOne(Long id) {
        //return playerRepository.findOne((Long)id);
        return null;
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void delete(Long id) {
        playerRepository.deleteAll();
    }
}