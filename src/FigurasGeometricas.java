public abstract class FigurasGeometricas {
    String tipo;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void calcularArea();

    public void mostrarDatos(){
        System.out.println("Datos generales: " + tipo);
    }
}
