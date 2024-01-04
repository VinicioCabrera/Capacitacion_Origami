/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.resource;

import org.proyectos.proyecto.dto.PropositoDto;
import org.proyectos.proyecto.services.PropositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campo
 */
@RestController
public class PropositoResource {

    @Autowired//inyectar
    private PropositoService PropositoService;

    @RequestMapping(value = "consultarProposito", method = RequestMethod.GET)
    public ResponseEntity<?> consultarProposito() {
        return new ResponseEntity<>(PropositoService.consultarProposito(), HttpStatus.OK);
    }

    @RequestMapping(value = "guardarProposito", method = RequestMethod.POST)
    public ResponseEntity<?> guardarProposito(@RequestBody PropositoDto dto) {
        return new ResponseEntity<>(PropositoService.guardarProposito(dto), HttpStatus.OK);
    }
}
