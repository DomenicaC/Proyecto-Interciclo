/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.codigoQR.GenerarQR;
import ec.edu.ups.codigoQR.LectorQR;
import ec.edu.ups.persona.BuscarPersona;
import ec.edu.ups.persona.CrearPersona;
import ec.edu.ups.persona.ListarPersona;
import ec.edu.ups.persona.ModificarPersona;
import ec.edu.ups.vehiculo.BuscarAuto;
import ec.edu.ups.vehiculo.CrearAuto;
import ec.edu.ups.vehiculo.ListarAuto;
import ec.edu.ups.vehiculo.ModificarAuto;

import ec.edu.ups.vehiculoRobado.CrearAutoRobado;
import ec.edu.ups.vehiculoRobado.ListarAutoRobado;
import ec.edu.ups.vista.parqueo.PuestoParqueo;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;

/**
 *
 * @author Domenica Cañizares
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private GenerarQR genQR;
    private LectorQR lecQR;

    private CrearPersona crearpersona;
    private BuscarPersona buscarpersona;
    private ModificarPersona modificarpersona;
    private ListarPersona eliminarpersona;

    private CrearAuto crearauto;
    private BuscarAuto buscarauto;
    private ModificarAuto modificarauto;
    private ListarAuto listarauto;

    private CrearAutoRobado autorobado;
   
    private ListarAutoRobado listarautorobado;
    

    private PuestoParqueo puestoP;

    public Menu() {

        initComponents();

        this.setTitle("PARKING PARKIANDO");
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(("src/ec/edu/ups/principal/estacion.png")).getImage());
        desktopPane1.setBorder(new Fondo());
        this.setExtendedState(Menu.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        itemPuesto = new javax.swing.JMenuItem();
        helpMenu5 = new javax.swing.JMenu();
        itemGene = new javax.swing.JMenuItem();
        itemLector = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/principal/logo-ups-home.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        desktopPane1.add(jLabel1);
        jLabel1.setBounds(530, 0, 290, 80);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Link Proyecto");
        desktopPane1.add(jTextField1);
        jTextField1.setBounds(10, 510, 140, 28);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("GitHub");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane1.add(jButton2);
        jButton2.setBounds(20, 560, 95, 31);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/principal/Login_37128.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane1.add(jButton1);
        jButton1.setBounds(20, 610, 100, 80);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Persona");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Crear");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Buscar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Modificar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Listar");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Vehiculo");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Crear");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Buscar");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Modificar");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Listar");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Vehiculo Robado");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Crear");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        jMenuItem1.setText("Modificar");
        helpMenu.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        helpMenu.add(jMenuItem2);

        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem3);

        menuBar.add(helpMenu);

        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Parqueo");

        itemPuesto.setMnemonic('c');
        itemPuesto.setText("Puesto de Parqueo");
        itemPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPuestoActionPerformed(evt);
            }
        });
        helpMenu1.add(itemPuesto);

        menuBar.add(helpMenu1);

        helpMenu5.setMnemonic('h');
        helpMenu5.setText("Codigo QR");

        itemGene.setMnemonic('c');
        itemGene.setText("Generar Codigo QR");
        itemGene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGeneActionPerformed(evt);
            }
        });
        helpMenu5.add(itemGene);

        itemLector.setMnemonic('a');
        itemLector.setText("Lector de Codigo QR");
        itemLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLectorActionPerformed(evt);
            }
        });
        helpMenu5.add(itemLector);

        menuBar.add(helpMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        String x = ListarPersona.x;
        try {
            if (x == null) {
                if (eliminarpersona == null || eliminarpersona.isVisible() == false) {
                    eliminarpersona = new ListarPersona();
                    desktopPane1.add(eliminarpersona);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itemGeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGeneActionPerformed

        String x = GenerarQR.x;
        try {
            if (x == null) {
                if (genQR == null || genQR.isVisible() == false) {
                    genQR = new GenerarQR();
                    desktopPane1.add(genQR);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemGeneActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        String x = CrearPersona.x;
        try {
            if (x == null) {
                if (crearpersona == null || crearpersona.isVisible() == false) {
                    crearpersona = new CrearPersona();
                    desktopPane1.add(crearpersona);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        String x = BuscarPersona.x;
        try {
            if (x == null) {
                if (buscarpersona == null || buscarpersona.isVisible() == false) {
                    buscarpersona = new BuscarPersona();
                    desktopPane1.add(buscarpersona);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed

        String x = ModificarPersona.x;
        try {
            if (x == null) {
                if (modificarpersona == null || modificarpersona.isVisible() == false) {
                    modificarpersona = new ModificarPersona();
                    desktopPane1.add(modificarpersona);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed

        String x = CrearAuto.x;
        try {
            if (x == null) {
                if (crearauto == null || crearauto.isVisible() == false) {
                    crearauto = new CrearAuto();
                    desktopPane1.add(crearauto);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed

        String x = BuscarAuto.x;
        try {
            if (x == null) {
                if (buscarauto == null || buscarauto.isVisible() == false) {
                    buscarauto = new BuscarAuto();
                    desktopPane1.add(buscarauto);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed

        String x = ModificarAuto.x;
        try {
            if (x == null) {
                if (modificarauto == null || modificarauto.isVisible() == false) {
                    modificarauto = new ModificarAuto();
                    desktopPane1.add(modificarauto);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
        String x = ListarAuto.x;
        try {
            if (x == null) {
                if (listarauto == null || listarauto.isVisible() == false) {
                    listarauto = new ListarAuto();
                    desktopPane1.add(listarauto);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void itemLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLectorActionPerformed

        String x = LectorQR.x;
        try {
            if (x == null) {
                if (lecQR == null || lecQR.isVisible() == false) {
                    lecQR = new LectorQR();
                    desktopPane1.add(lecQR);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemLectorActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        String x = CrearAutoRobado.x;
        try {
            if (x == null) {
                if (autorobado == null || autorobado.isVisible() == false) {
                    autorobado = new CrearAutoRobado();
                    desktopPane1.add(autorobado);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/DomenicaC/Proyecto-Interciclo"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error el URL no existe");
        }
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/DomenicaC/Proyecto-Interciclo"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error el URL no existe");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPuestoActionPerformed

        String x = PuestoParqueo.x;
        try {
            if (x == null) {
                if (puestoP == null || puestoP.isVisible() == false) {
                    puestoP = new PuestoParqueo();
                    desktopPane1.add(puestoP);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemPuestoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here: 
         String x = ListarAutoRobado.x;
        try {
            if (x == null) {
                if (listarautorobado == null || listarautorobado.isVisible() == false) {
                    listarautorobado = new ListarAutoRobado();
                    desktopPane1.add(listarautorobado);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    public static javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenu helpMenu5;
    private javax.swing.JMenuItem itemGene;
    private javax.swing.JMenuItem itemLector;
    private javax.swing.JMenuItem itemPuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
