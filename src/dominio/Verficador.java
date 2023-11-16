//Matías Ohanian 305720 && Valentino Barreiro 308473 

package dominio;

import javax.swing.InputVerifier;

import javax.swing.JComponent;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class Verficador extends InputVerifier {

    @Override

    public boolean verify (JComponent editor) {
        // suponemos que JComponent será un JTextField

        if (editor instanceof JTextField) {

            String texto = ((JTextField) editor).getText();

            try {
                // Si se puede convertir en entero, está bien

                Integer.parseInt(texto);

                return true;

            } catch (Exception e) {
                // Si no se ha podido convertir a entero, mostramos
                // una ventana de error y devolvemos false

                JOptionPane.showMessageDialog(editor, "No es un número");

                //return false;

            }

        }

        return true;

    }

    public boolean verifyMail (JComponent editor) {
        // suponemos que JComponent será un JTextField
        boolean retorno = false;
        if (editor instanceof JTextField) {
            String texto = ((JTextField) editor).getText();

            if (texto.contains("@gmail.com")) {
                retorno = true;
            } else {
                JOptionPane.showMessageDialog(editor, "No es un gmail válido");
                retorno = false;
            }

            // Si no se ha podido convertir a entero, mostramos
            // una ventana de error y devolvemos false
        }
        return retorno;
    }

}
