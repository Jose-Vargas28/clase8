public class circulo extends figuras2d {
    double radio;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(double radio) {
        System.out.println("El área es: " +Math.PI * radio * radio);
    }
    @Override
    public void calcularPerimetro(double radio) {
        System.out.println("El perímetro es: " + 2 * Math.PI * radio);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("El radio es:" + radio);
    }
}
