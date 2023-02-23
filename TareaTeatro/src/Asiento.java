public class Asiento {
    private int precio;
    private String tipo;
    private boolean reservado;

    public Asiento(int precio, String tipo, boolean reservado) {
        this.precio = precio;
        this.tipo = tipo;
        this.reservado = reservado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "precio=" + precio +
                ", tipo='" + tipo + '\'' +
                ", reservado=" + reservado +
                '}';
    }
}
