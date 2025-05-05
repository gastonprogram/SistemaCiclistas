public class Equipo {

    int sumaTotalTiemposCiclistas;
    String nombreEquipo;
    Ciclista[] ciclistas;
    int cantidadCiclistas;

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
        this.ciclistas = new Ciclista[10];
        this.cantidadCiclistas = 0;
    }

    public String imprimirDatosEquipo(){
        System.out.println("Datos del equipo: " + this.nombreEquipo);
        return "";

    }

    public void aniadirCiclista(Ciclista ciclista){
        this.ciclistas[cantidadCiclistas] = ciclista;
        this.cantidadCiclistas++;

    }
    public void listarNombresCiclistas(){

        System.out.println("Nombres de las ciclistas:");
        for (int i = 0; i < cantidadCiclistas; i++) {
            System.out.println(this.ciclistas[i].getNombreCiclista());
        }
    }

    public String mostrarDatosCiclista(int id) {
        for (int i = 0; i < cantidadCiclistas; i++) {
            if (this.ciclistas[i].getIdentificador() == id) {
                return this.ciclistas[i].imprimirDatosCiclista();
            }
        }
        return "El ciclista con el identificador " + id + " no existe.";
    }

    public int getSumaTotalTiemposCiclistas() {
        return sumaTotalTiemposCiclistas;
    }
    public void setSumaTotalTiemposCiclistas(int x) {
        this.sumaTotalTiemposCiclistas = x;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String x) {
        this.nombreEquipo = x;
    }
    public Ciclista[] getCiclistas() {
        return ciclistas;
    }

}
