public class EstacaoFerroviaria {
    LinhaFerroviaria[] linhasFerroviarias;
    private String sigla;
    private String descricao;

    EstacaoFerroviaria(LinhaFerroviaria linhasFerroviarias){
        for(int i=0; i<linhasFerroviarias.length; i++){
            this.linhasFerroviarias[i]=linhasFerroviarias;
        }
    }
}
