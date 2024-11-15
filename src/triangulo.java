public class triangulo extends figuras2d{
    double base;
    double altura;

    public triangulo() {
    }

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void calcularArea(double base, double altura) {
        double area = base*altura;
    }


    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = 2*base+2*altura;
    }

    public void datosTriangulo(){
        System.out.println("La base es: "+base);
        System.out.println("La altura es: "+altura);
    }
}
