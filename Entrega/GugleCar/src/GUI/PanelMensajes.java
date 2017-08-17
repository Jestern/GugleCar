/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.html.HTMLDocument;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.IOException;

/**
 * Clase que contiene un panel de texto donde se van mostrando las acciones que realiza el vehículo.
 * @author Eila Gómez Hidalgo implementacion del esqueleto
 * @author Elías Méndez García implementación de la funcionalidad.
 */
public class PanelMensajes extends javax.swing.JPanel implements Observador {

    /**
     * Contructor del panel mensajes.
     * Modifica el JtextPanel para que siempre haga scroll a la última linea que se ha añadido.
     * @author Elías Méndez García
     */
    public PanelMensajes() {
        initComponents();

        // hacer autoscroll con cada update
        DefaultCaret caret = (DefaultCaret) panel_mensajes.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
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

        label_mensajes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_mensajes = new javax.swing.JTextPane();

        label_mensajes.setText("Mensajes:");

        panel_mensajes.setEditable(false);
        panel_mensajes.setContentType("text/html");
        jScrollPane1.setViewportView(panel_mensajes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_mensajes)
                        .addGap(0, 331, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_mensajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_mensajes;
    private javax.swing.JTextPane panel_mensajes;

    /**
     * Método para manejar el evento de cuando se actualiza la información del observable
     * y actualizarla los componentes visuales.
     * @author Elías Méndez García
     */
    @Override
    public void manejarEvento(Object info) {
        String msg = (String) info;
        msg += "<br>";

        HTMLDocument doc=(HTMLDocument) panel_mensajes.getStyledDocument();

        try {
            doc.insertAfterEnd(doc.getCharacterElement(doc.getLength()), msg);
        } catch (BadLocationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // End of variables declaration//GEN-END:variables
}
