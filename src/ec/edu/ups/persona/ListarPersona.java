package ec.edu.ups.persona;


import ec.edu.ups.controlador.ControladorPersona;
import static ec.edu.ups.persona.CrearPersona.x;
import ec.edu.ups.principal.Menu;
import java.util.Set;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Edison
 */
public class ListarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar
     */
    DefaultTableModel modelo;
    private ControladorPersona controladorPersona;
    public static String x;

    public ListarPersona() {
        initComponents();
        controladorPersona = new ControladorPersona();
        llenarDatos();   
        x = "x";
        int a = Menu.desktopPane1.getWidth() - this.getWidth();
        int b = Menu.desktopPane1.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
    }

    public void llenarDatos() {
        modelo = (DefaultTableModel) table.getModel();
        Set<Persona> lista = controladorPersona.Listar();
        for (Persona p : lista) {
            Object[] datos = {p.getCedula(),
            p.getNombre(),
            p.getApellido(),
            p.getEdad(),
            p.getDireccion()};
            modelo.addRow(datos);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PER_CEDULA", "PER_NOMBRE", "PER_APELLIDO", "PER_EDAD", "PER_DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        btnCerrar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setText("Listar  Persona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCerrar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
