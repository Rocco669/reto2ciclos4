package com.cicl4.retos.reto;

import com.cicl4.retos.reto.model.User;
import com.cicl4.retos.reto.repository.crud.ProductoCrudRepository;
import com.cicl4.retos.reto.repository.crud.UserCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoApplication implements CommandLineRunner{
    
    @Autowired
    private UserCrudRepository userRepo;
    @Autowired
    private ProductoCrudRepository productoRepo;
    
    public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
