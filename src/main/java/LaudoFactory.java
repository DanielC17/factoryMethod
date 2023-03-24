public class LaudoFactory {

    public static ILaudo obterLaudo(String laudo){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Laudo" + laudo);
            objeto = classe.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Tipo de Laudo Inexistente");
        }
        if(!(objeto instanceof ILaudo)){
            throw new IllegalArgumentException("Laudo Invalido");
        }
        return (ILaudo) objeto;
    }

}
