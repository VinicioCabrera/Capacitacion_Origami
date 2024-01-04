/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.resource;

import org.proyectos.proyecto.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campo
 */
@RestController
public class PersonaResource {
    @Autowired//inyectar
    private PersonaService service;
            
    @RequestMapping(value = "consultarPersona", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPersona() {
        return new ResponseEntity<>(service.consultarPersonas(), HttpStatus.OK);
}   
}
