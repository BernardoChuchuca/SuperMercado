/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionProductos;
import Controlador.GestionProveedores;
import Controlador.GestionCategorias;
import Modelo.Categoria;
import modelo.Producto;
import Modelo.Proveedor;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Vent_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vent_Productos
     */
    public Vent_Productos() {
        initComponents();
       Llenar();
        LlenarC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        proidtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        procodigotxt = new javax.swing.JTextField();
        pronombretxt = new javax.swing.JTextField();
        profechaelatxt = new javax.swing.JTextField();
        profechacadtxt = new javax.swing.JTextField();
        promarcatxt = new javax.swing.JTextField();
        propreciotxt = new javax.swing.JTextField();
        prostocktxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        provBox = new javax.swing.JComboBox<>();
        bingresarP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        proivatxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        prodestxt = new javax.swing.JTextField();
        bListarP = new javax.swing.JButton();
        catBox = new javax.swing.JComboBox<>();
        actualizarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        proidprov = new javax.swing.JTextField();
        proidcat = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 613));
        setMinimumSize(new java.awt.Dimension(1200, 613));
        setPreferredSize(new java.awt.Dimension(1200, 613));
        getContentPane().setLayout(null);

        jButton1.setText("Buscar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(204, 42, 115, 25);

        proidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proidtxtActionPerformed(evt);
            }
        });
        getContentPane().add(proidtxt);
        proidtxt.setBounds(21, 43, 70, 30);

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 90, 50, 30);

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 130, 60, 30);

        jLabel3.setText("Fecha de Elaboracion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(21, 175, 120, 30);

        jLabel4.setText("Fecha de Caducidad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(21, 215, 110, 30);

        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 445, 40, 20);

        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 270, 33, 15);

        jLabel7.setText("Stock:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 320, 40, 20);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(21, 372, 0, 0);
        getContentPane().add(procodigotxt);
        procodigotxt.setBounds(180, 92, 149, 30);
        getContentPane().add(pronombretxt);
        pronombretxt.setBounds(180, 132, 149, 30);
        getContentPane().add(profechaelatxt);
        profechaelatxt.setBounds(180, 172, 149, 30);
        getContentPane().add(profechacadtxt);
        profechacadtxt.setBounds(180, 212, 149, 30);
        getContentPane().add(promarcatxt);
        promarcatxt.setBounds(180, 440, 149, 30);

        propreciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propreciotxtActionPerformed(evt);
            }
        });
        getContentPane().add(propreciotxt);
        propreciotxt.setBounds(180, 260, 149, 30);
        getContentPane().add(prostocktxt);
        prostocktxt.setBounds(180, 300, 149, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 13, 1090, 10);

        provBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provBoxMouseClicked(evt);
            }
        });
        provBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provBoxActionPerformed(evt);
            }
        });
        getContentPane().add(provBox);
        provBox.setBounds(180, 490, 330, 24);

        bingresarP.setText("Ingresar");
        bingresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingresarPActionPerformed(evt);
            }
        });
        getContentPane().add(bingresarP);
        bingresarP.setBounds(580, 500, 100, 25);

        jLabel10.setText("IVA:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 360, 40, 20);
        getContentPane().add(proivatxt);
        proivatxt.setBounds(180, 350, 150, 30);

        jLabel11.setText("Descuento");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 400, 70, 20);
        getContentPane().add(prodestxt);
        prodestxt.setBounds(180, 400, 140, 30);

        bListarP.setText("Listar");
        bListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarPActionPerformed(evt);
            }
        });
        getContentPane().add(bListarP);
        bListarP.setBounds(710, 500, 61, 25);

        catBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catBoxMouseClicked(evt);
            }
        });
        catBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catBoxActionPerformed(evt);
            }
        });
        getContentPane().add(catBox);
        catBox.setBounds(180, 530, 330, 24);

        actualizarP.setText("Actualizar");
        actualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarP);
        actualizarP.setBounds(800, 500, 100, 25);

        tablapro.setModel(new Vista.Tabla_Productos());
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 70, 830, 403);

        jLabel9.setText("Proveedor :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 480, 70, 30);

        jLabel12.setText("Categoria :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 530, 70, 20);
        getContentPane().add(proidprov);
        proidprov.setBounds(100, 490, 40, 30);
        getContentPane().add(proidcat);
        proidcat.setBounds(100, 530, 40, 30);

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(923, 500, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proidtxtActionPerformed

    private void provBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provBoxMouseClicked
       
       
        
    }//GEN-LAST:event_provBoxMouseClicked

    private void bingresarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingresarPActionPerformed
        // TODO add your handling code here:
        //Ingresar
        Producto producto =  new  Producto();
        java.util.Date utilDate= new java.util.Date();
        java.util.Date utilDate1= new java.util.Date();
        utilDate=Date.valueOf(profechacadtxt.getText());
        utilDate1=Date.valueOf(profechaelatxt.getText());
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
        
       // Proveedor proveedor= new GestionProveedores().getBuscarProveedores((String.valueOf(provBox.getSelectedItem())));
       // Categoria categoria= new GestionCategorias().getBuscarCategoriaNombre((String.valueOf(catBox.getSelectedItem())));
      
        producto.setPro_id(numero()); // Cunado se inserta el cliente el id se va a sumar mas 1 con el tamano de la lista
        producto.setPro_codigo(procodigotxt.getText());
        producto.setPro_nombre(pronombretxt.getText());
        producto.setPro_fec_cadu(sqlDate);
        producto.setPro_fec_elab(sqlDate1);
        producto.setPro_marca(promarcatxt.getText());
        producto.setPro_precio(Integer.parseInt(propreciotxt.getText()));
        producto.setPro_stock(Integer.parseInt(prostocktxt.getText()));
        producto.setPro_iva(proivatxt.getText());
        producto.setPro_descuento(Double.parseDouble(prodestxt.getText()));
        producto.setProv_id(Integer.parseInt(proidprov.getText()));
        producto.setCat_id(Integer.parseInt(proidcat.getText()));
        
        new  GestionProductos().InsertProductos(producto);
        
        
        
        proidtxt.setText( String.valueOf(producto.getPro_id()));
        JOptionPane.showMessageDialog(null,"PRODUCTO REGISTRADO ");
        //tablapro.setModel(new Tabla_Productos(new GestionProductos().getListProducto()));
        
    }//GEN-LAST:event_bingresarPActionPerformed

    private void propreciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propreciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propreciotxtActionPerformed

    private void bListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarPActionPerformed
        // TODO add your handling code here
        
        
        tablapro.setModel(new Vista.Tabla_Productos(new GestionProductos().getListProducto()));
        
        
    }//GEN-LAST:event_bListarPActionPerformed

    private void provBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provBoxActionPerformed
        // TODO add your handling code here:
         Proveedor proveedor= new GestionProveedores().getBuscarProveedores((String.valueOf(provBox.getSelectedItem())));
        proidprov.setText(String.valueOf(proveedor.getProv_id()));
    }//GEN-LAST:event_provBoxActionPerformed

    private void actualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPActionPerformed
        // TODO add your handling code here:
         java.util.Date utilDate= new java.util.Date();
        java.util.Date utilDate1= new java.util.Date();
        utilDate=Date.valueOf(profechacadtxt.getText());
        utilDate1=Date.valueOf(profechaelatxt.getText());
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
        Producto producto=new Producto();
                
        producto.setPro_id(Integer.parseInt(proidtxt.getText())); // Cunado se inserta el cliente el id se va a sumar mas 1 con el tamano de la lista
        producto.setPro_codigo(procodigotxt.getText());
        producto.setPro_nombre(pronombretxt.getText());
        producto.setPro_fec_cadu(sqlDate);
        producto.setPro_fec_elab(sqlDate1);
        producto.setPro_marca(promarcatxt.getText());
        producto.setPro_precio(Integer.parseInt(propreciotxt.getText()));
        producto.setPro_stock(Integer.parseInt(prostocktxt.getText()));
        producto.setPro_iva(proivatxt.getText());
        producto.setPro_descuento(Double.parseDouble(prodestxt.getText()));
        producto.setProv_id(Integer.parseInt(proidprov.getText()));
        producto.setCat_id(Integer.parseInt(proidcat.getText()));
        
        new GestionProductos().ActualizarProducto(producto);
         JOptionPane.showMessageDialog(null,"PRODUCTO ACTUALIZADO ");
        
        
        //System.out.println(new GestionProveedores().getListProveedor().get(0).getProv_nombre_empresa());
    }//GEN-LAST:event_actualizarPActionPerformed

    private void tablaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproMouseClicked
        // TODO add your handling code here:
        
        proidtxt.setText((String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 0))));
        procodigotxt.setText((String)tablapro.getValueAt(tablapro.getSelectedRow(), 1));
        pronombretxt.setText((String) tablapro.getValueAt(tablapro.getSelectedRow(),2));
        profechaelatxt.setText((String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 3))));
        profechacadtxt.setText((String.valueOf( tablapro.getValueAt(tablapro.getSelectedRow(),4))));
        promarcatxt.setText((String)tablapro.getValueAt(tablapro.getSelectedRow(), 5));
        propreciotxt.setText((String.valueOf (tablapro.getValueAt(tablapro.getSelectedRow(),6))));
        prostocktxt.setText((String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 7))));
        proivatxt.setText((String) tablapro.getValueAt(tablapro.getSelectedRow(),8));
        prodestxt.setText(String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 9)));
        proidcat.setText(String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 10)));
        proidprov.setText(String.valueOf(tablapro.getValueAt(tablapro.getSelectedRow(), 11)));
    }//GEN-LAST:event_tablaproMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        pronombretxt.setText(new GestionProductos().getBuscarPoductoid(1).getPro_nombre());
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void catBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBoxMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_catBoxMouseClicked

    private void catBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catBoxActionPerformed
        // TODO add your handling code here:
         Categoria categoria= new GestionCategorias().getBuscarCategoriaNombre((String.valueOf(catBox.getSelectedItem())));
         proidcat.setText(String.valueOf(categoria.getCat_id()));
    }//GEN-LAST:event_catBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new GestionProductos().EliminarProducto(Integer.parseInt(proidtxt.getText()));
        JOptionPane.showMessageDialog(null,"PRODUCTO ELINADO");
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Llenar(){
         // TODO add your handling code here:
        for(int i=0;i< new GestionProveedores().getListProveedor().size();i++){
            provBox.addItem(new GestionProveedores().getListProveedor().get(i).getProv_nombre_empresa());
            
        }
    }
    
     public void LlenarC(){
         // TODO add your handling code here:
        for(int i=0;i< new GestionCategorias().getListCategoria().size();i++){
            catBox.addItem(new GestionCategorias().getListCategoria().get(i).getCat_nombre());
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarP;
    private javax.swing.JButton bListarP;
    private javax.swing.JButton bingresarP;
    private javax.swing.JComboBox<String> catBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField procodigotxt;
    private javax.swing.JTextField prodestxt;
    private javax.swing.JTextField profechacadtxt;
    private javax.swing.JTextField profechaelatxt;
    private javax.swing.JTextField proidcat;
    private javax.swing.JTextField proidprov;
    private javax.swing.JTextField proidtxt;
    private javax.swing.JTextField proivatxt;
    private javax.swing.JTextField promarcatxt;
    private javax.swing.JTextField pronombretxt;
    private javax.swing.JTextField propreciotxt;
    private javax.swing.JTextField prostocktxt;
    private javax.swing.JComboBox<String> provBox;
    private javax.swing.JTable tablapro;
    // End of variables declaration//GEN-END:variables

    ArrayList<Integer>listae = new ArrayList<>();
public void listarId(){
    Producto producto= new Producto();
    ArrayList<Producto>listpro= new GestionProductos().getListProducto();
    
    for (int i = 0; i < listpro.size(); i++) {
        listae.add(listpro.get(i).getPro_id());
        
       
    }
}

public boolean listarEntero(int num){
    boolean s=false;
    for (int i = 0; i < listae.size(); i++) {
        if(num==listae.get(i)){
            s=true;
            break;
        }
    }
    
    return s;
}

public int numero(){
    boolean n=false;
    int numid=1;
    while(n==false){
        numid= new Random().nextInt(100)+0;
        if(!listarEntero(numid)){
            n=true;
        }
        
    }
    return numid;
}


}


