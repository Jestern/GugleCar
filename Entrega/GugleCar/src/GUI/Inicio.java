/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import es.upv.dsic.gti_ia.core.AgentsConnection;
import org.apache.qpid.transport.ConnectionException;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para crear un diálogo pidiendo el nombre de usuario, contraseña y mapa para ejecutar el simulador.
 * @author Eila Gómez Hidalgo implementación del esqueleto y los componentes(Con el editor), constructor, main y mensajes de error.
 * @author Elías Méndez García correcciones en el main y funcionalidad de botones.
 */
public class Inicio extends javax.swing.JDialog {

    private static final String server = "isg2.ugr.es";
    private static final String controller = "Bellatrix";
    private static final int port = 6000;
    private VentanaControl ventana;

    /**
     * Creates new form Inicio
     * @author Eila Gómez Hidalgo
     */
    public Inicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Inicio Gugel Vehicles");
        this.input_usuario.setText("");
        this.input_contrasenia.setText("");
        this.porcentaje.setText(Integer.toString(100));
        ventana = (VentanaControl) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @author Eila Gómez Hidalgo
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_mapa = new javax.swing.JComboBox<>();
        input_contrasenia = new javax.swing.JTextField();
        input_usuario = new javax.swing.JTextField();
        button_iniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        porcentaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Mapa:");

        input_mapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "map1", "map2", "map3", "map4", "map5", "map6", "map7", "map8", "map9", "map10", "map100", "map200", "map300", "map400", "map500", "map600", "map700", "map800", "map900", "map1000" }));

        button_iniciar.setText("Iniciar");
        button_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_iniciarActionPerformed(evt);
            }
        });

        jLabel4.setText("Porcentaje de exploración:");

        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(input_usuario)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porcentaje)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(button_iniciar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
    }//GEN-LAST:event_porcentajeActionPerformed

    /**
     * Método para ejecutar cuando se le de al botón de iniciar sesión.
     * @author Elías Méndez García
     * @param evt Evento al pulsar el botón
     */
    private void button_iniciarActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtener el usuario y la contraseña
        String username = input_usuario.getText();
        String password = input_contrasenia.getText();
        String mapa = input_mapa.getItemAt(input_mapa.getSelectedIndex());
        float por = Float.valueOf(porcentaje.getText());

        if(por <= 100 && por > 0) {
            // Conectar con el servidor magentix remoto.
            try {
                AgentsConnection.connect(server, port, controller, username, password, false);
                ventana.setMapa(mapa);
                ventana.setPorcentaje(por);
                ventana.lanzarAgentes();
                this.dispose();
                ventana.showWindow();
            } catch (ConnectionException e) {
                lanzarMensajeError("No se ha podido conectar con el servidor. \nUsuario/contraseña incorrectos o problemas" +
                        " con la conexion.");
            } catch (Exception e) {
                lanzarMensajeError("Alguno de los nombres de los agentes ya está en uso.");
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }                                              

    /**
     * Método para lanzar un mensaje de error visual si ha ocurrido algo inesperado.
     * @author Eila Gómez Hidalgo
     * @param s Mensaje de error a mostrar en la ventana de error.
     */
    public void lanzarMensajeError(String s){
        JOptionPane.showMessageDialog(getParent(), s, "ERROR", JOptionPane.ERROR_MESSAGE);

    }

    /**
     * Main de la aplicación.
     * @author Eila Gómez Hidalgo
     * @author Elías Méndez García
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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaControl ventana = new VentanaControl();
                Inicio dialog = new Inicio(ventana, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_iniciar;
    private javax.swing.JTextField input_contrasenia;
    private javax.swing.JComboBox<String> input_mapa;
    private javax.swing.JTextField input_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField porcentaje;
    // End of variables declaration//GEN-END:variables
}
