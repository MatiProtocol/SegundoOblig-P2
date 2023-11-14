package interfaz;

import dominio.*;
import java.awt.event.FocusEvent;

import java.util.*;
import javax.swing.JOptionPane;

public class RegistroPuestoJDialog extends javax.swing.JDialog {
    
    private Sistema sistema;
    private Tematica temas;
    private Puesto puesto;
    private ArrayList<String> todosGral;
    public RegistroPuestoJDialog (java.awt.Frame parent, boolean modal, Sistema sistema) {
        super(parent, modal);
        this.sistema = sistema;
        initComponents();
        /*lstTemaElegido.setSize(99, 150);
        lstTemasGral.setSize(99, 150);*/
        this.setResizable(false);
        
        ArrayList<Tematica> tema = new ArrayList<>();
        tema = this.sistema.getTematicas();
        
        String[] tematica = new String[tema.size()];
        for (int i = 0; i < tematica.length; i++) {
            tematica[i] = "" + tema.get(i).getNombre();
        }
        lstTemasGral.setListData(tematica);
        String[] sinElegidos = new String[0];
        
        lstTemaElegido.setListData(sinElegidos);
        todosGral = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTipo = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        rBtnRemoto = new javax.swing.JRadioButton();
        rBtnPresencial = new javax.swing.JRadioButton();
        rBtnMixto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemasGral = new javax.swing.JList<>();
        btnAgregarTema = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTemaElegido = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblListaTema = new javax.swing.JLabel();
        lblTElegido = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtFieldNombre = new javax.swing.JTextField();
        lblAddAdvertencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Registro de puesto.");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        btnGrpTipo.add(rBtnRemoto);
        rBtnRemoto.setText("Remoto");
        rBtnRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnRemotoActionPerformed(evt);
            }
        });

        btnGrpTipo.add(rBtnPresencial);
        rBtnPresencial.setText("Presencial");

        btnGrpTipo.add(rBtnMixto);
        rBtnMixto.setSelected(true);
        rBtnMixto.setText("Mixto");

        lstTemasGral.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTemasGral);

        btnAgregarTema.setText("Agregar");
        btnAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTemaActionPerformed(evt);
            }
        });

        lstTemaElegido.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstTemaElegido);

        lblListaTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblListaTema.setText("Lista de temas:");

        lblTElegido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTElegido.setText("Temas elegidos:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblAddAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rBtnMixto)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rBtnRemoto)
                                    .addGap(30, 30, 30)
                                    .addComponent(rBtnPresencial)
                                    .addGap(86, 86, 86)))
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAddAdvertencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblListaTema)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(btnAgregarTema)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTElegido)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rBtnRemoto)
                                .addComponent(rBtnPresencial)
                                .addComponent(rBtnMixto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnAgregarTema))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblListaTema))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(lblAddAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rBtnRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnRemotoActionPerformed

    private void btnAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTemaActionPerformed
        int indiceSel = lstTemasGral.getSelectedIndex();
        if (indiceSel == -1) {
            lblAddAdvertencia.setText("Primero debe seleccionar un tema de la lista izquierda.");
        } else {
            
            ArrayList<String> todosGral = new ArrayList<>();
            System.out.println(lstTemasGral.getLastVisibleIndex());
            System.out.println(lstTemasGral.getModel().getElementAt(lstTemasGral.getAnchorSelectionIndex()));
            /*for (int i = 0; i < lstTemasGral.getLastVisibleIndex()+1; i++) {
                if(lstTemasGral.getModel().getElementAt(i).is)
                        todosGral.add(lstTemasGral.getModel().getElementAt(i));
                
            }*/
            
            
            String[] seleccionado = new String[todosGral.size()];
            for (int i = 0; i < seleccionado.length; i++) {
                seleccionado[i] = "" + todosGral.get(i);
                
            }
            System.out.println(seleccionado);
            
            lstTemaElegido.setListData(seleccionado);
            lstTemasGral.clearSelection();
        }
    }//GEN-LAST:event_btnAgregarTemaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!chequeo()) {
            JOptionPane.showMessageDialog(this, "No fue posible ingresar puesto, revise los datos ingresados.");
        } else {
            this.puesto = new Puesto();
            this.puesto.setNombre(txtFieldNombre.getText());

            //String[] temas = lstTemaElegido.getModel().get;
            ArrayList<Tematica> temas = new ArrayList<>();
            ArrayList<Tematica> todosTemas = sistema.getTematicas();
            
            for (int i = 0; i < lstTemaElegido.getComponentCount(); i++) {
                
                String nombreLista = lstTemaElegido.getModel().getElementAt(i).toString();
                for (Tematica tema : todosTemas) {
                    if (tema.getNombre().equals(nombreLista)) {
                        temas.add(tema);
                        //System.out.println(tema.getNombre());
                    }
                }
                
            }
            this.puesto.setTemasRequeridos(temas);
            if (rBtnMixto.isSelected()) {
                this.puesto.setTipo(rBtnMixto.getText());
            } else {
                if (rBtnPresencial.isSelected()) {
                    this.puesto.setTipo(rBtnPresencial.getText());
                } else {
                    this.puesto.setTipo(rBtnMixto.getText());
                }
            }
            
            this.setVisible(false);
        }
        

    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarTema;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGrpTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddAdvertencia;
    private javax.swing.JLabel lblListaTema;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTElegido;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstTemaElegido;
    private javax.swing.JList<String> lstTemasGral;
    private javax.swing.JRadioButton rBtnMixto;
    private javax.swing.JRadioButton rBtnPresencial;
    private javax.swing.JRadioButton rBtnRemoto;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables

    public boolean chequeo () {
        boolean bien = true;
        if (lstTemasGral.getFirstVisibleIndex() == -1) {
            bien = false;
        } else {
            if (lstTemaElegido.getFirstVisibleIndex() == -1) {
                bien = false;
            } else {
                if (txtFieldNombre.getText().isBlank()) {
                    bien = false;
                }
            }
        }
        return bien;
    }
    
}
