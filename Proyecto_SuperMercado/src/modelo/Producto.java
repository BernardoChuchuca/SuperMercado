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
public class Producto {
 
    private String pro_nombre,pro_marca,pro_codigo,pro_iva;
    private Date pro_fec_elab,pro_fec_cadu;
    private int pro_id,pro_precio,pro_stock,cat_id,prov_id;
    private double pro_descuento;

    public double getPro_descuento() {
        return pro_descuento;
    }

    public void setPro_descuento(double pro_descuento) {
        this.pro_descuento = pro_descuento;
    }
    

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_iva() {
        return pro_iva;
    }

    public void setPro_iva(String pro_iva) {
        this.pro_iva = pro_iva;
    }

    

    public Date getPro_fec_elab() {
        return pro_fec_elab;
    }

    public void setPro_fec_elab(Date pro_fec_elab) {
        this.pro_fec_elab = pro_fec_elab;
    }

    public Date getPro_fec_cadu() {
        return pro_fec_cadu;
    }

    public void setPro_fec_cadu(Date pro_fec_cadu) {
        this.pro_fec_cadu = pro_fec_cadu;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getPro_precio() {
        return pro_precio;
    }

    public void setPro_precio(int pro_precio) {
        this.pro_precio = pro_precio;
    }

    public int getPro_stock() {
        return pro_stock;
    }

    public void setPro_stock(int pro_stock) {
        this.pro_stock = pro_stock;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    

    
}

