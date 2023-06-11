package padroescomportamentais.mediator;

public class Operadora implements Setor {

    private static Operadora instancia = new Operadora();

    private Operadora() {}

    public static Operadora getInstancia() {
        return instancia;
    }

    public String receberSolicitacao(String mensagem) {
        return "A Operadora recebeu sua solicitação de credito: " + mensagem;
    }

    public String receberPagamento(String mensagem) {
        return "A Operadora recebeu sua informação de recarga: " + mensagem;
    }

    public String receberCredito(String mensagem) {
        return "A Operadora recebeu sua avaliação: " + mensagem;
    }
}

