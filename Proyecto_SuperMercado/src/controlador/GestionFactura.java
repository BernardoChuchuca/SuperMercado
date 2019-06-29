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
import modelo.Factura;
import modelo.Empleado;

/**
 *
 * @author Bernardo
 */
public class GestionFactura {
    public ArrayList<Factura> getListFactura(){
        
    ArrayList<Factura> os=new ArrayList<>();
    Connection ctx=null;
        try {
            ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_FACTURAS_CABECERAS ");
            while(rs.next()){
          Factura fac =new Factura();
            
            
            fac.setFact_id(rs.getInt("FACT_ID"));
              fac.setFact_codigo(rs.getInt("FACT_CODIGO"));
             fac.setFact_fecha(rs.getDate("FACT_FECHA"));
             //fac.setFact_descuento(rs.getDouble("FACT_DESCUENTO"));
             fac.setFact_iva(rs.getDouble("FACT_IVA"));
             fac.setFact_subtotal(rs.getDouble("FACT_SUBTOTAL"));
             fac.setFact_total_pagar(rs.getDouble("FACT_TOTAL_PAGAR"));
             fac.setFact_estado(rs.getString("FACT_ESTADO").trim());
             fac.setMer_per_id(rs.getInt("MER_PERSONAS_PER_ID"));
             fac.setMer_per_id1(rs.getInt("MER_PERSONAS_PER_ID1"));
            
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
    
     public ArrayList<Factura> getListFacturaCliente(String id ){
        
    ArrayList<Factura> os=new ArrayList<>();
    Connection ctx=null;
        try {
            ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM MER_FACTURAS_CABECERAS WHERE MER_PERSONAS_PER_ID1 = '"+id+"'");
            while(rs.next()){
          Factura fac =new Factura();
            
            
            fac.setFact_id(rs.getInt("FACT_ID"));
              fac.setFact_codigo(rs.getInt("FACT_CODIGO"));
             fac.setFact_fecha(rs.getDate("FACT_FECHA"));
             //fac.setFact_descuento(rs.getDouble("FACT_DESCUENTO"));
             fac.setFact_iva(rs.getDouble("FACT_IVA"));
             fac.setFact_subtotal(rs.getDouble("FACT_SUBTOTAL"));
             fac.setFact_total_pagar(rs.getDouble("FACT_TOTAL_PAGAR"));
             fac.setFact_estado(rs.getString("FACT_ESTADO").trim());
             fac.setMer_per_id(rs.getInt("MER_PERSONAS_PER_ID"));
             fac.setMer_per_id1(rs.getInt("MER_PERSONAS_PER_ID1"));
            
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
    
     public void InsertaFactura(Factura fac) {
          Connection cnx=null;
    
        try {
           cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO MER_FACTURAS_CABECERAS (FACT_ID,"
                   + " FACT_CODIGO, FACT_FECHA, FACT_IVA, FACT_SUBTOTAL,"
                   + " FACT_TOTAL_PAGAR, FACT_ESTADO, MER_PERSONAS_PER_ID, MER_PERSONAS_PER_ID1 )"
                    + " VALUES(?,?,?,?,?,?,?,?,?)"); 
           pst.setInt(1,fac.getFact_id());
           pst.setInt(2,fac.getFact_codigo());
           pst.setDate(3,fac.getFact_fecha());
           //pst.setDouble(4,fac.getFact_descuento());
           pst.setDouble(4,fac.getFact_iva());
           pst.setDouble(5, fac.getFact_subtotal());
           pst.setDouble(6, fac.getFact_total_pagar());
           pst.setString(7, fac.getFact_estado());
           pst.setInt(8, fac.getMer_per_id());
           pst.setInt(9,fac.getMer_per_id1());
        
          
          
          
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
     
  /*    public void ActualizarEmpleado(Empleado personal){
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE VET_EMPLEADOS SET "
                    + " EMP_ID=?,EMP_CEDULA=?,EMP_NOMBRE=?,EMP_USUARIO=?,EMP_ROLL=?,EMP_CONTRASENA=?, EMP_EDAD=?, EMP_DIRECCION=?, EMP_TELEFONO=? WHERE EMP_CEDULA= '"+personal.getCedula()+"'");
            pst.setInt(1, personal.getId());
            pst.setString(2, personal.getCedula());
            pst.setString(3, personal.getNombre());
            pst.setString(4,personal.getUsuario());
            pst.setString(5,personal.getRol());
            pst.setString(6,personal.getContrasena());
            pst.setInt(7,personal.getEdad());
            pst.setString(8,personal.getDireccion());
            pst.setString(9,personal.getTelefonos());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
     }
     
     public Factura getBuscarFactura(int codemp){
         Factura fac=null;
       try {
            Connection cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
             + "   FROM VET_FACTURAS_CABECERA WHERE VET_CLIENTES_CLI_ID = '"+codemp+"'");
            while (rs.next()) {
             fac= new Factura();
             fac.setFac_id(rs.getInt("FAC_ID"));
              fac.setTotal(rs.getDouble("FAC_VALOR_TOTAL"));
             fac.setSubtotal(rs.getDouble("FAC_VALOR_SUBTOTAL"));
             fac.setCliente_id(rs.getInt("VET_CLIENTES_CLI_ID"));
             fac.setFecha(rs.getString("FAC_FECHA").trim());
             
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return fac;
    }
     
     public void EliminarEmpleado(String cedula){
        try {
            Connection cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM VET_EMPLEADOS  "
                    + " WHERE EMP_CEDULA=?");
            pst.setString(1, cedula);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
     }
     
     */
     
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
