public class figuras2d extends FigurasGeometricas{

    int nlados;

    public figuras2d() {
    }

    public figuras2d(int nlados) {
        this.nlados = nlados;
    }


    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }


    public  void calcularArea(){
        System.out.println("El área 2d es:" );

    }


    public void calcularPerimetro(){
        System.out.println("El perimetro 2d es:" );

    }

    @Override
    public void mostrarDatos(){
        System.out.println("Datos de figuras 2d:");

    }


    public abstract void calcularArea(double base, double altura);

    public abstract void calcularPerimetro(double base, double altura);

    public abstract void calcularArea(double lado);

    public abstract void calcularPerimetro(double lado);
}
