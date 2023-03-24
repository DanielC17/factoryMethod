import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaudoCardiologiaTest {


    @Test
    void deveGerarLaudoCardiologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Cardiologia");
        assertEquals("Laudo de cardiologia criado com sucesso!", laudo.gerarLaudo());
    }

    @Test
    void deveCancelarLaudoCardiologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Cardiologia");
        assertEquals("Laudo de cardiologia, cancelado!", laudo.cancelarLaudo());
    }

    @Test
    void deveBaixarLaudoCardiologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Cardiologia");
        assertEquals("Baixando laudo de cardiologia.", laudo.baixarLaudo());
    }

    @Test
    void deveCompartilharLaudoCardiologia(){
        ILaudo laudo = LaudoFactory.obterLaudo("Cardiologia");
        assertEquals("Compartilhando laudo de cardiologia.", laudo.compartilharLaudo());
    }
}
