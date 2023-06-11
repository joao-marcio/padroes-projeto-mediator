package padroescomportamentais.mediator;

public class Pessoa {

    public String solicitarOperadora(String mensagem) {
        return CentralRecarga.getInstancia().receberSolicitacaoRecargaSecretaria(mensagem);
    }

    public String informarOperadora(String mensagem) {
        return CentralRecarga.getInstancia().receberPagamentoOperadora(mensagem);
    }

    public String avaliarOperadora(String mensagem) {
        return CentralRecarga.getInstancia().receberRecargaOperadora(mensagem);
    }


}
