/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

/**
 *
 * @author SIERRA
 */
public class Principal extends javax.swing.JFrame {

    public String dnis [] = new String [10];
    public String nombres [] = new String [10];
    public String apellidos [] = new String [10];
    public String direcciones [] = new String [10];
    public String telefonos [] = new String [10];
    public String fechasNacimiento [] = new String [10];
    public int indice = 0;
    
    public Principal() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFNac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnAnterior1 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("AGENDA ELECTRÓNICA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 139, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 139, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 139, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 139, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 139, -1));

        txtFNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNacActionPerformed(evt);
            }
        });
        jPanel1.add(txtFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 139, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("DIRECCIÓN:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("TELÉFONO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 180, 130, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("APELLIDO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("F. NAC:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 80, 40));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 204, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 140, 50));

        btnAnterior1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnterior1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skip-backward.png"))); // NOI18N
        btnAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, 40));

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skip-forward.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 40, 40));

        txtIndice.setText("0");
        txtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiceActionPerformed(evt);
            }
        });
        jPanel1.add(txtIndice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 47, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 255, 255));
        jLabel15.setText("ÍNDICE:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 70, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtFNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNacActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //Traigo mi indice y lo guardo
        indice = Integer.parseInt(txtIndice.getText());

        //Asigno los valores de los campos de la posicion actual del indice
        dnis[indice] = txtDNI.getText();
        nombres[indice] = txtNombre.getText();
        apellidos[indice] = txtApellido.getText();
        direcciones[indice] = txtDireccion.getText();
        telefonos[indice] = txtTelefono.getText();
        fechasNacimiento[indice] = txtFNac.getText();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior1ActionPerformed

        //Traigo mi indice y lo guardo
        indice = Integer.parseInt(txtIndice.getText());

        //Controlo que el contador de indice no se pase
        if (indice > 0) {
            indice = indice - 1;
        }

        //Seteo mi indice modificado
        txtIndice.setText(Integer.toString(indice));

        //Seteo todos los valores que estan guardados en los vectores en esta posicion
        txtDNI.setText(dnis[indice]);
        txtNombre.setText(nombres[indice]);
        txtApellido.setText(apellidos[indice]);
        txtDireccion.setText(direcciones[indice]);
        txtTelefono.setText(telefonos[indice]);
        txtFNac.setText(fechasNacimiento[indice]);
    }//GEN-LAST:event_btnAnterior1ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        indice = Integer.parseInt(txtIndice.getText());

        //Controlo que el contador de indice no se pase
        if (indice < 9) {
            indice = indice + 1;
        }
        //Seteo mi indice modificado
        txtIndice.setText(Integer.toString(indice));

        //Seteo todos los valores que estan guardados en los vectores en esta posicion
        txtDNI.setText(dnis[indice]);
        txtNombre.setText(nombres[indice]);
        txtApellido.setText(apellidos[indice]);
        txtDireccion.setText(direcciones[indice]);
        txtTelefono.setText(telefonos[indice]);
        txtFNac.setText(fechasNacimiento[indice]);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiceActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFNac;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
