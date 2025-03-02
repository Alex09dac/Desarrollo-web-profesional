package edu.utvt.springboot.data.services;

import edu.utvt.springboot.data.entities.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    public Player save(Player player);

    public Player update(Player player);

    Player update(Player player, Long playerId);

    public Optional<Player> findById(long playerId);

    public List<Player> findAll();

    public Player deleteById(Long playerId);

}
