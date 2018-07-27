package com.example.demo.services;

import com.example.demo.utilities.RoleRepository;
import com.example.demo.utilities.UserRepository;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public  void run(String... strings) throws Exception {
        System.out.println("Loading data . . .");

        //Trys to find a role
        Role adminRole = roleRepository.findByRole("ADMIN");
       // Role userRole = roleRepository.findByRole("USER");
        //If role does not exist then the role is added
        if (adminRole == null) {
            roleRepository.save(new Role("USER"));
            roleRepository.save(new Role("ADMIN"));
        }
        User user = new User("admin@secure.com",passwordEncoder.encode("password"),"Admin","User", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        if(userRepository.findByUsername("admin")==null) {
            userRepository.save(user);
        }
    }
}