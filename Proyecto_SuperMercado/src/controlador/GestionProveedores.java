/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedor;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class GestionProveedores {
    
    public void InsertarProveedores(Proveedor proveedor) {
         
        Connection cnx=null;
        try {
             cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  MER_PROVEEDORES (PROV_ID,"
                   + "PROV_RUC, PROV_NOMBRE_EMPRESA)"
                    + " VALUES(?,?,?,?)"); 
           pst.setInt(1,proveedor.getProv_id());
           pst.setString(2,proveedor.getProv_ruc());
           pst.setString(3,proveedor.getProv_nombre_empresa());
           //pst.setInt(4,proveedor.getProv_cantidad());
           //pst.setString(5,proveedor.getNacionalidad());
         
          
          
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
    public ArrayList<Proveedor> getListProveedor(){
        //Producto pro=new Producto();
    ArrayList<Proveedor> prov=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT * "
                    + " FROM MER_PROVEEDORES ");
            while(rs.next()){
            Proveedor prove =new Proveedor();
            prove.setProv_id(rs.getInt("PROV_ID"));
            prove.setProv_ruc(rs.getString("PROV_RUC").trim());
            prove.setProv_nombre_empresa(rs.getString("PROV_NOMBRE_EMPRESA").trim());
            //prove.setProv_cantidad(rs.getInt("PROV_CANTIDAD"));
            // prove.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            
           
            prov.add(prove);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prov;
}
    
    
    public void ActualizarProvedores(Proveedor proveedor){
        Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE MER_PROVEEDORES SET PROV_ID=?,"
                   + "PROV_RUC=?, PROV_NOMBRE_EMPRESA=? WHERE PROV_ID= '"+proveedor.getProv_id()+"'");
            pst.setInt(1,proveedor.getProv_id());
           pst.setString(2,proveedor.getProv_ruc());
           pst.setString(3,proveedor.getProv_nombre_empresa());
          // pst.setInt(4,proveedor.getProv_cantidad());
            //pst.setString(5,proveedor.getNacionalidad());
           pst.executeQuery();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     public Proveedor getBuscarProveedores(String nom){
      Proveedor prov=null;
      Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PROVEEDORES WHERE PROV_NOMBRE_EMPRESA = '"+nom+"'");
            while (rs.next()) {
            prov=new Proveedor();
             
            prov.setProv_id(rs.getInt("PROV_ID"));
            prov.setProv_ruc(rs.getString("PROV_RUC").trim());
            prov.setProv_nombre_empresa(rs.getString("PROV_NOMBRE_EMPRESA").trim());
            //prov.setProv_cantidad(rs.getInt("PROV_CANTIDAD"));
            // pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prov;
    }
     
     public void EliminarProveedores(int provId){
         Connection cnx=null;
        try {
            cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MER_PROVEEDORES  "
                    + " WHERE PROV_ID=?");
            pst.setInt(1,provId);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     
     public Proveedor getBuscarProveedorNombre(String provId){
      Proveedor prov=null;
      Connection cnx=null;
       try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PROVEEDORES WHERE  PROV_NOMBRE_EMPRESA = '"+provId+"'");
            while (rs.next()) {
            prov=new Proveedor();
             
            prov.setProv_id(rs.getInt("PROV_ID"));
            prov.setProv_ruc(rs.getString("PROV_RUC").trim());
            prov.setProv_nombre_empresa(rs.getString("PROV_NOMBRE_EMPRESA").trim());
            //prov.setProv_cantidad(rs.getInt("PROV_CANTIDAD"));
             //prov.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prov;
    }
}
