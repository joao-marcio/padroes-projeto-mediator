package padroescomportamentais.mediator;

public class CentralRecarga {

    private static CentralRecarga instancia = new CentralRecarga();

    private CentralRecarga() {}

    public static CentralRecarga getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoRecargaSecretaria(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "A Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Operadora.getInstancia().receberSolicitacao(mensagem);
    }

    public String receberPagamentoOperadora(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "A Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Operadora.getInstancia().receberPagamento(mensagem);
    }

    public String receberRecargaOperadora(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "A Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Operadora.getInstancia().receberCredito(mensagem);
    }

}
