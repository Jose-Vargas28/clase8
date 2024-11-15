public class figuras3d extends FigurasGeometricas{

    double lado;
    int nlados;
    int ncaras;

    public figuras3d() {
    }

    public figuras3d(double lado, int nlados, int ncaras) {
        this.lado = lado;
        this.nlados = nlados;
        this.ncaras = ncaras;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int nlados) {
        this.lados = nlados;
    }

    public int getNcaras() {
        return ncaras;
    }

    public void setNcaras(int ncaras) {
        this.ncaras = ncaras;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área 3d es:");

    }
    @Override

    public void calcularVolumen(){
        System.out.println("El volumen 3d es:");

    }

    @Override
    public void mostrarDatos(){
        System.out.println("Datos del figuras 3d:");

    }

}
