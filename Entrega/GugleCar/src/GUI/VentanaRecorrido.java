package GUI;

import Representacion3D.GestorEscena;

import javax.media.j3d.Canvas3D;
import javax.swing.*;
import java.awt.*;

/**
 * Clase que creará una ventana para mostrar la representación 3D.
 * @author Elías Méndez García implementación del esqueleto.
 * @author Eila Gómez Hidalgo corrección del tamaño de la ventana.
 */
public class VentanaRecorrido extends JDialog {

    /**
     * Constructor
     * @author Elías Méndez García implementación.
     * @author Eila Gómez Hidalgo correción del tamaño de la ventana.
     * @param parent ventana que crea el dialogo.
     * @param modal modal
     * @param canvas canvas que va a dibujar los elementos del 3D.
     */
    public VentanaRecorrido(VentanaControl parent, boolean modal, Canvas3D canvas) {
        super(parent, modal);

        initComponents();

        setSize(600, 600);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(canvas, BorderLayout.CENTER);
        pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @author Eila Gómez Hidalgo
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setTitle("Visualización 3D - Gugel Car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    // End of variables declaration
}
