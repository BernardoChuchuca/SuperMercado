/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Gestion;

import controlador.GestionPersonas;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author Bernardo
 */
public class Vent_Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vent_Clientes
     */
    public Vent_Empleados() {
        initComponents();
        setClosable(true);
        setDefaultLocale(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lcod = new javax.swing.JTextField();
        jced = new javax.swing.JTextField();
        jnom = new javax.swing.JTextField();
        jape = new javax.swing.JTextField();
        jeda = new javax.swing.JTextField();
        jcar = new javax.swing.JTextField();
        jcorr = new javax.swing.JTextField();
        jusu = new javax.swing.JTextField();
        jcont = new javax.swing.JTextField();
        jdir = new javax.swing.JTextField();
        jtel = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setAlignmentX(0.2F);
        setAlignmentY(0.2F);
        setMaximumSize(new java.awt.Dimension(1342, 685));
        setMinimumSize(new java.awt.Dimension(1342, 685));
        setPreferredSize(new java.awt.Dimension(1342, 685));
        getContentPane().setLayout(null);

        tabla.setModel(new Tabla_Empleados());
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(429, 25, 890, 403);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.GridLayout(1, 5));

        jButton4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jButton4.setText("ELIMINAR");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton5.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jButton5.setText("LISTAR");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jButton3.setText("REGISTRAR");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jButton1.setText("ACTUALIZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 580, 1330, 71);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.GridLayout(11, 1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CODIGO :");
        jPanel2.add(jLabel9);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEDULA :");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE :");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APELLIDO :");
        jPanel2.add(jLabel3);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("EDAD :");
        jPanel2.add(jLabel10);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CARGO : ");
        jPanel2.add(jLabel6);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CORREO :");
        jPanel2.add(jLabel11);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIO :");
        jPanel2.add(jLabel4);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONTRASEÑA :");
        jPanel2.add(jLabel7);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TELEFONO:");
        jPanel2.add(jLabel5);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DIRECCION :");
        jPanel2.add(jLabel8);

        jPanel4.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(11, 1));

        lcod.setEditable(false);
        lcod.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lcod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(lcod);

        jced.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jced.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jced.setAlignmentX(0.2F);
        jced.setAlignmentY(0.2F);
        jPanel3.add(jced);

        jnom.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jnom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jnom.setAlignmentX(0.2F);
        jnom.setAlignmentY(0.2F);
        jPanel3.add(jnom);

        jape.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jape.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jape.setAlignmentX(0.2F);
        jape.setAlignmentY(0.2F);
        jPanel3.add(jape);

        jeda.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jeda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jedaMouseClicked(evt);
            }
        });
        jPanel3.add(jeda);

        jcar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jcar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jcar.setAlignmentX(0.2F);
        jcar.setAlignmentY(0.2F);
        jPanel3.add(jcar);

        jcorr.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jcorr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jcorr);

        jusu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jusu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jusu);

        jcont.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jcont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jcont);

        jdir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jdir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jdir.setAlignmentX(0.2F);
        jdir.setAlignmentY(0.2F);
        jPanel3.add(jdir);

        jtel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jtel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtel.setAlignmentX(0.2F);
        jtel.setAlignmentY(0.2F);
        jPanel3.add(jtel);

        jPanel4.add(jPanel3);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 30, 410, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public int  codigo(ArrayList<Integer>lis){
      boolean n=false;
      int num=1;
        while (n==false) {      
             num=new Random().nextInt(100)+0;
            if(!new GestionPersonas().comparar(num, lis)){
               n=true;
            
            }
        }

      return num;
     }
    
    public  ArrayList<Integer>getlista(){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Persona>list1=new GestionPersonas().getListPersonas();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i).getPer_id());
        }
    return list;
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Persona per=new Persona();

      
        if(new Gestion().Cedula(jced.getText()) && jced.getText().length()==10){
            
        if(!Existe(jced.getText())){
          per.setPer_id(codigo(getlista()) );
         per.setPer_cedula(jced.getText());
         per.setPer_nombre(jnom.getText());
        per.setPer_apellido(jape.getText());
        per.setPer_direccion(jdir.getText());
        per.setPer_telefono(jtel.getText());
        per.setPer_edad(Integer.parseInt(jeda.getText()));
       
        per.setEmp_cargo(jcar.getText());
        per.setEmp_contrasena(jcont.getText());
        per.setEmp_usuario(jusu.getText());
        per.setCorreo(jcorr.getText());
         new GestionPersonas().InsertPersona(per);
         JOptionPane.showMessageDialog(null,"REGISTRO CORRECTO");
        
        }  else{
        JOptionPane.showMessageDialog(null,"PERSONA YA REGISTRADA");
        }  
            
        }else {
        
            JOptionPane.showMessageDialog(null,"CEDULA INCORRECTA");
        }
       
       
     
      
        
       
       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ArrayList<Persona>lisemp=new ArrayList<>();
        ArrayList<Persona>listotal=new GestionPersonas().getListPersonas();
        
        for (int i = 0; i < listotal.size(); i++) {
            
            if(listotal.get(i).getEmp_cargo().equals("A") || listotal.get(i).getEmp_cargo().equals("E") ){
                lisemp.add(listotal.get(i));
            
            }
        }
       tabla.setModel(new Tabla_Empleados(lisemp));
       
       // System.out.println(new GestionPersonas().getBuscarCliente("1").getPer_id());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //System.out.println(codigo(getlista()));
        if(Existe(jced.getText())){
            
        Persona per=new GestionPersonas().getBuscarCedula(jced.getText());
        
        if(per.getEmp_cargo().equals("A")||per.getEmp_cargo().equals("E") ){
        
        lcod.setText(String.valueOf(per.getPer_id()));
        jced.setText(per.getPer_cedula());
        jnom.setText(per.getPer_nombre());
        jape.setText(per.getPer_apellido());
        jcar.setText(per.getEmp_cargo());
        jusu.setText(per.getEmp_usuario());
        jcont.setText(per.getEmp_contrasena());
        jdir.setText(per.getPer_direccion());
        jtel.setText(per.getPer_telefono());
        jcorr.setText(per.getCorreo());
        
        jeda.setText(String.valueOf(per.getPer_edad()));
        
        }else{
                
                 JOptionPane.showMessageDialog(null,"EMPLEADO NO EXISTE");
                
        }
       
        
         } else {
                
                JOptionPane.showMessageDialog(null,"EMPLEADO NO EXISTE");
          }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        //jnom.setText((String) tabla.getValueAt(tabla.getSelectedRow(), tabla.getSelectedColumn()));
        lcod.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
        jced.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
        jnom.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
        jape.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 3));
        jcorr.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 4));
        jcar.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 5));
        jusu.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 6));
        jcont.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 7));
        jdir.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 8));
        jtel.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 9));
        jeda.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 10)));
        //lcod1.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 10)));
    
       
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Persona per=new Persona();
        
        per.setPer_id(Integer.parseInt(lcod.getText()));
        per.setPer_cedula(jced.getText());
        per.setPer_nombre(jnom.getText());
        per.setPer_apellido(jape.getText());
        per.setPer_direccion(jdir.getText());
        per.setPer_telefono(jtel.getText());
        per.setPer_edad(Integer.parseInt(jeda.getText()));
        per.setEmp_cargo(jcar.getText());
        per.setEmp_contrasena(jcont.getText());
        per.setEmp_usuario(jusu.getText());
        per.setCorreo(jcorr.getText());
        
        /*emp.setPer_cedula(per.getPer_cedula());
        emp.setPer_nombre(per.getPer_nombre());
        emp.setPer_apellido(per.getPer_apellido());
        emp.setPer_direccion(per.getPer_direccion());
        emp.setPer_telefono(per.getPer_telefono());*/
        
        
        new GestionPersonas().ActualizarPersona(per);
        JOptionPane.showMessageDialog(null,"ACTULIZACION CORRECTA");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
        new GestionPersonas().EliminarPersona(jced.getText());
        JOptionPane.showMessageDialog(null,"ELIMINACION CORRECTA");
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jedaMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jape;
    private javax.swing.JTextField jcar;
    private javax.swing.JTextField jced;
    private javax.swing.JTextField jcont;
    private javax.swing.JTextField jcorr;
    private javax.swing.JTextField jdir;
    private javax.swing.JTextField jeda;
    private javax.swing.JTextField jnom;
    private javax.swing.JTextField jtel;
    private javax.swing.JTextField jusu;
    private javax.swing.JTextField lcod;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

  public boolean Existe(String cedula){
    
        boolean exi=false;
        ArrayList<Persona>lis=new GestionPersonas().getListPersonas();
        
        for (int i = 0; i < lis.size(); i++) {
            if(lis.get(i).getPer_cedula().equals(cedula)){
               exi=true;
               break;
            
            }  
            
        }
        
        
    
    return exi;
    }




}

