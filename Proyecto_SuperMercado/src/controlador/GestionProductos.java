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

import modelo.Producto;

/**
 *
 * @author Bernardo
 */
public class GestionProductos {
    
    
   /* public void InsertProductos(Producto producto) {
         
    
        try {
            Connection cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  VET_PRODUCTOS (PRO_ID,"
                   + "PRO_NOMBRE, PRO_TIPO,PRO_STOCK,PRO_NACIONALIDAD)"
                    + " VALUES(?,?,?,?,?)"); 
           pst.setInt(1,producto.getPro_id());
           pst.setString(2,producto.getNombre());
           pst.setString(3,producto.getTipo());
           pst.setInt(4,producto.getStock());
           pst.setString(5,producto.getNacionalidad());
         
          
          
           pst.executeQuery();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
  }
}*/
    public ArrayList<Producto> getListProducto(){
        //Producto pro=new Producto();
    ArrayList<Producto> prod=new ArrayList<>();
        try {
            Connection ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_PRODUCTOS ");
            while(rs.next()){
            Producto pro=new Producto();
            pro.setPro_id(rs.getInt("PRO_ID"));
            pro.setPro_codigo(rs.getString("PRO_CODIGO").trim());
            pro.setPro_nombre(rs.getString("PRO_NOMBRE").trim());
            pro.setPro_fec_elab(rs.getDate("PRO_FECHA_ELABORADO"));
            pro.setPro_fec_elab(rs.getDate("PRO_FECHA_CADUCIDAD"));
            pro.setPro_marca(rs.getString("PRO_MARCA").trim());
            pro.setPro_precio(rs.getInt("PRO_PRECIO"));
            pro.setPro_stock(rs.getInt("PRO_STOCK"));
            pro.setPro_iva(rs.getString("PRO_IVA_DISPONIBLE").trim());
            pro.setPro_descuento(rs.getDouble("PRO_DESCUENTO_DISPONIBLE"));
            pro.setCat_id(rs.getInt("MER_CATEGORIAS_CAT_ID"));
            pro.setProv_id(rs.getInt("MER_PROVEEDORES_PROV_ID"));
           
            prod.add(pro);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado zxzx");
        }
    return prod;
}
    
   /* 
    public void ActualizarProducto(Producto producto){
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE VET_PRODUCTOS SET PRO_ID=?,"
                   + "PRO_NOMBRE=?, PRO_TIPO=?,PRO_NACIONALIDAD=?,PRO_STOCK=? WHERE PRO_ID= '"+producto.getPro_id()+"'");
            pst.setInt(1,producto.getPro_id());
           pst.setString(2,producto.getNombre());
           pst.setString(3,producto.getTipo());
           pst.setInt(4,producto.getStock());
            pst.setString(5,producto.getNacionalidad());
           pst.executeQuery();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
     }
     */
     public Producto getBuscarPoductoNombre(String nombre){
      Producto pro=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PRODUCTOS WHERE PRO_NOMBRE= '"+nombre+"'");
            while (rs.next()) {
            pro=new Producto();
            
             
            pro.setPro_id(rs.getInt("PRO_ID"));
           /* pro.setNombre(rs.getString("PRO_NOMBRE").trim());
            pro.setTipo(rs.getString("PRO_TIPO").trim());
            pro.setStock(rs.getInt("PRO_STOCK"));
             pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());*/
           pro.setPro_precio(rs.getInt("PRO_PRECIO"));
           pro.setPro_descuento(rs.getDouble("PRO_DESCUENTO_DISPONIBLE"));
           pro.setPro_iva(rs.getString("PRO_IVA_DISPONIBLE"));
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return pro;
    }
     
      public Producto getBuscarPoductoid(int id){
      Producto pro=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PRODUCTOS WHERE PRO_ID= '"+id+"'");
            while (rs.next()) {
            pro=new Producto();
            
             
            pro.setPro_id(rs.getInt("PRO_ID"));
            pro.setPro_nombre(rs.getString("PRO_NOMBRE").trim());
            /*pro.setTipo(rs.getString("PRO_TIPO").trim());
            pro.setStock(rs.getInt("PRO_STOCK"));
             pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());*/
           pro.setPro_precio(rs.getInt("PRO_PRECIO"));
           pro.setPro_descuento(rs.getDouble("PRO_DESCUENTO_DISPONIBLE"));
           pro.setPro_iva(rs.getString("PRO_IVA_DISPONIBLE"));
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return pro;
    }
     /*
     public void EliminarProducto(int proId){
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM VET_PRODUCTOs  "
                    + " WHERE PRO_ID=?");
            pst.setInt(1,proId);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
     }
     
     
     public Producto getBuscarPoductoNombre(String proId){
      Producto pro=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM VET_PRODUCTOS WHERE  PRO_NOMBRE = '"+proId+"'");
            while (rs.next()) {
            pro=new Producto();
             
            pro.setPro_id(rs.getInt("PRO_ID"));
            pro.setNombre(rs.getString("PRO_NOMBRE").trim());
            pro.setTipo(rs.getString("PRO_TIPO").trim());
            pro.setStock(rs.getInt("PRO_STOCK"));
             pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return pro;
    }
    */
}
