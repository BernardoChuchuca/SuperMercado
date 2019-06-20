/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.GestionProductos;
import controlador.GestionProveedores;
import controlador.GestionCategorias;
import modelo.Categoria;
import modelo.Producto;
import modelo.Proveedor;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

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
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        provBox = new javax.swing.JComboBox<>();
        bingresarP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        proivatxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        prodestxt = new javax.swing.JTextField();
        bListarP = new javax.swing.JButton();
        catBox = new javax.swing.JComboBox<>();
        actualizarP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 613));
        setMinimumSize(new java.awt.Dimension(1200, 613));
        setPreferredSize(new java.awt.Dimension(1200, 613));
        getContentPane().setLayout(null);

        jButton1.setText("Buscar Producto");
        getContentPane().add(jButton1);
        jButton1.setBounds(204, 42, 125, 25);

        proidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proidtxtActionPerformed(evt);
            }
        });
        getContentPane().add(proidtxt);
        proidtxt.setBounds(21, 43, 149, 22);

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 95, 44, 16);

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 135, 50, 16);

        jLabel3.setText("Fecha de Elaboracion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(21, 175, 127, 16);

        jLabel4.setText("Fecha de Caducidad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(21, 215, 120, 16);

        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(21, 255, 40, 16);

        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(21, 295, 40, 16);

        jLabel7.setText("Stock:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(21, 335, 36, 16);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(21, 372, 0, 0);
        getContentPane().add(procodigotxt);
        procodigotxt.setBounds(180, 92, 149, 22);
        getContentPane().add(pronombretxt);
        pronombretxt.setBounds(180, 132, 149, 22);
        getContentPane().add(profechaelatxt);
        profechaelatxt.setBounds(180, 172, 149, 22);
        getContentPane().add(profechacadtxt);
        profechacadtxt.setBounds(180, 212, 149, 22);
        getContentPane().add(promarcatxt);
        promarcatxt.setBounds(180, 252, 149, 22);

        propreciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propreciotxtActionPerformed(evt);
            }
        });
        getContentPane().add(propreciotxt);
        propreciotxt.setBounds(180, 292, 149, 22);
        getContentPane().add(prostocktxt);
        prostocktxt.setBounds(180, 332, 149, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 13, 1090, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 537, 1090, 10);

        jScrollPane1.setMaximumSize(null);

        tablapro.setModel(new Tabla_Productos());
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 40, 830, 402);

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
        provBox.setBounds(380, 510, 330, 22);

        bingresarP.setText("Ingresar");
        bingresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingresarPActionPerformed(evt);
            }
        });
        getContentPane().add(bingresarP);
        bingresarP.setBounds(20, 480, 100, 25);

        jLabel10.setText("IVA:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 380, 25, 16);
        getContentPane().add(proivatxt);
        proivatxt.setBounds(180, 380, 150, 22);

        jLabel11.setText("Descuento");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 440, 70, 16);
        getContentPane().add(prodestxt);
        prodestxt.setBounds(180, 430, 140, 22);

        bListarP.setText("Listar");
        bListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarPActionPerformed(evt);
            }
        });
        getContentPane().add(bListarP);
        bListarP.setBounds(150, 480, 63, 25);

        getContentPane().add(catBox);
        catBox.setBounds(770, 520, 350, 22);

        actualizarP.setText("Actualizar");
        actualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarP);
        actualizarP.setBounds(240, 480, 100, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PlaR1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, 0, 1190, 610);

        jMenu1.setText("Listar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        Proveedor proveedor= new GestionProveedores().getBuscarProveedores((String.valueOf(provBox.getSelectedItem())));
        Categoria categoria= new GestionCategorias().getBuscarCategoriaNombre((String.valueOf(catBox.getSelectedItem())));
        System.out.println(proveedor.getProv_id());
        System.out.println(categoria.getCat_id());
        producto.setPro_id(numero()); // Cunado se inserta el cliente el id se va a sumar mas 1 con el tamano de la lista
        producto.setPro_codigo(procodigotxt.getText());
        producto.setPro_nombre(pronombretxt.getText());
        producto.setPro_fecha_elaborado(sqlDate);
        producto.setPro_fecha_caducidad(sqlDate);
        producto.setPro_compania(promarcatxt.getText());
        producto.setPro_precio(Double.parseDouble(propreciotxt.getText()));
        producto.setPro_stock(Integer.parseInt(prostocktxt.getText()));
        producto.setPro_iva_disponible(proivatxt.getText());
        producto.setPro_descuento_disponible(prodestxt.getText());
        producto.setProv_id(proveedor.getProv_id());
        producto.setCat_id(categoria.getCat_id());
        
        new  GestionProductos().InsertarProducto(producto);
        
        
        
        proidtxt.setText( String.valueOf(producto.getPro_id()));
        tablapro.setModel(new Tabla_Productos(new GestionProductos().getListProducto()));
        
    }//GEN-LAST:event_bingresarPActionPerformed

    private void propreciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propreciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propreciotxtActionPerformed

    private void bListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarPActionPerformed
        // TODO add your handling code here:
        tablapro.setModel(new Tabla_Productos(new GestionProductos().getListProducto()));
    }//GEN-LAST:event_bListarPActionPerformed

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
        prodestxt.setText((String)tablapro.getValueAt(tablapro.getSelectedRow(), 9));
        
    }//GEN-LAST:event_tablaproMouseClicked

    private void provBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provBoxActionPerformed

    private void actualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarPActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField procodigotxt;
    private javax.swing.JTextField prodestxt;
    private javax.swing.JTextField profechacadtxt;
    private javax.swing.JTextField profechaelatxt;
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


