/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Gestion;

import controlador.GestionPersonas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author Bernardo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tcon = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USUARIO :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(44, 40, 117, 31);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRASEÑA :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 115, 92, 16);

        tcodigo.setText("flor");
        getContentPane().add(tcodigo);
        tcodigo.setBounds(173, 46, 130, 30);

        jButton1.setText("INICIAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(123, 180, 90, 25);

        tcon.setText("ft123");
        getContentPane().add(tcon);
        tcon.setBounds(173, 113, 123, 30);

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        GestionPersonas gc=new GestionPersonas();
        Gestion gx=new Gestion();
        
        
         String roll="";
         
        ArrayList<Persona>lista=gc.getListPersonas();
       boolean respuesta =false;
       int acceso=0;
        for (int i = 0; i < lista.size(); i++) {
        
            if(lista.get(i).getEmp_usuario().equals(tcodigo.getText()) 
            && lista.get(i).getEmp_contrasena().equals(tcon.getText()) && lista.get(i).getEmp_cargo().equals("A") || lista.get(i).getEmp_usuario().equals(tcodigo.getText()) 
            && lista.get(i).getEmp_contrasena().equals(tcon.getText()) && lista.get(i).getEmp_cargo().equals("E")   ){
               
                
                acceso=1;
                roll=lista.get(i).getEmp_cargo();
               gx.setRol(lista.get(i).getEmp_cargo());
               gx.setPer_nombre(lista.get(i).getPer_nombre());
               gx.setPer_id(lista.get(i).getPer_id());
                
                break;
       }
        }
        if(acceso==1){
            if(roll.equals("A")){
                JOptionPane.showMessageDialog(null,"ACABA DE INGRESAR COMO ADMINISTRADOR");
            }else {
                JOptionPane.showMessageDialog(null,"ACABA DE INGRESAR COMO EMPLEADO");
            }
             
               
                new Ventana(gx).setVisible(true);
                //new Ventana(gx).setVisible(true);
                
                this.setVisible(false);
                
                
                
            } else{
                JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JPasswordField tcon;
    // End of variables declaration//GEN-END:variables
}
