/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Gestion;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Bernardo
 */
public class Ventana extends javax.swing.JFrame {
         private JDesktopPane escritorio;
         Vent_Clientes ven=new Vent_Clientes();
         Vent_Empleados ven_e=new Vent_Empleados();
         Inicio ini=new Inicio();
         Vent_Productos vent_p=new Vent_Productos();
         ConsultaFactura ven_c_f=new ConsultaFactura();
         ConsultaCompra ven_prov=new ConsultaCompra();
         AnularFactura ven_a=new AnularFactura();
        
         
         
         Gestion gx;
         Ventana_Factura ven_f;
         
    /**  
     * Creates new form Ventana
     */
    public Ventana( Gestion gx) {
        this.gx=gx;
       
        ven_f=new Ventana_Factura(gx);
        String rolss="";
       if(gx.getRol().equals("A")){
         rolss="ADMISNISTRADOR";
       } else{
         rolss="EMPLEADO";
       }
       
        this.setTitle("                                                                                                                                                                                          "+rolss);
       
        
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
		escritorio = new JDesktopPane();

		getContentPane().add(escritorio, BorderLayout.CENTER);
                escritorio.add(ini);
                ini.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 0));
        setMaximumSize(new java.awt.Dimension(1363, 863));
        setMinimumSize(new java.awt.Dimension(1363, 863));
        setPreferredSize(new java.awt.Dimension(1363, 863));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setText("GESTION");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenu3.setText("CLIENTE");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("EMPLEADOS");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setText("PRODUCTOS");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenu6.setText("FACTURA");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("REPORTES");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem2.setText("COMPRA-PROVEEDOR");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenu9.setText("FACTURAS");

        jMenuItem1.setText("REALIZADAS");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem3.setText("ANULAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenu8.add(jMenu9);

        jMenuBar1.add(jMenu8);

        jMenu7.setText("OTRA CUENTA");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu2.setText("SALIR");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        
        if(gx.getRol().equals("A")|| gx.getRol().equals("E")){
           
            escritorio.remove(ini);
        escritorio.remove(ven_e);
        escritorio.remove(ven_f);
        escritorio.remove(vent_p);
         escritorio.remove(ven_c_f);
             escritorio.remove(ven_prov);
             escritorio.remove(ven_a);
         
        
        if(ven.isClosed()){
            
            escritorio.remove(ven);
            escritorio.add(ven);
        }else{
        escritorio.remove(ven);
         escritorio.add(ven);
        }
       
        ven.setVisible(true);
        
        }else {
         
            JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        }
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        
        if(gx.getRol().equals("A") ){
            escritorio.remove(ven);
            escritorio.remove(ven_f);
             escritorio.remove(ini);
             escritorio.remove(vent_p);
             escritorio.remove(ven_c_f);
             escritorio.remove(ven_a);
             
               escritorio.remove(ven_prov);
       
       if(ven_e.isClosed()){
            escritorio.remove(ven_e);
            escritorio.add(ven_e);
        }else{
        escritorio.remove(ven_e);
         escritorio.add(ven_e);
        }
       
        ven_e.setVisible(true);
        }else {
        JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        
        }
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        //ven_f=new Ventana_Factura(gx);
        if(gx.getRol().equals("E") || gx.getRol().equals("A")){
            escritorio.remove(ven);
            escritorio.remove(ven_e);
             escritorio.remove(ini);
             escritorio.remove(ven_f);
             escritorio.remove(ven_c_f);
               escritorio.remove(ven_prov);
               escritorio.remove(ven_a);
       
       if(ven_f.isClosed()){
           
            escritorio.remove(ven_f);
            escritorio.add(ven_f);
        }else{
        escritorio.remove(ven_f);
         escritorio.add(ven_f);
        }
       
        ven_f.setVisible(true);
        
        }else {
        JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        
        }
        
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         
        
        if(gx.getRol().equals("A")|| gx.getRol().equals("E")){
        escritorio.remove(ini);
        escritorio.remove(ven_e);
        escritorio.remove(ven_f);
        escritorio.remove(ven);
        escritorio.remove(ven_c_f);
          escritorio.remove(ven_prov);
          escritorio.remove(ven_a);
        if(vent_p.isClosed()){
            escritorio.remove(vent_p);
            escritorio.add(vent_p);
        }else{
        escritorio.remove(vent_p);
         escritorio.add(vent_p);
        }
       
        vent_p.setVisible(true);
        
        }else {
         
            JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        }
        
       
          
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
        
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        if(gx.getRol().equals("A") ){
            escritorio.remove(ven);
            escritorio.remove(ven_f);
             escritorio.remove(ini);
             escritorio.remove(ven_e);
             escritorio.remove(vent_p);
               escritorio.remove(ven_prov);
               escritorio.remove(ven_a);
             
             
       
       if(ven_c_f.isClosed()){
            escritorio.remove(ven_c_f);
            escritorio.add(ven_c_f);
        }else{
        escritorio.remove(ven_c_f);
            escritorio.add(ven_c_f);
        }
       
        ven_c_f.setVisible(true);
        }else {
        JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         if(gx.getRol().equals("A") ){
            escritorio.remove(ven);
            escritorio.remove(ven_f);
             escritorio.remove(ini);
             escritorio.remove(ven_e);
             escritorio.remove(vent_p);
               escritorio.remove(ven_c_f);
               escritorio.remove(ven_a);
             
             
       
       if(ven_prov.isClosed()){
            escritorio.remove(ven_prov);
            escritorio.add(ven_prov);
        }else{
        escritorio.remove(ven_prov);
            escritorio.add(ven_prov);
        }
       
        ven_prov.setVisible(true);
        }else {
        JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
          if(gx.getRol().equals("A") ){
            escritorio.remove(ven);
            escritorio.remove(ven_f);
             escritorio.remove(ini);
             escritorio.remove(ven_e);
             escritorio.remove(vent_p);
               escritorio.remove(ven_c_f);
               escritorio.remove(ven_prov);
             
             
       
       if(ven_a.isClosed()){
            escritorio.remove(ven_a);
            escritorio.add(ven_a);
        }else{
        escritorio.remove(ven_a);
            escritorio.add(ven_a);
        }
       
        ven_a.setVisible(true);
        }else {
        JOptionPane.showMessageDialog(null,"ACCESO BLOQUEADO");
        
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
      
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
