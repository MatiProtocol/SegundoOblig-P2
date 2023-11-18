//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;

import dominio.Sistema;
import java.io.*;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private Sistema modelo;

    public Inicio (Sistema sistema) {
        initComponents();
        this.modelo = sistema;
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDatosGuardados = new javax.swing.JButton();
        btnSistemaVacio = new javax.swing.JButton();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDatosGuardados.setText("Datos Guardados");
        btnDatosGuardados.setToolTipText("Iniciar programa con datos locales.");
        btnDatosGuardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosGuardadosActionPerformed(evt);
            }
        });

        btnSistemaVacio.setText("Sistema Vacío");
        btnSistemaVacio.setToolTipText("Iniciar programa sin datos previos.");
        btnSistemaVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaVacioActionPerformed(evt);
            }
        });

        JLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel1.setText("Gestión");

        JLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel2.setText("Programa para la gestión de personal hecho por Valentino Barreiro y Matías Ohanian");

        JLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel3.setText("A continuación, seleccióne si quiere empezar con los datos guardados localmente o sin ningún dato previo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnDatosGuardados, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSistemaVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabel1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(JLabel3)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatosGuardados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSistemaVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosGuardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosGuardadosActionPerformed
        
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(".\\Guardado"));
            Sistema sistAnterior = (Sistema) input.readObject();
            modelo = sistAnterior;
            Principal vent = new Principal(modelo);
            vent.setVisible(true);
            this.setVisible(false);
        
        } catch (FileNotFoundException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(this, "Archivo de datos no encontrdo.");
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(this, "No fue posible leer los datos.");
        }


    }//GEN-LAST:event_btnDatosGuardadosActionPerformed

    private void btnSistemaVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaVacioActionPerformed

        Principal vent = new Principal(modelo);
        this.setVisible(false);
        vent.setVisible(true);

    }//GEN-LAST:event_btnSistemaVacioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JButton btnDatosGuardados;
    private javax.swing.JButton btnSistemaVacio;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
