/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.codigoQR;

import ec.edu.ups.principal.Menu;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class LectorQR extends javax.swing.JInternalFrame {

    /**
     * Creates new form LectorQR
     */
    public static String x;

    public LectorQR() {
        initComponents();

        x = "x";

        int a = Menu.DesktopPane.getWidth() - this.getWidth();
        int b = Menu.DesktopPane.getHeight() - this.getHeight();

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

        btnBuscar = new javax.swing.JButton();
        lblRuta = new javax.swing.JLabel();
        lblTam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        jlbRuta1 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

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

        btnBuscar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblRuta.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblRuta.setText("Ruta:");

        lblTam.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTam.setText("Tamaño archivo:");

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("Lector de Codigo QR");

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNombre.setText("Nombre Archivo:");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDatos.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblDatos.setText("Placa:");

        jlbRuta1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jlbRuta1.setText("Ubicacion:");

        txtUbicacion.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblFecha.setText("Fecha Modificacion:");

        lblImagen.setText("imagen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbRuta1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRuta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTam)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbRuta1)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatos)
                    .addComponent(lblTam))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblRuta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String RutaImagen = txtUbicacion.getText().trim();
        Reader lector = new MultiFormatReader();
        File ubicacion = new File(RutaImagen);
        System.out.println("Ubicacion " + ubicacion);
        BufferedImage imagen;

        if (ubicacion.exists()) {

            System.out.println("Archivo Encontrado");
            JOptionPane.showMessageDialog(this, "Archivo Encontrado");
            try {
                //decodificar imagen
                imagen = ImageIO.read(ubicacion);
                //formateo para interpretacion
                LuminanceSource fuente = new BufferedImageLuminanceSource(imagen);
                //crear mapa de bits
                BinaryBitmap mapabits = new BinaryBitmap(new HybridBinarizer(fuente));

                //obtener datos del codigo qr
                Result resultado = lector.decode(mapabits);
                System.out.println("Contenido mapa " + resultado.getText());
                lblDatos.setText("Placa: " + resultado.getText());

            } catch (NotFoundException ex) {
                System.err.println("Archivo no existe " + ex.toString());
            } catch (ChecksumException ex) {
                System.err.println("Error " + ex.toString());
            } catch (FormatException ex) {
                System.err.println("Error de formato " + ex.toString());
            } catch (IOException ex) {
                System.err.println("Error " + ex.toString());
            }

        }

        //nombre del archivo
        String nombre = ubicacion.getName();
        lblNombre.setText("Nombre Archivo: " + nombre);

        //ubicacion del archivo
        String path = ubicacion.getAbsolutePath().trim();
        lblRuta.setText("Ruta: " + path);

        //tamaño del archivo
        long tam = ubicacion.length();
        long kb = tam / 1024;
        lblTam.setText("Tamaño archivo: " + kb + " kb");

        //fehca de modificacion del archivo
        long fechaMod = ubicacion.lastModified();
        Date fecha = new Date(fechaMod);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaText = formatoFecha.format(fecha);
        lblFecha.setText("Fecha Modificacion: " + fechaText);

        ImageIcon imgs;
        imgs = new ImageIcon(RutaImagen);
        lblImagen.setIcon(imgs);

       /* Desktop d = Desktop.getDesktop();
        try {
            d.open(new File(RutaImagen));
        } catch (IOException ex) {
            System.err.println("Error " + ex.toString());
        }*/

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
        this.dispose();
        x = null;

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        x = null;

    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbRuta1;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTam;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
