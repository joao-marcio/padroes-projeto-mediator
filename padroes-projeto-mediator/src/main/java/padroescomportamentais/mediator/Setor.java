package padroescomportamentais.mediator;

public interface Setor {
    String receberSolicitacao(String mensagem);
    String receberPagamento(String mensagem);
    String receberCredito(String mensagem);
}
