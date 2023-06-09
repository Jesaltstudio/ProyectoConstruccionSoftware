/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import exceptions.ingresarFacturaException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DAO.ClienteDao;
import modulos.ingresar;

/**
 *
 * @author aleja
 */
public class ingresarfacturas extends javax.swing.JFrame {

    /*llamamos a nuestros modelo para que funcione nuestras sentencias
    la cual declararemos las clases donde esta nuestras variables*/
    ClienteDao cliendao=new ClienteDao();
    /*Instanciamos nuestra clase default table model*/
    DefaultTableModel modelo=new DefaultTableModel();
   
    /*En listamos los datos de la entidad cliente con el metodo listar*/
    void listar(){
        List<Cliente> lista=cliendao.listar();
        modelo=(DefaultTableModel)jTable1.getModel();
        Object[] ob=new Object[7];
        for (int i = 0; i < lista.size(); i++){
            ob[0]=lista.get(i) .getId();
            ob[1]=lista.get(i) .getNombre();
            ob[2]=lista.get(i) .getApellido();
            ob[3]=lista.get(i) .getEdad();
            ob[4]=lista.get(i) .getCelular();
            ob[5]=lista.get(i) .getCedula();
            ob[6]=lista.get(i) .getDireccion();
            modelo.addRow(ob);
        }
        /*llamamos a nuestra tabla*/
        jTable1.setModel(modelo);
    }

    public ingresarfacturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        /*en listamos el metodo listar declarado*/
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btagregar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btregresar8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel3.setText("N°");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Valor:");

        jLabel7.setText("Dirección:");

        jLabel8.setText("Celular:");

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha:");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
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
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcelular)))
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 600, 130));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Módulo de Ingresar Facturas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

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

        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
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
                .addComponent(btconsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
                    .addComponent(btconsultar)
                    .addComponent(btsalir))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 600, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Nombres", "Apellidos", "Valor", "Celular", "Dirección", "Fecha"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        btregresar8.setText("Regresar");
        btregresar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresar8ActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btregresar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresar8ActionPerformed
        // TODO add your handling code here:
        ingresar ingre = new ingresar();
        ingre.setVisible(true);
        ingre.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btregresar8ActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btagregarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        // TODO add your handling code here:
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btconsultarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int fila = jTable1.getSelectedRow();
        if (fila == - 1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            String id = jTable1.getValueAt(fila, 0) .toString();
            String nombre = jTable1.getValueAt(fila, 1) .toString();
            String apellido =jTable1.getValueAt(fila, 2) .toString();
            String valor = jTable1.getValueAt(fila, 3) .toString();
            String celular= jTable1.getValueAt(fila, 4) .toString();
            String direccion = jTable1.getValueAt(fila, 5) .toString();
            String fecha = jTable1.getValueAt(fila, 6) .toString();
            
            txtNo.setText(id);
            txtnombre.setText(nombre);
            txtapellido.setText(apellido);
            txtvalor.setText(valor);
            txtcelular.setText(celular);
            txtdireccion.setText(direccion);
            txtfecha.setText(fecha);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    
    void agregar()
    {
        try
        {
             //realizamos una validacion con una condicional para verificar que los capos esten llenos
            if(!(txtNo.getText().isEmpty()) || !(txtnombre.getText().isEmpty()) || !(txtapellido.getText().isEmpty()) || !(txtvalor.getText().isEmpty()) || !(txtfecha.getText().isEmpty()) || !(txtcelular.getText().isEmpty()) || !(txtdireccion.getText().isEmpty()))
            {
                String No = txtNo.getText();
                String nombre = txtnombre.getText();
                String apellido = txtapellido.getText();
                String valor = txtvalor.getText();
                String fecha = txtfecha.getText();
                String celular = txtcelular.getText();
                String direccion = txtdireccion.getText();


                Object[] ob = new Object[6];
                ob[0] = No;
                ob[1] = nombre;
                ob[2] = apellido;
                ob[3] = valor;
                ob[4] = fecha;
                ob[5] = celular;
                ob[6] = direccion;
                cliendao.add(ob);
            }
            else
            {
                throw new ingresarFacturaException("Debe llenar los campos");
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
            int fila = jTable1.getSelectedRow();
            if (fila == - 1)
            {
                throw new ingresarFacturaException("Seleccione fila y dato a Modificar");
            }
            else
            {
                 String No = txtNo.getText();
                String nombre = txtnombre.getText();
                String apellido = txtapellido.getText();
                String valor = txtvalor.getText();
                String fecha = txtfecha.getText();
                String celular = txtcelular.getText();
                String direccion = txtdireccion.getText();


                 //creamos nuestro objeto a enviar para la modificacion de los datos
                Object[] ob = new Object[6];
                ob[0] = No;
                ob[1] = nombre;
                ob[2] = apellido;
                ob[3] = valor;
                ob[4] = fecha;
                ob[5] = celular;
                ob[6] = direccion;
                cliendao.actualizar(ob);
            }
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    void eliminar()
    {
        int fil = jTable1.getSelectedRow();
        
        try
        {
            if (fil == - 1)
            {
                throw new ingresarFacturaException("Debe selecionar una fila");
            }
            else
            {
                int fila = jTable1.getSelectedRow();
                int ids = Integer.parseInt(jTable1.getValueAt(fila, 0) .toString());
                cliendao.eliminar(ids);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);     
        }
       
    }
    
    void nuevo()
    {
        txtNo.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtvalor.setText("");
        txtfecha.setText("");
        txtcelular.setText("");
        txtdireccion.setText("");
        txtNo.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i = 0; i < modelo.getRowCount(); i ++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btregresar8;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
