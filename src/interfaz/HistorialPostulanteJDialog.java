//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;

import dominio.*;
import java.util.*;

public class HistorialPostulanteJDialog extends javax.swing.JDialog {

    private Sistema modelo;
    private Postulante postulan;

    public HistorialPostulanteJDialog (java.awt.Frame parent, boolean modal, Sistema sistema) {
        super(parent, modal);
        modelo = sistema;
        initComponents();

        ArrayList<Postulante> postulante = new ArrayList<>();
        postOrdCedula(postulante);
        postulante = sistema.getPostulantes();
        String[] postulantes = new String[postulante.size()];
        for (int i = 0; i < postulantes.length; i++) {
            postulantes[i] = postulante.get(i).getNombre() + " (" + postulante.get(i).getCedula() + ")";
        }

        jListPostulantes.setListData(postulantes);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListPostulantes = new javax.swing.JList<>();
        jlblTitulo = new javax.swing.JLabel();
        lblPost = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        lblTelf = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        lblLinked = new javax.swing.JLabel();
        lblFormat = new javax.swing.JLabel();
        lblCed = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstExperiencia = new javax.swing.JList<>();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        lblExp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        txtfldBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jListPostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPostulantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListPostulantes);

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTitulo.setText("Historial de Postulantes");

        lblPost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPost.setText("Postulantes:");

        lblNom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNom.setText("Nombre:");

        lblDireccion.setText("-");

        lblDirec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDirec.setText("Direccion:");

        lblTelf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelf.setText("Telefono:");

        lblM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblM.setText("Mail:");

        lblLinked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLinked.setText("Linkedin:");

        lblFormat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormat.setText("Formato:");

        lblCed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCed.setText("Cedula:");

        lstExperiencia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstExperiencia);

        lblNombre.setText("-");

        lblCedula.setText("-");

        lblTelefono.setText("-");

        lblMail.setText("-");

        lblLink.setText("-");

        lblFormato.setText("-");

        lblExp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblExp.setText("Experiencia:");

        lblBuscar.setText("Buscar:");

        txtfldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ));
        jScrollPane3.setViewportView(tblBusqueda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPost)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLinked, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblExp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btnBuscar)
                            .addGap(34, 34, 34)
                            .addComponent(btnBorrar)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPost, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDirec)
                                    .addComponent(lblDireccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelf)
                                    .addComponent(lblTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblM)
                                    .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLinked)
                                    .addComponent(lblLink))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFormat)
                                    .addComponent(lblFormato)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCed)
                                .addComponent(lblCedula)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExp)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtfldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(162, 162, 162))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jListPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPostulantesValueChanged
        ArrayList<Postulante> postulante = modelo.getPostulantes();
        int i = jListPostulantes.getAnchorSelectionIndex();

        lblNombre.setText(postulante.get(i).getNombre());
        lblCedula.setText(postulante.get(i).getCedula());
        lblDireccion.setText(postulante.get(i).getDireccion());
        lblTelefono.setText(postulante.get(i).getTelefono());
        lblMail.setText(postulante.get(i).getMail());
        lblLink.setText(postulante.get(i).getLinkedIn());
        lblFormato.setText(postulante.get(i).getTipoTrabajo());

        ArrayList<Tematica> conocimientos = postulante.get(i).getConocimiento();
        ArrayList<Integer> niveles = postulante.get(i).getNiveles();
 
        String[] conocimientosLst = new String[conocimientos.size()];
        for (int j = 0; j < conocimientosLst.length; j++) {
            conocimientosLst[j] = conocimientos.get(j).getNombre() + " (" + niveles.get(j) + ")";
        }
        
        lstExperiencia.setListData(conocimientosLst);


    }//GEN-LAST:event_jListPostulantesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JList<String> jListPostulantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCed;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblExp;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblLinked;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPost;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JList<String> lstExperiencia;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtfldBuscar;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Postulante> postOrdCedula (ArrayList<Postulante> unA) {
        Collections.sort(unA);
        return unA;
    }
}
