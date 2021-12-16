package com.cicl4.retos.reto.repository.crud;

import com.cicl4.retos.reto.model.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author rei
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    public Optional <User> findByEmail(String email);
    
    //List<User> findByBirthtDay(Date date);
    
    public Optional<User> findByEmailAndPassword(String email, String password);

    //Optional<User> findTopByOrderByIdDesc();

    //List<User> findByMonthBirthtDay(String monthBirthtDay);
    
    //List<User> findOneByOrderByIdDesc();
    
    //seleccionar el usuario con el ultimo id
    //public Optional<User> findTopByOrderByIdDesc();
}
