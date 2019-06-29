/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Persona;



/**
 *
 * @author Bernardo
 */
public class GestionPersonas {
    public ArrayList<Persona> getListPersonas(){
     
    ArrayList<Persona> us=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_PERSONAS ");
            while(rs.next()){
            Persona per=new Persona();
            per.setPer_id(rs.getInt("PER_ID"));
            
            per.setPer_cedula(rs.getString("PER_CEDULA").trim());
            per.setPer_nombre(rs.getString("PER_NOMBRE").trim());
            per.setPer_apellido(rs.getString("PER_APELLIDO").trim());
            per.setPer_direccion(rs.getString("PER_DIRECCION").trim());
            per.setPer_telefono(rs.getString("PER_TELEFONO").trim());
             per.setEmp_cargo(rs.getString("PER_TIPO").trim());
            per.setPer_edad(rs.getInt("PER_EDAD"));
            per.setCorreo(rs.getString("PER_CORREO"));
            per.setEmp_usuario(rs.getString("PER_USER").trim());
            per.setEmp_contrasena(rs.getString("PER_CLAVE").trim());
            
           
            
            
            us.add(per);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return us;
    }
    
     public void InsertPersona(Persona persona) {
          Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO MER_PERSONAS (PER_ID,"
                   + " PER_CEDULA, PER_NOMBRE, PER_APELLIDO, PER_DIRECCION, PER_TELEFONO, PER_TIPO,"
                   + "  PER_EDAD, PER_CORREO, PER_USER, PER_CLAVE )"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?)"); 
           pst.setInt(1,persona.getPer_id());
           pst.setString(2,persona.getPer_cedula());
           pst.setString(3,persona.getPer_nombre());
           pst.setString(4,persona.getPer_apellido());
           pst.setString(5,persona.getPer_direccion());
           pst.setString(6,persona.getPer_telefono());
          pst.setString(7, persona.getEmp_cargo());
          pst.setInt(8, persona.getPer_edad());
          pst.setString(9,persona.getCorreo());
           pst.setString(10,persona.getEmp_usuario());
           pst.setString(11,persona.getEmp_contrasena());
          
          
          
           pst.executeQuery();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
  }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
}
    /*public Persona getBuscarCliente(String codCli){
    Persona cl=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PERSONAS WHERE PER_ID = '"+codCli+"'");
            while (rs.next()) {
             cl=new Persona();
             cl.setPer_id(rs.getInt("PER_ID"));
             cl.setPer_cedula(rs.getString("PER_CEDULA"));
             cl.setPer_nombre(rs.getString("PER_NOMBRE"));
             cl.setPer_apellido(rs.getString("PER_APELLIDO"));
             cl.setPer_direccion(rs.getString("PER_DIRECCION"));
             cl.setPer_telefono(rs.getString("PER_TELEFONO"));
             cl.setPer_edad(rs.getInt("PER_EDAD"));
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return cl;
    }*/
    public Persona getBuscarCedula(String ced){
    Persona cl=null;
    Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PERSONAS WHERE PER_CEDULA = '"+ced+"'");
            while (rs.next()) {
             cl=new Persona();
             cl.setPer_id(rs.getInt("PER_ID"));
             cl.setPer_cedula(rs.getString("PER_CEDULA"));
             cl.setPer_nombre(rs.getString("PER_NOMBRE"));
             cl.setPer_apellido(rs.getString("PER_APELLIDO"));
             cl.setPer_direccion(rs.getString("PER_DIRECCION"));
             cl.setPer_telefono(rs.getString("PER_TELEFONO"));
             cl.setPer_edad(rs.getInt("PER_EDAD"));
             cl.setCorreo(rs.getString("PER_CORREO"));
             cl.setEmp_usuario(rs.getString("PER_USER"));
             cl.setEmp_cargo(rs.getString("PER_TIPO"));
             cl.setEmp_contrasena(rs.getString("PER_CLAVE"));
             
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return cl;
    }
    
    
    
    
    public void ActualizarPersona( Persona persona){
          Connection cnx=null;
        try{
           cnx= Conexion.getConnection();
            PreparedStatement pst=cnx.prepareStatement(" UPDATE MER_PERSONAS SET "
            +" PER_CEDULA=?,PER_NOMBRE=?,PER_APELLIDO=?,PER_DIRECCION=?,PER_TELEFONO=?,PER_TIPO=?,PER_EDAD=?,PER_CORREO=?,PER_USER=?,PER_CLAVE=? WHERE PER_CEDULA='"+persona.getPer_cedula()+"'");
            //pst.setInt(1,persona.getPer_id());
           pst.setString(1,persona.getPer_cedula());
           pst.setString(2,persona.getPer_nombre());
           pst.setString(3,persona.getPer_apellido());
           pst.setString(4,persona.getPer_direccion());
           pst.setString(5,persona.getPer_telefono());
          pst.setString(6, persona.getEmp_cargo());
          pst.setInt(7, persona.getPer_edad());
          pst.setString(8,persona.getCorreo());
           pst.setString(9,persona.getEmp_usuario());
           pst.setString(10,persona.getEmp_contrasena());
           pst.executeQuery();
           
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
             System.out.println("Error en Actualizar Dato mmmmmmmmmmm");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    }
    
    public void EliminarPersona(String cedula){
        
        Connection cnx=null;
        try{
             cnx= Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MER_PERSONAS "
            +" WHERE PER_CEDULA=?");
            pst.setString(1, cedula);
            pst.executeQuery();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar Datos....................");
            
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
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
