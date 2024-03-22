import java.util.Date;

public class Trem extends RecursoFerroviario{
    private Vagao []vagoes;
    private Locomotiva []locomotivas;
    private String prefixo;
    private Date dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;
    LinhaFerroviaria linha;

    public Trem(LinhaFerroviaria linha, Vagao []vagoes, Locomotiva []locomotivas, String prefixo, Date dataFormacao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino){
        super(linha);
        this.vagoes = vagoes;
        this.locomotivas = locomotivas;
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }
}
