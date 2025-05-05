//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ClaseDePrueba {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Contrarrelojista(1, "Juan", 100);
        Ciclista ciclista2 = new Escalador(2, "Maria", 40, 60);
        Ciclista ciclista3 = new Escalador(3, "Pedro", 30, 40);
        Ciclista ciclista4 = new Escalador(4, "Ana", 10, 20);
        Ciclista ciclista5 = new Velocista(5, "Jose", 100, 45);
        Ciclista ciclista6 = new Velocista(6, "Jose", 80, 40);

        Equipo equipo1 = new Equipo("Thermtronic");
        equipo1.aniadirCiclista(ciclista1);
        equipo1.aniadirCiclista(ciclista2);
        equipo1.aniadirCiclista(ciclista3);
        equipo1.aniadirCiclista(ciclista4);
        equipo1.aniadirCiclista(ciclista5);
        equipo1.aniadirCiclista(ciclista6);

        equipo1.listarNombresCiclistas();
        System.out.println(equipo1.imprimirDatosEquipo());
        System.out.println(equipo1.mostrarDatosCiclista(3));
        System.out.println(equipo1.mostrarDatosCiclista(7));
    }
}