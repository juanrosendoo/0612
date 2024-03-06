public class candidato{

    private String nome;
    private int numero;
    private String cargo;
    public int votos;

	public candidato(String nome, int numero, String cargo){
		this.nome=nome;
        this.numero=numero;
        this.cargo=cargo;
    }

    public void zeraVotos(){
        this.votos=0;
    }

    public void acresceVotos(){
        this.votos++;
    }

    public void imprimeCandidato(){
        System.out.println(this.numero + " - " + this.nome + " " + this.cargo);       
    }

	public String imprimeNome(){
		return(this.nome);
	}

}