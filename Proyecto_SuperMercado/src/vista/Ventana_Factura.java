/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.glass.events.KeyEvent;
import com.sun.org.apache.xpath.internal.axes.SubContextList;
import controlador.Gestion;

import controlador.GestionFactura;
import controlador.GestionFacturasDetalle;
import controlador.GestionPersonas;
import controlador.GestionProductos;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.Detalle_Factura;
import modelo.FacDetalle;
import modelo.Factura;
import modelo.Persona;
import modelo.Producto;

/**
 *
 * @author Bernardo
 */
public class Ventana_Factura extends javax.swing.JInternalFrame {
     
    Producto producto;
    double precio;
 
    
    Gestion gx;
     
    
    
    ArrayList<Integer>tos=new ArrayList<>();
     
    ArrayList<FacDetalle>tf=new ArrayList<>();
    Persona cliente;
    /**
     * Creates new form Ventana_Factura
     */
    public Ventana_Factura(Gestion gx) {
       
        initComponents();
        jempleado.setText(gx.getPer_nombre()+" "+gx.getPer_apellido());
        
        consultar.setVisible(false);
        this.gx=gx;
        llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfactura2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jnumfac = new javax.swing.JTextField();
        sub_f = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        boxproductos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfacturax = new javax.swing.JTable();
        tcantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tcampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iva_f = new javax.swing.JTextField();
        supertotal_f = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        faccedula = new javax.swing.JTextField();
        facnombrecli = new javax.swing.JTextField();
        facdireccion = new javax.swing.JTextField();
        facemial = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        factelefono = new javax.swing.JTextField();
        facfecha = new javax.swing.JTextField();
        jempleado = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1342, 685));
        setMinimumSize(new java.awt.Dimension(1342, 685));
        setPreferredSize(new java.awt.Dimension(1342, 685));
        getContentPane().setLayout(null);

        panelfactura2.setName("panelfactura"); // NOI18N
        panelfactura2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setText("SUBTOTAL :");
        panelfactura2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 70, -1));

        jLabel37.setText("NUMERO FACTURA :");
        panelfactura2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jnumfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnumfacActionPerformed(evt);
            }
        });
        panelfactura2.add(jnumfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 40, 30));
        panelfactura2.add(sub_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 90, 30));

        jButton4.setText("CONFIRMAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelfactura2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 100, -1));

        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        panelfactura2.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 120, -1));

        boxproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxproductosMouseClicked(evt);
            }
        });
        boxproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxproductosActionPerformed(evt);
            }
        });
        panelfactura2.add(boxproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 440, -1));

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelfactura2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 120, -1));

        tfacturax.setModel(new Tabla_Factura());
        jScrollPane1.setViewportView(tfacturax);

        panelfactura2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 550, 140));
        panelfactura2.add(tcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 40, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("#");
        panelfactura2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 30, 30));
        panelfactura2.add(tcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 40, 30));

        jLabel3.setText(" # CAMPO :");
        panelfactura2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 60, -1));

        jLabel4.setText("IVA :");
        panelfactura2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 70, -1));

        jLabel5.setText("SUPER TOTAL :");
        panelfactura2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 80, -1));
        panelfactura2.add(iva_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 90, 30));
        panelfactura2.add(supertotal_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 90, 30));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelfactura2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 110, -1));

        jButton2.setText("BORRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelfactura2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, -1));

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("CEDULA :");
        jPanel4.add(jLabel34);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("NOMBRE :");
        jPanel4.add(jLabel32);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("DIRECCION :");
        jPanel4.add(jLabel31);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("EMAIL :");
        jPanel4.add(jLabel33);

        jPanel6.add(jPanel4);

        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        faccedula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        faccedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        faccedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                faccedulaKeyTyped(evt);
            }
        });
        jPanel3.add(faccedula);

        facnombrecli.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        facnombrecli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(facnombrecli);

        facdireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        facdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(facdireccion);

        facemial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        facemial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(facemial);

        jPanel6.add(jPanel3);

        jPanel7.add(jPanel6);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("TELEFONO :");
        jPanel2.add(jLabel35);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA :");
        jPanel2.add(jLabel6);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLEADO :");
        jPanel2.add(jLabel2);

        jPanel5.add(jPanel2);

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        factelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        factelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(factelefono);

        facfecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        facfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(facfecha);

        jempleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jempleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jempleado);

        jPanel5.add(jPanel1);

        jPanel7.add(jPanel5);

        panelfactura2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 660, 130));

        getContentPane().add(panelfactura2);
        panelfactura2.setBounds(193, 0, 890, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        ArrayList<Factura>list1=new GestionFactura().getListFactura();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i).getFact_id());
        }
    return list;
    }
    
      public int  codigodet(ArrayList<Integer>lis){
      boolean n=false;
      int num=1;
        while (n==false) {      
             num=new Random().nextInt(100)+0;
            if(!new GestionFacturasDetalle().comparar(num, lis)){
               n=true;
            
            }
        }

      return num;
     }
    
    public  ArrayList<Integer>getlistadet(){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Detalle_Factura>list1=new GestionFacturasDetalle().getListDetalleFactura();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i).getDet_id());
        }
    return list;
    }
    
     public int  codigodetcod(ArrayList<Integer>lis){
      boolean n=false;
      int num=1;
        while (n==false) {      
             num=new Random().nextInt(100)+0;
            if(!new GestionFactura().comparar(num, lis)){
               n=true;
            
            }
        }

      return num;
     }
    
    public  ArrayList<Integer>getlistadetcod(){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Factura>list1=new GestionFactura().getListFactura();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i).getFact_codigo());
        }
    return list;
    }

 /*public void Limpiarc(){ // Metodo para limpiar los jtextfield

         cliid.setText("");
        clinombre.setText("");
        clitelefono.setText("");
        clidireccion.setText("");
        clicorreo.setText("");
   }*/
      
    public boolean Error(String cedula){ //Metodo para el error
        boolean mensajes= false;
        
        ArrayList<Persona>lista =  new GestionPersonas().getListPersonas();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getPer_cedula().equals (cedula)){ 
            
                mensajes=true;
                break;
            
            }
        }
    return mensajes;
    }
    
    
   Double  TotalPagar(){
    
     double tototal=0;
        for (int i = 0; i < tf.size(); i++) {
            
            tototal=tototal+tf.get(i).getSubtotal();
        }
        
      return tototal; 
    }
    
    
    public void llenar(){
    
    
     
        for (int i = 0; i < new GestionProductos().getListProducto().size(); i++) {
            boxproductos.addItem(new GestionProductos().getListProducto().get(i).getPro_nombre());
        }
        
       
    } 
   
    public void Datosfactura(){
        
     java.util.Date utilDate = new java.util.Date();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        if(Error(faccedula.getText())){
            
            if(faccedula.getText().equals(gx.getCedula())){
              JOptionPane.showMessageDialog(null,"NO PERMITIDO");
              faccedula.setText("");
            }else{
            cliente= new GestionPersonas().getBuscarCedula(faccedula.getText());
            facfecha.setText(String.valueOf((Date)sqlDate));
            facnombrecli.setText(cliente.getPer_nombre()+" "+cliente.getPer_apellido());
            factelefono.setText(cliente.getPer_telefono());

            facemial.setText(cliente.getCorreo());

            facdireccion.setText(cliente.getPer_direccion());
            
            }
            
          

           

        }else{
            //Limpiarf();
            JOptionPane.showMessageDialog(null,"CLIENTE NO EXISTE");
              faccedula.setText("");

        }
    
    }
    
    private void jnumfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnumfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnumfacActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       java.util.Date utilDate = new java.util.Date();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Factura fac=new Factura();
        
        //System.out.println(sqlDate);
        
        

        fac.setFact_id(codigo(getlista()));
        
        fac.setFact_codigo(codigodetcod(getlistadetcod()));
        jnumfac.setText(String.valueOf(fac.getFact_codigo()));
        fac.setFact_fecha(sqlDate);
        //fac.setFact_descuento(5);
        fac.setFact_iva(Ivatotal());
        fac.setFact_subtotal(TotalPagar());
        double pag= TotalPagar()+Ivatotal();
        fac.setFact_total_pagar(pag);
        fac.setFact_estado("E");
        fac.setMer_per_id(gx.getPer_id());
        fac.setMer_per_id1(cliente.getPer_id());
        new GestionFactura().InsertaFactura(fac);
        RegistrarDetalle(fac.getFact_id());
        
        
        
        //GestionFactura fact=new GestionFactura();
       // fact.getListFactura().get(1).getFact_total_pagar();
        //GestionFacturasDetalle detalle=new GestionFacturasDetalle();
       new Imprimir_Factura(facemial,faccedula,facfecha,facnombrecli,jempleado,facdireccion,factelefono,jnumfac,tf,sub_f,iva_f,supertotal_f).setVisible(true);
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        //Borrar_tabla();
       /* java.util.Date utilDate = new java.util.Date();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        if(Error(faccedula.getText())){
            
            if(faccedula.getText().equals(gx.getCedula())){
              JOptionPane.showMessageDialog(null,"NO PERMITIDO");
              faccedula.setText("");
            }else{
            cliente= new GestionPersonas().getBuscarCedula(faccedula.getText());
            facfecha.setText(String.valueOf((Date)sqlDate));
            facnombrecli.setText(cliente.getPer_nombre());
            factelefono.setText(cliente.getPer_telefono());

            facemial.setText(cliente.getCorreo());

            facdireccion.setText(cliente.getPer_direccion());
            
            }
            
          

           

        }else{
            //Limpiarf();
            JOptionPane.showMessageDialog(null,"CLIENTE NO EXISTE");
              faccedula.setText("");

        }*/

      

    }//GEN-LAST:event_consultarActionPerformed

    private void boxproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxproductosMouseClicked
         
        
    }//GEN-LAST:event_boxproductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
       producto=new GestionProductos().getBuscarPoductoNombre(boxproductos.getSelectedItem().toString());  
       
        System.out.println(producto.getPro_stock());
       
        if(Double.parseDouble(tcantidad.getText())<producto.getPro_stock()){
             FacDetalle det=new FacDetalle();
        det.setCantidad(Double.parseDouble(tcantidad.getText()));
        det.setDetalle(boxproductos.getSelectedItem().toString());
        det.setPrecio(producto.getPro_precio());
        det.setIva(iva(producto.getPro_iva(), Subtotal()));
        det.setDescuento(Descuento(Subtotal(), producto.getPro_descuento()));
        double total=Subtotal()-Descuento(Subtotal(),producto.getPro_descuento())+iva(producto.getPro_iva(), Subtotal());
        det.setSubtotal(total);
        
        tf.add(det);
        tos.add(producto.getPro_id());
        tfacturax.setModel(new Tabla_Factura(tf));
        sub_f.setText(String.valueOf(TotalPagar()));
        iva_f.setText(String.valueOf(Ivatotal()));
        supertotal_f.setText(String.valueOf(TotalPagar()+Ivatotal()));
        }else{
        
        JOptionPane.showMessageDialog(null, " ERROR STOCK DISPONIBLE : "+(producto.getPro_stock()-1));
        
        }
        
        
        //tos.add(total);
        
        //TotalPagar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxproductosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ///ArrayList<Detalle_Factura>lis=new GestionFacturasDetalle().getListDetalleFactura();
        
       /* for (int i = 0; i < lis.size(); i++) {
            
            System.out.print(lis.get(i).getValor_unitario()+"|");
        }*/
        
         //System.out.println(tos);
        
       /* Producto pro= new GestionProductos().getBuscarPoductoid(1);
        System.out.println(pro.getPro_fec_cadu()+"-"+pro.getPro_nombre());*/
        //System.out.println( new GestionFacturasDetalle().facdetids());
        
        
       /* Factura fac =new GestionFactura().getListFacturaid(1);
        System.out.println(fac.getFact_total_pagar());*/
       
       //new Imprimir_Factura().setVisible(true);
       jnumfac.setText("001");
      // new Imprimir_Factura(facemial,faccedula,facfecha,facnombrecli,jempleado,facdireccion,factelefono,jnumfac,tf,sub_f,iva_f,supertotal_f).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        tf . remove ( Integer . parseInt (tcampo . getText ()));
        tos . remove ( Integer . parseInt (tcampo . getText ()));
        tfacturax . setModel ( new Tabla_Factura (tf));
         sub_f . setText ( String . valueOf (TotalPagar ()));
        iva_f . setText ( String . valueOf (Ivatotal ()));
        supertotal_f . setText ( String . valueOf (TotalPagar () + Ivatotal ()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void faccedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faccedulaKeyTyped
        // TODO add your handling code here:
        
         char precionar=evt.getKeyChar();
        
        if(precionar==KeyEvent.VK_ENTER){
        
           Datosfactura();
            
            //consultar.doClick();
            
             
        }
    }//GEN-LAST:event_faccedulaKeyTyped

   /* public Double Subtotal(){
        String cantidad=(String)tabladetalle.getValueAt(tabladetalle.getSelectedRow(), 0);
         precio=(double)(producto.getPro_precio());
        double subtotal=Double.parseDouble(cantidad)*precio;
        
        
        return subtotal;
    
    
    }*/
    public Double Subtotal(){
        Double cantidad=Double.parseDouble(tcantidad.getText());
         precio=(double)(producto.getPro_precio());
        double subtotal=cantidad*precio;
        
        
        return subtotal;
    
    
    }
    
    public Double iva(String iva,double precio){
        double ivaa=0;
        if(iva.equals("S")){
            ivaa=(precio*12)/(100);
            
        }else {
          ivaa=0;
        }
        
        return ivaa;
    };
    
    public Double Descuento(double precio, double desc ){
        double descuento=0;
        
        if(desc!=0){
         descuento=(precio*desc)/(100);
        
    }
        
    return descuento;
    } 
    /**
     * @param args the command line arguments
     */
   
    Double SumaSubtotal(){
        double sumSub=0;
        for (int i = 0; i < tf.size(); i++) {
            
            sumSub=sumSub+tf.get(i).getSubtotal();
            
        }
        
        
        return sumSub;
    
    
    
    }
    
    Double SumaIva(){
        
         double sumiva=0;
        for (int i = 0; i < tf.size(); i++) {
            
            sumiva=sumiva+tf.get(i).getIva();
            
        }
        return sumiva;
    
    
    
    }
    
    
    Double SumaDescuento(){
        
         double sumdes=0;
        for (int i = 0; i < tf.size(); i++) {
            
            sumdes=sumdes+tf.get(i).getDescuento();
            
        }
        return sumdes;
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxproductos;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField faccedula;
    private javax.swing.JTextField facdireccion;
    private javax.swing.JTextField facemial;
    private javax.swing.JTextField facfecha;
    private javax.swing.JTextField facnombrecli;
    private javax.swing.JTextField factelefono;
    private javax.swing.JTextField iva_f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jempleado;
    private javax.swing.JTextField jnumfac;
    private javax.swing.JPanel panelfactura2;
    private javax.swing.JTextField sub_f;
    private javax.swing.JTextField supertotal_f;
    private javax.swing.JTextField tcampo;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTable tfacturax;
    // End of variables declaration//GEN-END:variables

    private Double Ivatotal() {
        
       
        double total=((Double.parseDouble(sub_f.getText()))*(12))/(100);
        
        
        return total;
        
    }
    
   
   
    
    
    
    
    
    public void Audi(){
    
    
    }
    private void RegistrarDetalle(int idfac) {
        
        for (int i = 0; i <tf.size(); i++) {
            Detalle_Factura df=new Detalle_Factura();
            
            df.setDet_id(codigodet(getlistadet()));
            df.setDet_catidad(tf.get(i).getCantidad());
            df.setValor_unitario(tf.get(i).getPrecio());
            df.setPro_id(tos.get(i));
            df.setFac_id(idfac);
            new GestionFacturasDetalle().InsertaFacturaDetalle(df);
            int can=(int) tf.get(i).getCantidad();
            Producto pro= new GestionFacturasDetalle().ActualizarStock(can,tos.get(i) );
            //System.out.println(pro.getPro_nombre()+"-"+pro.getPro_stock());
            new GestionProductos().ActualizarProducto(pro);
            
            
        }
        
        
    }
    
    
    
}
