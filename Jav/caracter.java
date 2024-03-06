public class caracter {
    
    public char tecla;
    private int numeroDeAparicoes=0;

    public caracter(char tecla){
        this.tecla=tecla;
    }

    public void acresceAparicoes(){
        this.numeroDeAparicoes+=1;
    }

    public int exibeAparicoes(){
        return this.numeroDeAparicoes;
    }
}