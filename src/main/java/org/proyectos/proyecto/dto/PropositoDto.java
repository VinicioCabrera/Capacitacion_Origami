/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyectos.proyecto.dto;

import org.proyecto.ProyectoApplication;
import org.proyectos.proyecto.entity.Proyecto;

/**
 *
 * @author campo
 */
public class PropositoDto {
    private Integer id;
    private Long objetivoId;
    private String indicador;
    private String formaCalculo;
    private String medioVerificacion;
    private Proyecto proyecto;

    public PropositoDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getObjetivoId() {
        return objetivoId;
    }

    public void setObjetivoId(Long objetivoId) {
        this.objetivoId = objetivoId;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getFormaCalculo() {
        return formaCalculo;
    }

    public void setFormaCalculo(String formaCalculo) {
        this.formaCalculo = formaCalculo;
    }

    public String getMedioVerificacion() {
        return medioVerificacion;
    }

    public void setMedioVerificacion(String medioVerificacion) {
        this.medioVerificacion = medioVerificacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    
    
}
