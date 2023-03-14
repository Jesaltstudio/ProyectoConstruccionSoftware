
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Banco;
import modelo.DAO.BancoDao;
import modulos.ingresar;
import exceptions.ingresarbancoexception;

/**
 *
 * @author aleja
 */
public class ingresarbanco extends javax.swing.JFrame {
    
    BancoDao bandao = new BancoDao();
    
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ingresarbanco
     */
    public ingresarbanco() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }
    
    void listar(){
        List<Banco> lista = bandao.listar();
        modelo = (DefaultTableModel)Tabla.getModel();
        Object[] ob = new Object[7];
        for(int i = 0; i < lista.size(); i ++){
            ob[0] = lista.get(i) .getId();
            ob[1] = lista.get(i) .getNombre();
            ob[2] = lista.get(i) .getRazon_social();
            ob[3] = lista.get(i) .getCuenta();
            ob[4] = lista.get(i) .getFecha_ingreso();
            ob[5] = lista.get(i) .getRuc();
            modelo.addRow(ob);
        }
        Tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btregresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtrazon_social = new javax.swing.JTextField();
        txtcuenta = new javax.swing.JTextField();
        txtfecha_ingreso = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btagregar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btregresar.setText("Regresar");
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Módulo de Ingreso de Entidad Bancaria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel3.setText("ID:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Razón Social:");

        jLabel6.setText("Cuenta:");

        jLabel7.setText("Ruc:");

        jLabel8.setText("Fecha:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrazon_social))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha_ingreso)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 600, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btagregar)
                .addGap(44, 44, 44)
                .addComponent(btmodificar)
                .addGap(58, 58, 58)
                .addComponent(bteliminar)
                .addGap(48, 48, 48)
                .addComponent(btnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btsalir)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btagregar)
                    .addComponent(btmodificar)
                    .addComponent(bteliminar)
                    .addComponent(btnuevo)
                    .addComponent(btsalir))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 600, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Razón Social", "Cuenta", "Fecha de Ingreso", "Ruc"
            }
        ));
        Tabla.setFocusable(false);
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 600, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        // TODO add your handling code here:
        ingresar ingre = new ingresar();
        ingre.setVisible(true);
        ingre.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btregresarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
        actualizar();
        limpiarTabla();
        listar(); 
        nuevo();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btagregarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila = Tabla.getSelectedRow();
        if(fila == - 1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fiila");
        }else{
            String id = Tabla.getValueAt(fila, 0) .toString();
            String nombre = Tabla.getValueAt(fila, 1) .toString();
            String razon_social = Tabla.getValueAt(fila, 2) .toString();
            String cuenta = Tabla.getValueAt(fila, 3) .toString();
            String fecha_ingreso = Tabla.getValueAt(fila, 4) .toString();
            String ruc = Tabla.getValueAt(fila, 5) .toString();
            txtid.setText(id);
            txtnombres.setText(nombre);
            txtrazon_social.setText(razon_social);
            txtcuenta.setText(cuenta);
            txtfecha_ingreso.setText(fecha_ingreso);
            txtruc.setText(ruc);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    void agregar()
    {
        try
        {
            //realizamos una validacion con una condicional para verificar que los capos esten llenos
            if(!(txtid.getText().isEmpty()) || !(txtnombres.getText().isEmpty()) || !(txtrazon_social.getText().isEmpty()) || !(txtcuenta.getText().isEmpty()) || !(txtfecha_ingreso.getText().isEmpty()) || !(txtruc.getText().isEmpty()))
            {
                String id = txtid.getText();
                String nombre = txtnombres.getText();
                String razon_social = txtrazon_social.getText();
                String cuenta = txtcuenta.getText();
                String fecha_ingreso = txtfecha_ingreso.getText();
                String ruc = txtruc.getText();
                Object[] ob = new Object[6];
                ob[0] = id;
                ob[1] = nombre;
                ob[2] = razon_social;
                ob[3] = cuenta;
                ob[4] = fecha_ingreso;
                ob[5] = ruc;
                bandao.add(ob);
            }
            else
            {
                throw new ingresarbancoexception("Se deben llenar los campos");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    void actualizar()
    {
        try
        {
            int fila = Tabla.getSelectedRow();
            if (fila == - 1)
            {
               throw new ingresarbancoexception("Seleciones una dato amodificar");
                
            }
        else
        {
             String id = txtid.getText();
             String nombre = txtnombres.getText();
             String razon_social = txtrazon_social.getText();
             String cuenta = txtcuenta.getText();
             String fecha_ingreso = txtfecha_ingreso.getText();
             String ruc = txtruc.getText();

             
             //creamos nuestro objeto a enviar para la modificacion de los datos
             Object[] obj = new Object[6];
             obj[0] = Integer.parseInt(id);
             obj[1] = nombre;
             obj[2] = razon_social;
             obj[3] = Integer.parseInt(cuenta);
             obj[4] = fecha_ingreso;
             obj[5] = Integer.parseInt(ruc);
             bandao.actualizar(obj);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);   
        }
        
    }
    
    void eliminar()
    {
        int fil = Tabla.getSelectedRow();
        
        try
        {
            if (fil == - 1)
            {
                throw new ingresarbancoexception("ebe seleccionar una filar");
            }
            else
            {
                int fila = Tabla.getSelectedRow();
                int ids = Integer.parseInt(Tabla.getValueAt(fila, 0) .toString());
                bandao.eliminar(ids);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);   
        }
       
    }
    
    void nuevo()
    {
        txtid.setText("");
        txtnombres.setText("");
        txtrazon_social.setText("");
        txtcuenta.setText("");
        txtfecha_ingreso.setText("");
        txtruc.setText("");
        txtid.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i = 0; i < modelo.getRowCount(); i ++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btagregar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtfecha_ingreso;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtrazon_social;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}
