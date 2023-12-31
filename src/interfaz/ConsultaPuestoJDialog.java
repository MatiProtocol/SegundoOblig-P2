//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ConsultaPuestoJDialog extends javax.swing.JDialog {

    private Sistema sistema;
    private Puesto seleccionado;
    private String[] postulExportar;

    public ConsultaPuestoJDialog (java.awt.Frame parent, boolean modal, Sistema sistema) {
        super(parent, modal);
        this.sistema = sistema;
        this.setResizable(false);
        initComponents();
        ArrayList<Puesto> puestos = sistema.getPuestos();

        String[] todosPuestos = new String[puestos.size()];
        for (int i = 0; i < todosPuestos.length; i++) {
            todosPuestos[i] = "" + puestos.get(i);
        }

        lstPuestos.setListData(todosPuestos);

        String[] sinPostul = new String[0];
        lstPostulantes.setListData(sinPostul);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestos = new javax.swing.JList<>();
        lblPuest = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNivel = new javax.swing.JLabel();
        spnNivel = new javax.swing.JSpinner();
        btnConsultar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblPostu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPostulantes = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Consultar por puesto");

        lstPuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstPuestos);

        lblPuest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPuest.setText("Puestos:");

        lblNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNivel.setText("Nivel:");

        spnNivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("Consultar por los postulantes habilitados para el puesto.");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblPostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPostu.setText("Postulantes:");

        lstPostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstPostulantes);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.setToolTipText("Crear un archivo de texto con los postulantes.");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportar)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPuest)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNivel)
                                .addGap(80, 80, 80)
                                .addComponent(spnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btnConsultar))
                            .addComponent(lblPostu)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblTitulo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPuest)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivel)
                    .addComponent(spnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPostu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExportar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (lstPuestos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Ningún puesto seleccionado.");
        } else {
            ArrayList<Puesto> puestos = sistema.getPuestos();
            int nivel = (Integer) spnNivel.getValue();
            String formato = lstPuestos.getSelectedValue();

            for (int i = 0; i < puestos.size(); i++) {
                if (formato.equals(puestos.get(i).getNombre())) {
                    formato = puestos.get(i).getTipo();
                    this.seleccionado = puestos.get(i);
                }
            }

            ArrayList<Postulante> todosPost = sistema.getPostulantes();
            ArrayList<Postulante> soloPost = new ArrayList<>();

            for (int i = 0; i < todosPost.size(); i++) {
                boolean chequeado = true;
                if (todosPost.get(i).getEntrevistas().size() == 0) {
                    chequeado = false;
                }
                if (!(formato.equals(todosPost.get(i).getTipoTrabajo()))) {
                    chequeado = false;
                }
                int indexNivel = 0;
                for (int j = 0; j < todosPost.get(i).getNiveles().size(); j++) {
                    if (todosPost.get(i).getConocimiento().get(j).getNombre().equalsIgnoreCase(this.seleccionado.getTemasRequeridos().get(j).getNombre())) {
                        indexNivel = j;
                    }
                }
                if (nivel > todosPost.get(i).getNiveles().get(indexNivel)) {
                    chequeado = false;
                }

                if (chequeado) {
                    soloPost.add(todosPost.get(i));
                }

            }

            //postOrdNivel(soloPost);
            String[] postCumplen = new String[soloPost.size()];
            for (int i = 0; i < postCumplen.length; i++) {
                postCumplen[i] = "" + soloPost.get(i);
            }
            lstPostulantes.setListData(postCumplen);
            this.postulExportar = postCumplen;
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        if (lstPostulantes.getLastVisibleIndex() == -1) {
            JOptionPane.showMessageDialog(this, "No hay postulantes para exportar.");
        } else {
            ArchivoLectura al = new ArchivoLectura("Consulta.txt");
            ArchivoGrabacion ag = new ArchivoGrabacion("Consulta.txt");
            

            for (int i = 0; i < this.postulExportar.length; i++) {
                ag.grabarLinea(this.postulExportar[i]);
            }
            ag.cerrar();
            al.cerrar();
            this.setVisible(false);
        }


    }//GEN-LAST:event_btnExportarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPostu;
    private javax.swing.JLabel lblPuest;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstPostulantes;
    private javax.swing.JList<String> lstPuestos;
    private javax.swing.JSpinner spnNivel;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Postulante> postOrdNivel (ArrayList<Postulante> unList) {
        Collections.sort(unList);
        //Collections.sor
        return unList;
    }

}
