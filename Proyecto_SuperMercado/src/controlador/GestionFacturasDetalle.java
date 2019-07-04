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
import modelo.Detalle_Factura;
import modelo.Factura;
import modelo.Producto;

/**
 *
 * @author Bernardo
 */
public class GestionFacturasDetalle {
    
    public ArrayList<Detalle_Factura> getListDetalleFactura(){
        
    ArrayList<Detalle_Factura> os=new ArrayList<>();
    Connection ctx=null;
        try {
            ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_FACTURAS_DETALLES");
            while(rs.next()){
          Detalle_Factura fac =new Detalle_Factura();
            
            
            fac.setDet_id(rs.getInt("FDET_ID"));
              fac.setDet_catidad(rs.getInt("FDET_CANTIDAD"));
             fac.setValor_unitario(rs.getDouble("FDET_PRECIO"));
            fac.setPro_id(rs.getInt("MER_PRODUCTOS_PRO_ID"));
             fac.setFac_id(rs.getInt("MER_FACTURAS_CABECERAS_FACT_ID"));
             
            
            
            os.add(fac);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return os;
    }
    
     public ArrayList<Detalle_Factura> getListDetalleFacturaid(int id){
        
    ArrayList<Detalle_Factura> os=new ArrayList<>();
    Connection ctx=null;
        try {
            ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_FACTURAS_DETALLES WHERE MER_FACTURAS_CABECERAS_FACT_ID = '"+id+"'");
            while(rs.next()){
          Detalle_Factura fac =new Detalle_Factura();
            
            
            fac.setDet_id(rs.getInt("FDET_ID"));
              fac.setDet_catidad(rs.getInt("FDET_CANTIDAD"));
             fac.setValor_unitario(rs.getDouble("FDET_PRECIO"));
             fac.setPro_id(rs.getInt("MER_PRODUCTOS_PRO_ID"));
             fac.setFac_id(rs.getInt("MER_FACTURAS_CABECERAS_FACT_ID"));
             
            
            
            os.add(fac);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }finally{
        Conexion.close(ctx);
            System.err.println("CONEXION CERRADA");
            
        }
    return os;
    }
     
     
     
     
     
     public void InsertaFacturaDetalle(Detalle_Factura detfac) {
         
       Connection cnx=null;
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO MER_FACTURAS_DETALLES ( FDET_ID,"
                   + " FDET_CANTIDAD, FDET_PRECIO, MER_FACTURAS_CABECERAS_FACT_ID ,MER_PRODUCTOS_PRO_ID )"
                    + " VALUES(?,?,?,?,?)"); 
           pst.setInt(1,detfac.getDet_id());
           pst.setDouble(2,detfac.getDet_catidad());
           pst.setDouble(3,detfac.getValor_unitario());
           pst.setInt(4,detfac.getFac_id());
           pst.setInt(5,detfac.getPro_id());
           
        
          
          
          
           pst.executeQuery();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos fac");
  }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
}
     
 public Producto ActualizarStock(int cantidad,int id){
     
 Producto pro=new GestionProductos().getBuscarPoductoid(id);
 int stock=pro.getPro_stock();
 int stocknuevo= stock-cantidad;
 
 
 pro.setPro_stock(stocknuevo);
 
     //System.out.println(stock);
 
 return pro;
 }    
 
   public int  facdetids(){
       ArrayList<Detalle_Factura>list1=new GestionFacturasDetalle().getListDetalleFactura();
               int num=list1.size()-1;
       int id=list1.get(num).getDet_id()+1;
        

      return id;
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
