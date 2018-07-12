package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public  void run(String... strings) throws Exception {
        System.out.println("Loading data . . .");
        Random rand =new Random();
        String y="";
        int x= rand.nextInt(1000);
        if(x<=500){
            y="!*";
        }else if(x>500){
            y="!!";
        }else{
            y="**";
        }
        String password="password"+x+y;

        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));

        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("USER");

        User user = new User("admin@secure.com",password,"Admin","User", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        user = new User("sam@every.com","password","Sam","Everyman", true, "everyman");
        user.setRoles(Arrays.asList(userRole, adminRole));
        userRepository.save(user);

        System.out.println(password);
    }
}