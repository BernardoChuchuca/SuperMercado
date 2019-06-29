/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//import Modelo.Categoria;
import Modelo.Categoria;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Bryan
 */
public class GestionCategorias {
    
    public void InsertarCategorias(Categoria categoria) {
         Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  MER_CATEGORIAS (CAT_ID,"
                   + "CAT_NOMBRE)" //PRO_TIPO,PRO_STOCK,PRO_NACIONALIDAD)"
                    + " VALUES(?,?)"); 
           pst.setInt(1,categoria.getCat_id());
           pst.setString(2,categoria.getCat_nombre());
           /*pst.setString(3,categoria.getTipo());
           pst.setInt(4,categoria.getStock());
           pst.setString(5,categoria.getNacionalidad());*/
         
          
          
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
    public ArrayList<Categoria> getListCategoria(){
        //Producto pro=new Producto();
    ArrayList<Categoria> cate=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT * "
                    + " FROM MER_CATEGORIAS ");
            while(rs.next()){
            Categoria cat=new Categoria();
            cat.setCat_id(rs.getInt("CAT_ID"));
            cat.setCat_nombre(rs.getString("CAT_NOMBRE").trim());
            //cat.setTipo(rs.getString("PRO_TIPO").trim());
            //cat.setStock(rs.getInt("PRO_STOCK"));
             //cat.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            
           
            cate.add(cat);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
       }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return cate;
}
    
    
    public void ActualizarCategoria(Categoria categoria){
        
         Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE MER_CATEGORIAS SET CAT_ID=?,"
                   + "CAT_NOMBRE=? WHERE CAT_ID= '"+categoria.getCat_id()+"'");
            
            pst.setInt(1,categoria.getCat_id());
           pst.setString(2,categoria.getCat_nombre());
          // pst.setString(3,producto.getTipo());
           //pst.setInt(4,producto.getStock());
            //pst.setString(5,producto.getNacionalidad());
           pst.executeQuery();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     public Categoria getBuscarCategoria(int catnom){
      Categoria cat=null;
      Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_CATEGORIAS WHERE CAT_NOMBRE = '"+catnom+"'");
            while (rs.next()) {
            cat=new Categoria();
             
            cat.setCat_id(rs.getInt("CAT_ID"));
            cat.setCat_nombre(rs.getString("CAT_NOMBRE").trim());
            //pro.setTipo(rs.getString("PRO_TIPO").trim());
            //pro.setStock(rs.getInt("PRO_STOCK"));
             //pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return cat;
    }
     
     public void EliminarCategoria(int catId){
         Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MER_CATEGORIAS  "
                    + " WHERE CAT_ID=?");
            pst.setInt(1,catId);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     
     public Categoria getBuscarCategoriaNombre(String catId){
      Categoria cat=null;
      Connection cnx=null;
       try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_CATEGORIAS WHERE  CAT_NOMBRE = '"+catId+"'");
            while (rs.next()) {
            cat=new Categoria();
             
            cat.setCat_id(rs.getInt("CAT_ID"));
            cat.setCat_nombre(rs.getString("CAT_NOMBRE").trim());
            //cat.setTipo(rs.getString("PRO_TIPO").trim());
            //pro.setStock(rs.getInt("PRO_STOCK"));
             //pro.setNacionalidad(rs.getString("PRO_NACIONALIDAD").trim());
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
      }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return cat;
    }
    
    
}
