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
import modelo.Registro_Productos;

/**
 *
 * @author Bernardo
 */
public class Gestion_Registro_Productos {
     public void InsertRegistroProductos(Registro_Productos producto) {
         Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  MER_REGISTROS_PRODUCTOS (REG_ID,"
                   + "REG_FECHA,REG_CANTIDAD,MER_PRODUCTOS_PRO_ID,REG_NUMERO_FACTURA,MER_PROVEEDORES_PROV_ID)"
                   
                    + " VALUES(?,?,?,?,?,?)"); 
          pst.setInt(1,producto.getReg_id());
           pst.setDate(2,producto.getFecha_compra());
           pst.setInt(3,producto.getReg_cantidad());
           pst.setInt(4,producto.getPro_id());
           pst.setInt(5,producto.getReg_num_fac());
           pst.setInt(6,producto.getProv_id());
       
         
        
           pst.executeQuery();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos RP");
       }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
        
         public ArrayList<Registro_Productos> getListCompraProducto(){
        //Producto pro=new Producto();
    ArrayList<Registro_Productos> prod=new ArrayList<>();
       Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_REGISTROS_PRODUCTOS ");
            while(rs.next()){
            Registro_Productos pro=new Registro_Productos();
            pro.setReg_id(rs.getInt("REG_ID"));
            pro.setFecha_compra(rs.getDate("REG_FECHA"));
            pro.setReg_cantidad(rs.getInt("REG_CANTIDAD"));
            pro.setPro_id(rs.getInt("MER_PRODUCTOS_PRO_ID"));
             pro.setReg_num_fac(rs.getInt("REG_NUMERO_FACTURA"));
            pro.setProv_id(rs.getInt("MER_PROVEEDORES_PROV_ID"));
             
            
            
            prod.add(pro);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado productos RP");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prod;
}
         
         
         
          public ArrayList<Registro_Productos> getListCompraProductoprov(int idprov){
        //Producto pro=new Producto();
    ArrayList<Registro_Productos> prod=new ArrayList<>();
       Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_REGISTROS_PRODUCTOS WHERE MER_PROVEEDORES_PROV_ID= '"+idprov+"'");
            while(rs.next()){
            Registro_Productos pro=new Registro_Productos();
            pro.setReg_id(rs.getInt("REG_ID"));
            pro.setFecha_compra(rs.getDate("REG_FECHA"));
            pro.setReg_cantidad(rs.getInt("REG_CANTIDAD"));
            pro.setPro_id(rs.getInt("MER_PRODUCTOS_PRO_ID"));
             pro.setReg_num_fac(rs.getInt("REG_NUMERO_FACTURA"));
            pro.setProv_id(rs.getInt("MER_PROVEEDORES_PROV_ID"));
             
            
            
            prod.add(pro);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado productos RP");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return prod;
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