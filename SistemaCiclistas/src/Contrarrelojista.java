public class Contrarrelojista extends Ciclista {
    private int velocidadMaxima;


    public Contrarrelojista(int identificador, String nombreCiclista, int velocidadMaxima){
        super(identificador, nombreCiclista);
        this.velocidadMaxima = velocidadMaxima;
    }
    protected int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(int x){
        this.velocidadMaxima = x;
    }

    @Override
    public String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
