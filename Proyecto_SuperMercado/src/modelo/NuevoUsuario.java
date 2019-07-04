/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author john
 */
public class NuevoUsuario {
    
     private String contrasena; 
    private String user;

    public NuevoUsuario(String contrasena, String user) {
        this.contrasena = contrasena;
        this.user = user;
    }

    public NuevoUsuario() {
       
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}


