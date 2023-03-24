public class LaudoCardiologia implements ILaudo{
    public String gerarLaudo(){
        return "Laudo de cardiologia criado com sucesso!";
    }
    public String cancelarLaudo() {
        return "Laudo de cardiologia, cancelado!";
    }

    public String compartilharLaudo() {
        return "Compartilhando laudo de cardiologia.";
    }

    public String baixarLaudo() {
        return "Baixando laudo de cardiologia.";
    }
}
