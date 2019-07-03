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
import javax.swing.JOptionPane;
import modelo.Persona;

import modelo.Producto;

/**
 *
 * @author Bernardo
 */
public class GestionProductos {
    
    
    public void InsertProductos(Producto producto) {
         Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  MER_PRODUCTOS (PRO_ID,"
                   + "PRO_CODIGO,PRO_NOMBRE,PRO_FECHA_ELABORADO,PRO_FECHA_CADUCIDAD,PRO_PRECIO,"
                    + "PRO_STOCK, PRO_IVA_DISPONIBLE,PRO_DESCUENTO_DISPONIBLE, MER_CATEGORIAS_CAT_ID, MER_PROVEEDORES_PROV_ID,pro_nacionalidad ,pro_marca)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
          pst.setInt(1,producto.getPro_id());
           pst.setString(2,producto.getPro_codigo());
           pst.setString(3,producto.getPro_nombre());
           pst.setDate(4,producto.getPro_fec_elab());
           pst.setDate(5,producto.getPro_fec_cadu());
           pst.setInt(6,producto.getPro_precio());
           pst.setInt(7,producto.getPro_stock());
           pst.setString(8,producto.getPro_iva());
           pst.setDouble(9,producto.getPro_descuento());
           pst.setInt(10,producto.getCat_id());
           pst.setInt(11, producto.getProv_id());
         pst.setString(12, producto.getPro_nacionalidad());
          
           pst.setString(13,producto.getPro_marca());
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
    public ArrayList<Producto> getListProducto(){
        //Producto pro=new Producto();
    ArrayList<Producto> prod=new ArrayList<>();
       Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_PRODUCTOS ");
            while(rs.next()){
            Producto pro=new Producto();
            pro.setPro_id(rs.getInt("PRO_ID"));
            pro.setPro_codigo(rs.getString("PRO_CODIGO").trim());
            pro.setPro_nombre(rs.getString("PRO_NOMBRE").trim());
            pro.setPro_fec_elab(rs.getDate("PRO_FECHA_ELABORADO"));
            pro.setPro_fec_cadu(rs.getDate("PRO_FECHA_CADUCIDAD"));
            pro.setPro_precio(rs.getInt("PRO_PRECIO"));
            pro.setPro_stock(rs.getInt("PRO_STOCK"));
            pro.setPro_iva(rs.getString("PRO_IVA_DISPONIBLE").trim());
            pro.setPro_descuento(rs.getDouble("PRO_DESCUENTO_DISPONIBLE"));
            pro.setCat_id(rs.getInt("MER_CATEGORIAS_CAT_ID"));
            pro.setProv_id(rs.getInt("MER_PROVEEDORES_PROV_ID"));
            pro.setPro_nacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            pro.setPro_marca(rs.getString("PRO_MARCA").trim());
            prod.add(pro);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado productos");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prod;
}
    
   
     public void ActualizarProducto(Producto producto){
         Connection cnx=null;
        try {
            cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE MER_PRODUCTOS SET PRO_ID=?,"
                   + "PRO_CODIGO=?, PRO_NOMBRE=?,PRO_FECHA_ELABORADO=?,PRO_FECHA_CADUCIDAD=?,PRO_PRECIO=?,"
                    + "PRO_STOCK=?, PRO_IVA_DISPONIBLE=?,PRO_DESCUENTO_DISPONIBLE=?, MER_CATEGORIAS_CAT_ID=?, MER_PROVEEDORES_PROV_ID=? ,PRO_NACIONALIDAD=?,PRO_MARCA=? WHERE PRO_ID= '"+producto.getPro_id()+"'");
            
           pst.setInt(1,producto.getPro_id());
           pst.setString(2,producto.getPro_codigo());
           pst.setString(3,producto.getPro_nombre());
           pst.setDate(4,producto.getPro_fec_elab());
           pst.setDate(5,producto.getPro_fec_cadu());
           pst.setInt(7,producto.getPro_precio());
           pst.setInt(8,producto.getPro_stock());
           pst.setString(9,producto.getPro_iva());
           pst.setDouble(10,producto.getPro_descuento());
           pst.setInt(11,producto.getCat_id());
           pst.setInt(12, producto.getProv_id());
           pst.setString(13,producto.getPro_nacionalidad());
           pst.setString(6,producto.getPro_marca());
           pst.executeQuery();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error AL ACTULIZAR PROOOOO");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     public Producto getBuscarPoductoNombre(String nombre){
      Producto pro=null;
      Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
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
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return pro;
    }
     
      public Producto getBuscarPoductoid(int id){
      Producto pro=null;
      Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PRODUCTOS WHERE PRO_ID= '"+id+"'");
            while (rs.next()) {
            pro=new Producto();
            
             
           pro.setPro_id(rs.getInt("PRO_ID"));
            pro.setPro_codigo(rs.getString("PRO_CODIGO").trim());
            pro.setPro_nombre(rs.getString("PRO_NOMBRE").trim());
            pro.setPro_fec_elab(rs.getDate("PRO_FECHA_ELABORADO"));
            pro.setPro_fec_cadu(rs.getDate("PRO_FECHA_CADUCIDAD"));
            pro.setPro_precio(rs.getInt("PRO_PRECIO"));
            pro.setPro_stock(rs.getInt("PRO_STOCK"));
            pro.setPro_iva(rs.getString("PRO_IVA_DISPONIBLE").trim());
            pro.setPro_descuento(rs.getDouble("PRO_DESCUENTO_DISPONIBLE"));
            pro.setCat_id(rs.getInt("MER_CATEGORIAS_CAT_ID"));
            pro.setProv_id(rs.getInt("MER_PROVEEDORES_PROV_ID"));
            pro.setPro_nacionalidad(rs.getString("PRO_NACIONALIDAD"));
             pro.setPro_marca(rs.getString("PRO_MARCA").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return pro;
    }
     
     public void EliminarProducto(int proId){
         
         Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MER_PRODUCTOS  "
                    + " WHERE PRO_ID=?");
            pst.setInt(1,proId);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     
     public int  proids(){
       ArrayList<Producto>list1=new GestionProductos().getListProducto();
       int num=list1.size()-1;
       int id=list1.get(num).getPro_id()+1;
        

      return id;
     }
     
     
     
}
