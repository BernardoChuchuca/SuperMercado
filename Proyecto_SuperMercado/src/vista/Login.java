/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.glass.events.KeyEvent;
import controlador.Gestion;

import controlador.GestionPersonas;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
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
        progreso.setVisible(false);
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

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tcodigo = new javax.swing.JTextField();
        tcon = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        entrar = new javax.swing.JButton();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 342));
        setMinimumSize(new java.awt.Dimension(640, 342));
        setPreferredSize(new java.awt.Dimension(640, 342));
        getContentPane().setLayout(null);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIO :");
        jPanel2.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA :");
        jPanel2.add(jLabel2);

        jPanel4.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        tcodigo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcodigoActionPerformed(evt);
            }
        });
        tcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcodigoKeyTyped(evt);
            }
        });
        jPanel3.add(tcodigo);

        tcon.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tcon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tconActionPerformed(evt);
            }
        });
        tcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tconKeyTyped(evt);
            }
        });
        jPanel3.add(tcon);

        jPanel4.add(jPanel3);

        jPanel5.add(jPanel4);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        entrar.setText("INICIAR");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar);

        jPanel5.add(jPanel1);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(30, 40, 550, 200);

        progreso.setBackground(new java.awt.Color(0, 0, 0));
        progreso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        progreso.setForeground(new java.awt.Color(0, 0, 0));
        progreso.setOpaque(false);
        getContentPane().add(progreso);
        progreso.setBounds(160, 250, 270, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
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
               gx.setCedula(lista.get(i).getPer_cedula());
               gx.setPer_apellido(lista.get(i).getPer_apellido());
               
                
                break;
       }
        }
        if(acceso==1){
            if(roll.equals("A")){
                progreso.setVisible(true);
                
                progreso.setStringPainted(true);
                progreso.setValue(100);
              JOptionPane.showMessageDialog(null,"ACABA DE INGRESAR COMO ADMINISTRADOR");
            }else {
                progreso.setVisible(true);
                
                progreso.setStringPainted(true);
                progreso.setValue(100);
                JOptionPane.showMessageDialog(null,"ACABA DE INGRESAR COMO EMPLEADO");
            }
             
               
                new Ventana(gx).setVisible(true);
                //new Ventana(gx).setVisible(true);
                
                this.setVisible(false);
                
                
                
            } else{
            progreso.setVisible(true);
                
                progreso.setStringPainted(true);
            progreso.setValue(0);
                JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");
            }
    }//GEN-LAST:event_entrarActionPerformed

    private void tcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcodigoActionPerformed

    private void tconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tconActionPerformed

    private void tcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcodigoKeyTyped
        char precionar=evt.getKeyChar();
        
        if(precionar==KeyEvent.VK_ENTER){
        
           
            
            entrar.doClick();
            
             
        }
        
        
    }//GEN-LAST:event_tcodigoKeyTyped

    private void tconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tconKeyTyped
       char precionar=evt.getKeyChar();
        
        if(precionar==KeyEvent.VK_ENTER){
        
           
            
            entrar.doClick();
            
            
        }
    }//GEN-LAST:event_tconKeyTyped

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
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JPasswordField tcon;
    // End of variables declaration//GEN-END:variables

}
