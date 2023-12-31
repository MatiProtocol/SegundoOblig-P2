//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;

import dominio.Postulante;
import dominio.*;

import java.util.*;

import javax.swing.*;

public class AltaPostulanteJDialogue extends javax.swing.JDialog {

    Postulante modelo = new Postulante();
    private Sistema sistema;

    public AltaPostulanteJDialogue (java.awt.Frame parent, boolean modal, Sistema sistema) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.sistema = sistema;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGupo = new javax.swing.ButtonGroup();
        lblAltaPost = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        lblTelf = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        lblFormato = new javax.swing.JLabel();
        rbtnRemoto = new javax.swing.JRadioButton();
        rbtnPresencial = new javax.swing.JRadioButton();
        rbtnMixto = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        lblCedulaAdvertencia = new javax.swing.JLabel();
        lblNombreAdvertencia = new javax.swing.JLabel();
        lblDirecAdvertencia = new javax.swing.JLabel();
        lblTelefAdvertencia = new javax.swing.JLabel();
        lblMailAdvertencia = new javax.swing.JLabel();
        lblLinkedAdvertencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAltaPost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAltaPost.setText("Alta Postulante");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCedula.setText("Cédula:");

        lblDir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDir.setText("Dirección:");

        lblTelf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelf.setText("Teléfono:");

        lblMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMail.setText("Mail:");

        lblLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLinkedin.setText("Linkedin:");

