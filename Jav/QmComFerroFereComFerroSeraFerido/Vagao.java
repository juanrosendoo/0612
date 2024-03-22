public class Vagao extends RecursoFerroviario{
    private int numeroSerie;
    private String tipo;
    private float capacidadeCarga;
    private float comprimentoTesteiras;
    private float comprimentoEngates;
    LinhaFerroviaria linha;

    public Vagao(LinhaFerroviaria linha, int numeroSerie, String tipo, float capacidadeCarga, float comprimentoTesteiras, float comprimentoEngates){
        super(linha);
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoTesteiras = comprimentoTesteiras;
        this.comprimentoEngates = comprimentoEngates;
    }
    public Vagao(LinhaFerroviaria linha){
        super(linha);
    }

    
}
