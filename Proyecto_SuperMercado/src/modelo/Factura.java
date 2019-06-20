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
public class Factura {
 private int fact_id,mer_per_id,fact_codigo,mer_per_id1;
 private double /*fact_descuento,*/fact_subtotal,fact_total_pagar,fact_iva;
 private String fact_estado;
 private Date fact_fecha;

    public int getFact_id() {
        return fact_id;
    }

    public void setFact_id(int fact_id) {
        this.fact_id = fact_id;
    }

    public int getFact_codigo() {
        return fact_codigo;
    }

    public void setFact_codigo(int fact_codigo) {
        this.fact_codigo = fact_codigo;
    }

    public Double getFact_iva() {
        return fact_iva;
    }

    public void setFact_iva(double  fact_iva) {
        this.fact_iva = fact_iva;
    }

    public int getMer_per_id() {
        return mer_per_id;
    }

    public void setMer_per_id(int mer_per_id) {
        this.mer_per_id = mer_per_id;
    }

    public int getMer_per_id1() {
        return mer_per_id1;
    }

    public void setMer_per_id1(int mer_per_id1) {
        this.mer_per_id1 = mer_per_id1;
    }

   /* public double getFact_descuento() {
        return fact_descuento;
    }

    public void setFact_descuento(double fact_descuento) {
        this.fact_descuento = fact_descuento;
    }*/

    public double getFact_subtotal() {
        return fact_subtotal;
    }

    public void setFact_subtotal(double fact_subtotal) {
        this.fact_subtotal = fact_subtotal;
    }

    public double getFact_total_pagar() {
        return fact_total_pagar;
    }

    public void setFact_total_pagar(double fact_total_pagar) {
        this.fact_total_pagar = fact_total_pagar;
    }

    public String getFact_estado() {
        return fact_estado;
    }

    public void setFact_estado(String fact_estado) {
        this.fact_estado = fact_estado;
    }

    public Date getFact_fecha() {
        return fact_fecha;
    }

    public void setFact_fecha(Date fact_fecha) {
        this.fact_fecha = fact_fecha;
    }
 
 
  
    
}
