/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jlc.Entity;

/**
 *
 * @author Joan
 */

//PERSONA V1
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import lombok.Getter;
//import lombok.Setter;
////import javax.persistence.Entity;
//
//@Getter @Setter
//@Entity
//public class Persona {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @NotNull
//    @Size(min = 1, max = 50, message = "Nombre no cumple con la longitud")
//    private String nombre;
//    
//    @NotNull
//    @Size(min = 1, max = 50, message = "Apellido no cumple con la longitud")
//    private String apellido;
//    
//    @Size(min = 1, max = 50, message = "Img no cumple con la longitud")
//    private String img;
//
////    public Long getId() {
////        return id;
////    }
////
////    public void setId(Long id) {
////        this.id = id;
////    }
////
////    public String getNombre() {
////        return nombre;
////    }
////
////    public void setNombre(String nombre) {
////        this.nombre = nombre;
////    }
////
////    public String getApellido() {
////        return apellido;
////    }
////
////    public void setApellido(String apellido) {
////        this.apellido = apellido;
////    }
////
////    public String getImg() {
////        return img;
////    }
////
////    public void setImg(String img) {
////        this.img = img;
////    }
//    
//    
//}


//PERSONA V2

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    private String img;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}