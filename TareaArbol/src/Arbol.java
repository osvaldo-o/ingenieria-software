public class Arbol {
    private String tipo;
    private Float altura;
    private Float diámetro;
    private int edad;
    private boolean daFrutos;

    public Arbol(String tipo, Float altura, Float diámetro, int edad, boolean daFrutos) {
        this.tipo = tipo;
        this.altura = altura;
        this.diámetro = diámetro;
        this.edad = edad;
        this.daFrutos = daFrutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getDiámetro() {
        return diámetro;
    }

    public void setDiámetro(Float diámetro) {
        this.diámetro = diámetro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDaFrutos() {
        return daFrutos;
    }

    public void setDaFrutos(boolean daFrutos) {
        this.daFrutos = daFrutos;
    }

    @Override
    public String toString() {
        return "Árbol{" +
                "tipo='" + tipo + '\'' +
                ", altura=" + altura +
                ", diámetro=" + diámetro +
                ", edad=" + edad +
                ", daFrutos=" + daFrutos +
                '}';
    }
}
