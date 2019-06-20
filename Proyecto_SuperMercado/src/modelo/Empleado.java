/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public class Empleado  extends Persona{
       private String  emp_cargo,emp_usuario,emp_contrasena;
       private int emp_id;

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

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

   

    

   
    
}
