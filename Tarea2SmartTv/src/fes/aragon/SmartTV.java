package fes.aragon;

public class SmartTV {
    private String marca;
    private int pulgadas;
    private String resolucion;
    private String tecnologia;
    private Sistema sistema;

    public SmartTV() {
    }
    
    public SmartTV(String marca, int pulgadas, String resolucion, String tecnologia, Sistema sistema) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.tecnologia = tecnologia;
        this.sistema = sistema;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartTV{" + "marca=" + marca + ", pulgadas=" + pulgadas + ", resolucion=" + resolucion + ", tecnologia=" + tecnologia + ", sistema=" + sistema + '}';
    }
    
    
}
