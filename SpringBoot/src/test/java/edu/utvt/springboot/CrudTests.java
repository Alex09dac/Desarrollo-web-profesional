package edu.utvt.springboot;


import edu.utvt.springboot.data.entities.Player;
import edu.utvt.springboot.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class CrudTests {

    Logger LOGGER = LoggerFactory.getLogger(CrudTests.class);


    @Autowired
    private PlayerRepository PlayerRepository;

    @Test
    void addPlayer() {

        Player player = new Player(null, 0, "El chicharito", "Las chivas", "c", 100, 5.0 );
        this.PlayerRepository.save(player);
        Assertions.assertNotNull(player.getId(), ()->"The player id is null");
        System.out.println(player.toString());
    }

    @Test
    void updatePlayer() {

        Player player = null;
        Integer currentAge = 0;

        player = this.PlayerRepository.findAll().getFirst();
        Assertions.assertNotNull(player, "The player must not be null");

        currentAge = player.getAge();
        player.setAge(currentAge + 1);
        this.PlayerRepository.save(player);

        this.LOGGER.info(" Player has been update " + player);
        Assertions.assertTrue(player.getAge() >currentAge,() ->"The player age is less than the current age");
    }

    @Test
    void deletePlayer() {
        Player player = null;

        player = this.PlayerRepository.findAll().getLast();
        this.PlayerRepository.delete(player);

        player = this.PlayerRepository.findById(player.getId()).orElse(null);
        Assertions.assertNull(player, () ->"The player is null");
        this.LOGGER.info(" Player has been deleted " + player);


    }
}
