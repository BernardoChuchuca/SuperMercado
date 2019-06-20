/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Persona;


/**
 *
 * @author Bernardo
 */
public class GestionEmpleados {
   
    /*public ArrayList<Empleado> getListEmpleado(){
        
    ArrayList<Empleado> os=new ArrayList<>();
        try {
            Connection ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_EMPLEADOS ");
            while(rs.next()){
            Empleado  emp =new Empleado();
            emp.setEmp_id(rs.getInt("EMP_ID"));
            
            emp.setEmp_usuario(rs.getString("EMP_USUARIO").trim());
            emp.setEmp_cargo(rs.getString("EMP_CARGO").trim());
            emp.setEmp_contrasena(rs.getString("EMP_CONTRASEÑA").trim());
            emp.setPer_id(rs.getInt("MER_PERSONAS_PER_ID"));
           
            emp.setPer_cedula(per.getPer_cedula());
            emp.setPer_nombre(per.getPer_nombre());
            emp.setPer_apellido(per.getPer_apellido());
            emp.setPer_direccion(per.getPer_direccion());
            emp.setPer_telefono(per.getPer_telefono());
            emp.setPer_edad(per.getPer_edad());
           
            
            
            os.add(emp);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }
    return os;
    }*/
    
     public void Insertarempleados(Empleado personal) {
         
    
        try {
            Connection cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO MER_EMPLEADOS (EMP_ID,"
                   + " EMP_CARGO, MER_PERSONAS_PER_ID, EMP_USUARIO, EMP_CONTRASEÑA)"
                    + " VALUES(?,?,?,?,?)"); 
           pst.setInt(1,personal.getEmp_id());
           pst.setString(2,personal.getEmp_cargo());
           pst.setInt(3,personal.getPer_id());
           pst.setString(4,personal.getEmp_usuario());
           pst.setString(5,personal.getEmp_contrasena());
           
          
          
          
           pst.executeQuery();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos mmmmmm");
        }finally{
        }    
  }

    
      public void ActualizarEmpleado(Empleado personal){
          
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE MER_EMPLEADOS SET "
                    + " EMP_ID=?,EMP_CARGO=?,MER_PERSONAS_PER_ID=?,EMP_USUARIO=?,EMP_CONTRASEÑA=?  WHERE MER_PERSONAS_PER_ID= '"+personal.getPer_id()+"'");
            pst.setInt(1, personal.getEmp_id());
            pst.setString(2, personal.getEmp_cargo());
            pst.setInt(3, personal.getPer_id());
            pst.setString(4,personal.getEmp_usuario());
            pst.setString(5,personal.getEmp_contrasena());
            
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
     }
     
     public Empleado getBuscarEmpleado(String codemp){
      Empleado cl=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_EMPLEADOS WHERE MER_PERSONAS_PER_ID = '"+codemp+"'");
            while (rs.next()) {
             cl=new Empleado();
             cl.setEmp_id(rs.getInt("EMP_ID"));
              cl.setEmp_cargo(rs.getString("EMP_CARGO"));
              cl.setPer_id(rs.getInt("MER_PERSONAS_PER_ID"));
             cl.setEmp_usuario(rs.getString("EMP_USUARIO"));
             cl.setEmp_contrasena(rs.getString("EMP_CONTRASEÑA"));
            
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return cl;
    }
     
     public void EliminarEmpleado(String codigo){
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MER_EMPLEADOS  "
                    + " WHERE EMP_ID=?");
            pst.setString(1, codigo);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
     }
     
     
    public boolean comparar(int num,ArrayList<Integer>list){
      boolean res=false;
        for (int i = 0; i < list.size(); i++) {
             if(list.get(i)==num){
                res=true;
                break;
            
             
             }
            
        }
      return res;
    
    }
    
}
