import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaudoOrtopediaTest {

    @Test
    void deveGerarLaudoOrtopedida(){
        ILaudo laudo = LaudoFactory.obterLaudo("Ortopedia");
        assertEquals("Laudo de ortopedia criado com sucesso!", laudo.gerarLaudo());
    }

    @Test
    void deveCancelarLaudoOrtopedida(){
        ILaudo laudo = LaudoFactory.obterLaudo("Ortopedia");
        assertEquals("Laudo de ortopedia, cancelado!", laudo.cancelarLaudo());
    }

    @Test
    void deveBaixarLaudoOrtopedida(){
        ILaudo laudo = LaudoFactory.obterLaudo("Ortopedia");
        assertEquals("Baixando laudo de ortopedia.", laudo.baixarLaudo());
    }

    @Test
    void deveCompartilharLaudoOrtopedida(){
        ILaudo laudo = LaudoFactory.obterLaudo("Ortopedia");
        assertEquals("Compartilhando laudo de ortopedia.", laudo.compartilharLaudo());
    }
}
