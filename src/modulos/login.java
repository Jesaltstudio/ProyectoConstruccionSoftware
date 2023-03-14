package modulos;

import exceptions.loginexception;
import javax.swing.JOptionPane;
import modelo.EntidadUsuario;
import modelo.DAO.UsuarioDao;

/**
 *
 * @author aleja
 */
public class login extends javax.swing.JFrame {
 
    //llamamos a nuestras clases UsuarioDao y EntidadUsuario done estan declaradas las variables
    UsuarioDao udao=new UsuarioDao();
    EntidadUsuario us=new EntidadUsuario();
   
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);//linea de comando para centrar la ventana.
        //estos comandos solo son para evitar que pongamos el usuario y contraseña cada vez que ingresemos al sistema
        txtUser.setText("jesalt");
        txtPass.setText("saltos");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btsalir = new javax.swing.JButton();
        btingresar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btsalir.setText("Salir ");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        btingresar.setText("Ingresar");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 192, 210, 30));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/us.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel3.setText("Gestión Administrativa de Servicio de Venta y Facturación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("USUARIO : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("CLAVE : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 498, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
        // llamamos a nuestro metodo validar
        validar();
    }//GEN-LAST:event_btingresarActionPerformed

    //declaramos nuestro metodo validar 
    public void validar(){
    
        //donde definimos que el dni y el user son los unicos datos que debe ingresar
        String dni=txtPass.getText();
        String user=txtUser.getText();
        try{
            //sentenciamos una restriccion if-else
            if (txtUser.getText().equals("") || txtPass.getText().equals("")){
                //donde si ingresamos sin colocar datos validos nos muestre un mensaje de error
                //JOptionPane.showMessageDialog(this, "Debe Ingresar Datos En Las Cajas de Texto");
                //txtUser.requestFocus();
                throw new loginexception("Rellenar los datos requeridos en las cajas de textos");
            }else{
                //caso contrario valide el ingreso del user y dni
                us=udao.ValidarUsuario(dni, user);
                try{
                //sin embargo restringimos con otra sentencia if - else
                if (us.getUser() !=null && us.getDni() !=null){
                    //donde si los datos son validos nos dirija a nuestro menu principal
                    menuprincipal p = new menuprincipal();
                    p.setVisible(true);
                    dispose();
                }else{
                    //caso contrario nos envie un mensaje de error indicando que debemos ingresar datos 
                    //validos
                    /*JOptionPane.showMessageDialog(this, "Debe ingresar usuarios validos");*/
                    throw new loginexception("Datos ingresados no son correctos o no estan registrados");
                   // txtUser.requestFocus();
                }
            }catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btingresar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
