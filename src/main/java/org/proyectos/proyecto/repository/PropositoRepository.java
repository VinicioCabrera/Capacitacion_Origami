/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyectos.proyecto.repository;

import org.proyectos.proyecto.entity.Proposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author campo
 */
@Repository
public interface PropositoRepository extends JpaRepository<Proposito, Integer>{
    
}
