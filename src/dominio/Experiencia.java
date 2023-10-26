package dominio;


public class Experiencia {
    private String tema;
    private int nivel;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Experiencia(String tema, int nivel) {
        this.tema = tema;
        this.nivel = nivel;
    }

    public Experiencia() {
        
    }
    
    
}
