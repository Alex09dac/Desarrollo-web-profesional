package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Player;
import edu.utvt.springboot.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
public class JPAQueryMethods {
    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void findByFullName() {
        String fullName = "Alejandro Cirilo Florencio";
        playerRepository.findByFullname(fullName).forEach(System.out::println);
    }

    @Test
    void findByFullNameContaining() {
        String name = "Alejandro";
        this.playerRepository.findByFullnameContaining(name).forEach(System.out::println);
    }

    @Test
    void findByTeamAndAge() {
        String team = "Uta";
        Integer age = 21;

        this.playerRepository.findByTeamAndAge(team, age).forEach(System.out::println);
    }

    @Test
    void findByTeamAndPeageble() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Player> page = this.playerRepository.findByTeam("Cha", pageable);
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
