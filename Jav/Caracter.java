public class Caracter {
    
    public char tecla;
    private int numeroDeAparicoes=0;

    public Caracter(char tecla){
        this.tecla=tecla;
    }

    public void acresceAparicoes(){
        this.numeroDeAparicoes+=1;
    }

    public int exibeAparicoes(){
        return this.numeroDeAparicoes;
    }
}