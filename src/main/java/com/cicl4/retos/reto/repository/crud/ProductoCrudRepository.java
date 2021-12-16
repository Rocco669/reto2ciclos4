/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cicl4.retos.reto.repository.crud;

import com.cicl4.retos.reto.model.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author rei
 */
public interface ProductoCrudRepository extends MongoRepository<Productos, Integer>{
    
}
