import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaudoDermatologiaTest {
    @Test
    void deveGerarLaudoDermatologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Dermatologia");
        assertEquals("Laudo de dermatologia criado com sucesso!", laudo.gerarLaudo());
    }

    @Test
    void deveCancelarLaudoDermatologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Dermatologia");
        assertEquals("Laudo de dermatologia, cancelado!", laudo.cancelarLaudo());
    }

    @Test
    void deveBaixarLaudoDermatologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Dermatologia");
        assertEquals("Baixando laudo de dermatologia.", laudo.baixarLaudo());
    }

    @Test
    void deveCompartilharLaudoDermatologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Dermatologia");
        assertEquals("Compartilhando laudo de dermatologia.", laudo.compartilharLaudo());
    }
}
