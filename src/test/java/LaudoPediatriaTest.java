import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaudoPediatriaTest {


    @Test
    void deveGerarLaudoPediatria(){
        ILaudo laudo = LaudoFactory.obterLaudo("Pediatria");
        assertEquals("Laudo de pediatria criado com sucesso!", laudo.gerarLaudo());
    }

    @Test
    void deveCancelarLaudoPediatria(){
        ILaudo laudo = LaudoFactory.obterLaudo("Pediatria");
        assertEquals("Laudo de pediatria, cancelado!", laudo.cancelarLaudo());
    }

    @Test
    void deveBaixarLaudoPediatria(){
        ILaudo laudo = LaudoFactory.obterLaudo("Pediatria");
        assertEquals("Baixando laudo de pediatria.", laudo.baixarLaudo());
    }

    @Test
    void deveCompartilharLaudoPediatria(){
        ILaudo laudo = LaudoFactory.obterLaudo("Pediatria");
        assertEquals("Compartilhando laudo de pediatria.", laudo.compartilharLaudo());
    }
}