        txtNombre.setToolTipText("Ingrese su nombre.");
        txtNombre.setNextFocusableComponent(txtCedula);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtCedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCedula.setToolTipText("Ingresar cédula sin puntos ni guión.");
        txtCedula.setCaretColor(new java.awt.Color(153, 153, 153));
        txtCedula.setNextFocusableComponent(txtDireccion);
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtDireccion.setNextFocusableComponent(txtTelefono);
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        txtTelefono.setNextFocusableComponent(txtMail);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        txtMail.setToolTipText("Ingrese un mail válido.");
        txtMail.setNextFocusableComponent(txtLinkedin);
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });

        txtLinkedin.setToolTipText("Ingrese un LinkedIn válido.");
        txtLinkedin.setNextFocusableComponent(rbtnRemoto);
        txtLinkedin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLinkedinFocusLost(evt);
            }
        });
        txtLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedinActionPerformed(evt);
            }
        });
        txtLinkedin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLinkedinKeyReleased(evt);
            }
        });

        lblFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormato.setText("Formato:");

        btnGupo.add(rbtnRemoto);
        rbtnRemoto.setText("Remoto");
        rbtnRemoto.setToolTipText("Seleccionar si su formato de trabajo es remoto.");
        rbtnRemoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbtnRemoto.setNextFocusableComponent(btnCancelar);
        rbtnRemoto.setRequestFocusEnabled(false);
        rbtnRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRemotoActionPerformed(evt);
            }
        });

        btnGupo.add(rbtnPresencial);
        rbtnPresencial.setText("Presencial");
        rbtnPresencial.setToolTipText("Seleccionar si su formato de trabajo es presencial.");
        rbtnPresencial.setNextFocusableComponent(btnCancelar);
        rbtnPresencial.setRequestFocusEnabled(false);

        btnGupo.add(rbtnMixto);
        rbtnMixto.setSelected(true);
        rbtnMixto.setText("Mixto");
        rbtnMixto.setToolTipText("Seleccionar si su formato de trabajo es mixto.");
        rbtnMixto.setFocusTraversalPolicyProvider(true);
        rbtnMixto.setNextFocusableComponent(btnCancelar);
        rbtnMixto.setRequestFocusEnabled(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.setNextFocusableComponent(btnSig);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSig.setText("Siguiente");
        btnSig.setToolTipText("Avanzar a la ventana de experiencias.");
        btnSig.setMaximumSize(new java.awt.Dimension(80, 27));
        btnSig.setMinimumSize(new java.awt.Dimension(80, 27));
        btnSig.setNextFocusableComponent(txtNombre);
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        lblCedulaAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblNombreAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblDirecAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblTelefAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblMailAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblLinkedAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblAltaPost)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDir)
                                    .addComponent(lblTelf)
                                    .addComponent(lblMail)
                                    .addComponent(lblLinkedin)
                                    .addComponent(lblFormato)
                                    .addComponent(lblCedula))
                                .addGap(90, 90, 90)
                                .addComponent(rbtnRemoto)
                                .addGap(32, 32, 32)
                                .addComponent(rbtnPresencial)
                                .addGap(32, 32, 32)
                                .addComponent(rbtnMixto))
                            .addComponent(lblNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(txtCedula)
                                .addComponent(txtDireccion)
                                .addComponent(txtTelefono)
                                .addComponent(txtMail)
                                .addComponent(txtLinkedin)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28))
                                .addComponent(lblCedulaAdvertencia))
                            .addComponent(lblNombreAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirecAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMailAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkedAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblAltaPost)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblNombreAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblCedulaAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDir)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblDirecAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelf)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblTelefAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblMailAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinkedAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormato)
                    .addComponent(rbtnRemoto)
                    .addComponent(rbtnPresencial)
                    .addComponent(rbtnMixto))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinActionPerformed

    private void rbtnRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRemotoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed

        if (chequeoGeneral()) {

            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();
            String mail = txtMail.getText();
            String linkedin = txtLinkedin.getText();

            modelo.setLinkedIn(linkedin);

            String modalidad;
            if (rbtnMixto.isSelected()) {
                modalidad = rbtnMixto.getText();
            } else {
                if (rbtnPresencial.isSelected()) {
                    modalidad = rbtnPresencial.getText();
                } else {
                    modalidad = rbtnRemoto.getText();
                }
            }

            modelo.setConocimientos(new ArrayList<>());
            modelo.setNivel(new ArrayList<>());

            ExperienciaJDialogue ventanita = new ExperienciaJDialogue(new JFrame(), true, modelo, sistema);
            ventanita.setVisible(true);
            if (modelo.getConocimiento().size() == 0) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "No se ha creado ningún postulante.");
            } else {
                modelo.setNombre(nombre);
                modelo.setCedula(cedula);
                modelo.setDireccion(direccion);
                modelo.setTelefono(telefono);
                modelo.setMail(mail);
                modelo.setTipoTrabajo(modalidad);//
                sistema.addPostulantes(modelo);

                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los datos no son correctos.");
        }
    }//GEN-LAST:event_btnSigActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        if (!(esMail(txtMail.getText())) || txtMail.getText().length() == 0) {

            lblMailAdvertencia.setText("El mail es incorrecto.");

        } else {
            lblMailAdvertencia.setText("");
        }

    }//GEN-LAST:event_txtMailFocusLost

    private void txtLinkedinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLinkedinFocusLost
        if (!(txtLinkedin.getText().contains("https://linkedin.com/in/"))) {
            lblLinkedAdvertencia.setText("El LinkedIn es incorrecto.");
        } else {
            lblLinkedAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtLinkedinFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (!(esNumero(txtCedula.getText())) || txtCedula.getText().length() != 8) {
            lblCedulaAdvertencia.setText("La cédula es incorrecta.");
        } else {
            lblCedulaAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().length() == 0) {
            lblNombreAdvertencia.setText("El nómbre está vacío.");
        } else {
            lblNombreAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (txtDireccion.getText().length() == 0) {
            lblDirecAdvertencia.setText("La dirección está vacío.");
        } else {
            lblDirecAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().length() == 0 || !(esNumero(txtTelefono.getText()))) {
            lblTelefAdvertencia.setText("El teléfono no es correcto.");
        } else {
            lblTelefAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (!(esNumero(txtCedula.getText())) || txtCedula.getText().length() != 8) {
            lblCedulaAdvertencia.setText("La cédula es incorrecta.");
        } else {
            lblCedulaAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (txtNombre.getText().length() == 0) {
            lblNombreAdvertencia.setText("El nómbre está vacío.");
        } else {
            lblNombreAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (txtDireccion.getText().length() == 0) {
            lblDirecAdvertencia.setText("La dirección está vacío.");
        } else {
            lblDirecAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (txtTelefono.getText().length() == 0 || !(esNumero(txtTelefono.getText()))) {
            lblTelefAdvertencia.setText("El teléfono no es correcto.");
        } else {
            lblTelefAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        if (!(esMail(txtMail.getText())) || txtMail.getText().length() == 0) {

            lblMailAdvertencia.setText("El mail es incorrecto.");

        } else {
            lblMailAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtMailKeyReleased

    private void txtLinkedinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinkedinKeyReleased
        if (!(txtLinkedin.getText().contains("https://linkedin.com/in/"))) {
            lblLinkedAdvertencia.setText("El LinkedIn es incorrecto.");
        } else {
            lblLinkedAdvertencia.setText("");
        }
    }//GEN-LAST:event_txtLinkedinKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGupo;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel lblAltaPost;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedulaAdvertencia;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblDirecAdvertencia;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblLinkedAdvertencia;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMailAdvertencia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreAdvertencia;
    private javax.swing.JLabel lblTelefAdvertencia;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JRadioButton rbtnMixto;
    private javax.swing.JRadioButton rbtnPresencial;
    private javax.swing.JRadioButton rbtnRemoto;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public String radioBotonSeleccionado () {
        String retorno;
        if (rbtnRemoto.isSelected()) {
            retorno = rbtnRemoto.getName();
        } else {
            if (rbtnPresencial.isSelected()) {
                retorno = rbtnPresencial.getName();
            } else {
                retorno = rbtnMixto.getName();
            }
        }
        return retorno;
    }

    public Postulante devolverPost () {
        return this.modelo;
    }

    public boolean chequeoGeneral () {
        boolean verificado = true;
        if (txtNombre.getText().length() == 0) {
            verificado = false;
        } else {
            String cedula = txtCedula.getText();
            for (int i = 0; i < sistema.getSizePostulantes(); i++) {
                if (sistema.getPostulantes().get(i).getCedula().equals(cedula)) {
                    verificado = false;
                }
            }
            if ((!(esNumero(cedula))) || cedula.length() != 8) {
                verificado = false;
            } else {
                if (txtDireccion.getText().length() == 0) {
                    verificado = false;
                } else {
                    if (txtTelefono.getText().length() == 0 || !(esNumero(txtTelefono.getText()))) {
                        verificado = false;
                    } else {
                        if (!(esMail(txtMail.getText())) || txtMail.getText().length() == 0) {
                            verificado = false;
                        } else {
                            if (!(txtLinkedin.getText().contains("https://linkedin.com/in/"))) {
                                verificado = false;
                            }
                        }
                    }
                }
            }
        }

        return verificado;
    }

    public static boolean esMail (String unN) {
        boolean retorno = false;

        if (unN.contains("@")) {
            String[] mailSplit = unN.split("@");

            if ((mailSplit.length == 2 && mailSplit[0].length() > 0 && mailSplit[1].length() > 0 && mailSplit[1].indexOf(".") != -1)) {
                String[] dominioSplit = mailSplit[1].split("\\.");

                if (dominioSplit.length == 2 && dominioSplit[0].length() > 0 && dominioSplit[1].length() >= 1) {
                    retorno = true;

                }
            }

        }

        return retorno;
    }

    public static boolean esNumero (String unS) {
        boolean esN = true;

        for (int i = 0; i < unS.length() && esN; i++) {
            char aux = unS.charAt(i);

            if (!Character.isDigit(aux)) {
                esN = false;
            }
        }

        return esN && (unS.length() > 0);
    }
}
