package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveSolicitarOperadora() {
        Usuario usuario = new Usuario();
        assertEquals("A Central agradece seu contato.\nA Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Operadora recebeu sua solicitação de credito: Quero recarregar meus créditos",
                usuario.solicitarOperadora("Quero recarregar meus créditos"));
    }

    @Test
    void deveInformarOperadora() {
        Usuario usuario = new Usuario();
        assertEquals("A Central agradece seu contato.\nA Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Operadora recebeu sua informação de recarga: 150GB",
                usuario.informarOperadora("150GB"));
    }

    @Test
    void deveAvaliarOperadora() {
        Usuario usuario = new Usuario();
        assertEquals("A Central agradece seu contato.\nA Operadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Operadora recebeu sua avaliação: 10",
                usuario.avaliarOperadora("10"));
    }

}