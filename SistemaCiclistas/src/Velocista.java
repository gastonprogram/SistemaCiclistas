public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombreCiclista, double potenciaPromedio, double velocidadPromedio){
        super(identificador, nombreCiclista);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double x) {
        this.potenciaPromedio = x;
    }

    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double x) {
        this.velocidadPromedio = x;
    }

    @Override
    public String imprimirTipo(){
        return "Es un velocista";
    }
}
