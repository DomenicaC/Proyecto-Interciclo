/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.codigoQR;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import ec.edu.ups.principal.Menu;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class GenerarQR extends javax.swing.JInternalFrame {

    //import ec.edu.ups.principal.Menu;
    /**
     * Creates new form GenerarQR
     */
    int alto;
    int ancho;
    public static String x;

    public GenerarQR() {
        initComponents();
        x = "x";

        int a = Menu.desktopPane.getWidth() - this.getWidth();
        int b = Menu.desktopPane.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jlbRuta = new javax.swing.JLabel();
        jpnCodigo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbTam = new javax.swing.JComboBox();
        txtNombre = new javax.swing.JTextField();
        txtDato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("Generardor de Codigo QR");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Nombre Archivo:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Datos que contendrá el codigo:");

        btnGenerar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jlbRuta.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jlbRuta.setText("Ruta:");

        jpnCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo QR"));

        javax.swing.GroupLayout jpnCodigoLayout = new javax.swing.GroupLayout(jpnCodigo);
        jpnCodigo.setLayout(jpnCodigoLayout);
        jpnCodigoLayout.setHorizontalGroup(
            jpnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jpnCodigoLayout.setVerticalGroup(
            jpnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Tamaño:");

        jcbTam.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jcbTam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir tamaño", "100", "200", "300", "400", "500" }));

        txtNombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDato.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre + .gif");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jlbRuta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcbTam, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerar)
                            .addComponent(btnNuevo)
                            .addComponent(btnCancelar))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerar)
                        .addGap(13, 13, 13)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlbRuta)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        String nombre = txtNombre.getText();
        String dato = txtDato.getText();
        String RutaImagen = "src\\ec\\edu\\ups\\codigoQRImagene\\" + nombre;
        String FormatoImagen = "gif";

        String seleccionado = jcbTam.getSelectedItem().toString();
        if (seleccionado.equals("Elegir tamaño")) {

            JOptionPane.showMessageDialog(this, "No ha elegido el tamaño \n Porfavor elija una opción");

        } else if (seleccionado.equals("100")) {

            ancho = 100;
            alto = 100;

        } else if (seleccionado.equals("200")) {

            ancho = 200;
            alto = 200;

        } else if (seleccionado.equals("300")) {

            ancho = 300;
            alto = 300;

        } else if (seleccionado.equals("400")) {

            ancho = 400;
            alto = 400;

        } else if (seleccionado.equals("500")) {

            ancho = 500;
            alto = 500;

        }

        BitMatrix bm;
        Writer writer = new QRCodeWriter();

        try {

            //generar matriz- codificar lo que se guarda en la variable datos
            bm = writer.encode(dato, BarcodeFormat.QR_CODE, ancho, alto);

            BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);

            /**
             * Lo siguiente que realizaremos será escribir la matriz de datos
             * con dos ciclos anidados, iterando a través de lo ancho y alto de
             * la imagen
             */
            for (int i = 0; i < ancho; i++) {
                for (int j = 0; j < alto; j++) {

                    int grayValue = (bm.get(j, i) ? 1 : 0) & 0xff;
                    imagen.setRGB(j, i, grayValue == 0 ? 0 : 0xFFFFFF);

                }
            }

            //invertir colores
            imagen = invertirColor(imagen);

            try {
                //guardar imagen
                FileOutputStream qrCode = new FileOutputStream(RutaImagen);
                ImageIO.write(imagen, FormatoImagen, qrCode);

                qrCode.close();

            } catch (FileNotFoundException ex) {
                System.err.println("Archivo no encontrado " + ex.toString());
            } catch (IOException ex) {
                System.err.println("Error " + ex.toString());
            }

            Desktop d = Desktop.getDesktop();
            try {
                d.open(new File(RutaImagen));
            } catch (IOException ex) {
                System.err.println("Error " + ex.toString());
            }

            jlbRuta.setText("Ruta: " + RutaImagen);
            //jpnCodigo.contains(RutaImagen);

        } catch (WriterException ex) {
            System.err.println("Error de escritura " + ex.toString());
        }

        /*  jPanel1.setLayout(new java.awt.BorderLayout());
         jPanel1.add(qrCode, BorderLayout.CENTER);
         jPanel1.validate();*/

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        txtDato.setText("");
        txtNombre.setText("");
        //jpnCodigo.c
        jlbRuta.setText("Ruta: ");

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
        this.dispose();
        x = null;

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        x = null;

    }//GEN-LAST:event_formInternalFrameClosing

    private BufferedImage invertirColor(BufferedImage imagen) {

        /**
         * Debido a un bug, las imágenes se crean con los colores invertidos (el
         * negro por el blanco y viceversa) por lo cual es necesario invertir
         * los colores de la imagen
         */
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {

                int rgb = imagen.getRGB(i, j);
                if (rgb == -16777216) {

                    imagen.setRGB(i, j, -1);

                } else {

                    imagen.setRGB(i, j, -16777216);

                }
            }
        }
        return imagen;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jcbTam;
    private javax.swing.JLabel jlbRuta;
    private javax.swing.JPanel jpnCodigo;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
