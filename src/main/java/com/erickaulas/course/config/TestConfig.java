package com.erickaulas.course.config;

import com.erickaulas.course.entities.User;
import com.erickaulas.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{

        User u1 = new User(null, "Erick Junior", "erick@gmail.com", "991990673", "123456");
        User u2 = new User(null, "Katia Aprecida Batista", "catiabatista@gmail.com", "991319882", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
