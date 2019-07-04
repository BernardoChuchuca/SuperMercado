/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Bernardo
 */
public class Registro_Productos {
    
    int reg_num_fac,reg_cantidad,reg_id,pro_id,prov_id;
    Date fecha_compra;

    public int getReg_num_fac() {
        return reg_num_fac;
    }

    public void setReg_num_fac(int reg_num_fac) {
        this.reg_num_fac = reg_num_fac;
    }

    public int getReg_cantidad() {
        return reg_cantidad;
    }

    public void setReg_cantidad(int reg_cantidad) {
        this.reg_cantidad = reg_cantidad;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    
    
    
    
}
