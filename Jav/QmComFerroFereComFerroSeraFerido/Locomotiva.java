public class Locomotiva extends RecursoFerroviario{
    private int numeroSerie;
    private float capacidadeTracao;
    private float comprimento;
    Locomotiva(LinhaFerroviaria linha, int numeroSerie, float capacidadeTracao, float comprimento){
        super(linha);
        this.numeroSerie = numeroSerie;
        this.capacidadeTracao=capacidadeTracao;
        this.comprimento=comprimento;
    }
    Locomotiva(LinhaFerroviaria linha){
        super(linha);
    }
}
