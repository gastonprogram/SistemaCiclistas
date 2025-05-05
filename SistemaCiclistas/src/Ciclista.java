public abstract class Ciclista {

    private int identificador;
    private String nombreCiclista;
    private int tiempoAcumuladoCarrera;

    public Ciclista(int identificador, String nombreCiclista){
        this.identificador = identificador;
        this.nombreCiclista = nombreCiclista;
        this.tiempoAcumuladoCarrera = 0;
    }

    public abstract String imprimirTipo();

    public String imprimirDatosCiclista(){
        return "Identificador: " + identificador + "\nNombre: " + nombreCiclista + "\nTiempo acumulado: " + tiempoAcumuladoCarrera;
    }

    public int getIdentificador() {
        return identificador;
    }
    public String getNombreCiclista() {
        return nombreCiclista;
    }
    public int getTiempoAcumuladoCarrera() {
        return tiempoAcumuladoCarrera;
    }

}
