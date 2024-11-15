public class cuadrado extends figuras2d{

    double lado;

    public cuadrado() {
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public void calcularArea(double lado) {
        double area = lado * lado;
    }

    @Override
    public void calcularPerimetro(double lado) {
        double perimetro = lado * 2;

    }
    public void datosCuadrado(){
        System.out.println("El Lado del cuadrado es: " + lado);
    }
}
