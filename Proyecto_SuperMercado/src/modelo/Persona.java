/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bernardo
 */
public class Persona {
    private  String per_nombre,per_apellido,per_cedula,per_direccion,per_telefono;
     private String  emp_cargo,correo,emp_usuario,emp_contrasena;

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }
     

    public String getEmp_cargo() {
        return emp_cargo;
    }

    public void setEmp_cargo(String emp_cargo) {
        this.emp_cargo = emp_cargo;
    }

    public String getEmp_usuario() {
        return emp_usuario;
    }

    public void setEmp_usuario(String emp_usuario) {
        this.emp_usuario = emp_usuario;
    }

    public String getEmp_contrasena() {
        return emp_contrasena;
    }

    public void setEmp_contrasena(String emp_contrasena) {
        this.emp_contrasena = emp_contrasena;
    }
    private int  per_id,per_edad;

    public int getPer_edad() {
        return per_edad;
    }

    public void setPer_edad(int per_edad) {
        this.per_edad = per_edad;
    }
    

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }
    

   
   
    
} 
    
    
   