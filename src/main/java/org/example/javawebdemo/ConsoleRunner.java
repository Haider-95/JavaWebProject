package org.example.javawebdemo;

import org.example.javawebdemo.models.HockeyPlayer;
import org.example.javawebdemo.models.HockeyPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    HockeyPlayerRepository hockeyPlayerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(hockeyPlayerRepository.count() == 0) {
            HockeyPlayer hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(52);
            hockeyPlayer.setName("Stefan");
            hockeyPlayerRepository.save(hockeyPlayer);

            hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(29);
            hockeyPlayer.setName("Haider");
            hockeyPlayerRepository.save(hockeyPlayer);


        }
        // kolla om count(*) = 0
        // insert into HockeyPlayer
    }
}
