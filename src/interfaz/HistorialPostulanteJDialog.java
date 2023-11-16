//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class HistorialPostulanteJDialog extends javax.swing.JDialog {
    
    TableRowSorter<DefaultTableModel> sorter;
    private Sistema sistema;
    private Postulante postulan;

    public HistorialPostulanteJDialog(java.awt.Frame parent, boolean modal, Sistema sistema) {
        super(parent, modal);
        this.sistema = sistema;
        initComponents();

        DefaultTableModel modelo = new DefaultTableModel();

        ArrayList<Postulante> postulante = new ArrayList<>();
        postOrdCedula(postulante);
        postulante = sistema.getPostulantes();
        String[] postulantes = new String[postulante.size()];
        for (int i = 0; i < postulantes.length; i++) {
            postulantes[i] = postulante.get(i).getNombre() + " (" + postulante.get(i).getCedula() + ")";
        }

        jListPostulantes.setListData(postulantes);
        creatTabla();

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
        lblBuscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPost)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCed, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(9, 9, 9))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTelf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblLinked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblExp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblFormat)
                                .addGap(524, 524, 524))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnBuscar)
                                .addGap(34, 34, 34)
                                .addComponent(btnBorrar)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPost, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCed)
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
                                            .addComponent(lblFormato)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCedula)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExp)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().isBlank() || sistema.getEntrevistas().size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay nada para buscar.");
        } else {

            /*tblBusqueda.setDefaultRenderer(Object.class, new CellRenderer());

            String buscar = txtBuscar.getText();
            String[] columnas = new String[]{"Nro", "Evaluador", "Puntaje", "Comentarios"};

            ArrayList<Evaluador> allEvaluadores = sistema.getEvaluadores();
            ArrayList<Postulante> allPostulantes = sistema.getPostulantes();
            ArrayList<Entrevista> allEntrevistas = sistema.getEntrevistas();
            
            DefaultTableModel tableModelo = (DefaultTableModel) tblBusqueda.getModel();
            tableModelo.setRowCount(0);
            
            Object[][] lineas = new Object[sistema.getEntrevistas().size()][4];
            tableModelo.setColumnIdentifiers(columnas);
            
            for (int i = 0; i < sistema.getSizePostulantes(); i++) {
                
                for (int j = 0; j < allPostulantes.get(i).getEntrevistas().size(); j++) {

                    String desc = allPostulantes.get(i).getEntrevistas().get(j).getDescripcion();
                    if (-1 != desc.indexOf(buscar)) {
                        lineas[i][0] = j + 1;
                        lineas[i][1] = allPostulantes.get(i).getEntrevistas().get(j).getEvaluador().getNombre();
                        lineas[i][2] = allPostulantes.get(i).getEntrevistas().get(j).getPuntaje();
                        lineas[i][3] = allPostulantes.get(i).getEntrevistas().get(j).getDescripcion();
                        tableModelo.addRow(lineas[i]);
                    }
                    
                }
                
            }

            txtBuscar.setText(" ");*/
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        tblBusqueda.clearSelection();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jListPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPostulantesValueChanged
        ArrayList<Postulante> postulante = sistema.getPostulantes();
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

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtBuscarKeyReleased


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
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Postulante> postOrdCedula(ArrayList<Postulante> unA) {
        Collections.sort(unA);
        return unA;
    }

    private void creatTabla() {
        String[] columnas = new String[]{"Nro", "Evaluador", "Puntaje", "Comentarios"};
        String[][] lineas = new String[sistema.getEntrevistas().size()][4];
        String buscar = txtBuscar.getText();
        ArrayList<Evaluador> allEvaluadores = sistema.getEvaluadores();
        ArrayList<Postulante> allPostulantes = sistema.getPostulantes();
        ArrayList<Entrevista> allEntrevistas = sistema.getEntrevistas();
        
        for (int i = 0; i < sistema.getSizePostulantes(); i++) {

            for (int j = 0; j < allPostulantes.get(i).getEntrevistas().size(); j++) {

                String desc = allPostulantes.get(i).getEntrevistas().get(j).getDescripcion();
                if (-1 != desc.indexOf(buscar)) {
                    lineas[i][0] = Integer.toString(j + 1);
                    lineas[i][1] = allPostulantes.get(i).getEntrevistas().get(j).getEvaluador().getNombre();
                    lineas[i][2] = Integer.toString(allPostulantes.get(i).getEntrevistas().get(j).getPuntaje());
                    lineas[i][3] = allPostulantes.get(i).getEntrevistas().get(j).getDescripcion();

                }

            }

        }
        
        DefaultTableModel modelo = new DefaultTableModel(lineas, columnas);
        System.out.println(modelo.getRowCount());
        tblBusqueda.setModel(modelo);
        tblBusqueda.setAutoCreateRowSorter(true);
        sorter=new TableRowSorter<>(modelo);
        tblBusqueda.setRowSorter(sorter);
    }
    private void filtrar(){
        try{
            sorter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText()));
        }catch(Exception e){
            
        }
    }

}
