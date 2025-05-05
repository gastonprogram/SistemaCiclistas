public class Escalador extends Ciclista{
    private float aceleracionPromedioEnSubida;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombreCiclista, float aceleracionPromedioEnSubida, float gradoRampaSoportada){
        super(identificador, nombreCiclista);
        this.aceleracionPromedioEnSubida = aceleracionPromedioEnSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    protected float getAceleracionPromedioEnSubida(){
        return aceleracionPromedioEnSubida;
    }

    protected void setAceleracionPromedioEnSubida(float x){
        this.aceleracionPromedioEnSubida = x;
    }

    protected float getGradoRampaSoportada(){
        return gradoRampaSoportada;
    }

    protected void setGradoRampaSoportada(float x){
        this.gradoRampaSoportada = x;
    }

    @Override
    public String imprimirTipo(){
        return "Es un escalador";
    }


}
