public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Estudar tipos primitivos
        //Estudar a classe String que representa texto na aplicação

        String meuNome = "UEDER SILVA PINTO";

        double salarioMinimo = 1412;

        short numeroCurto = 1;

        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;
        
        System.out.print(numero);

        final double VALOR_DE_PI = 3.1546;

        //VALOR_DE_PI = 10; VARIAVEL COM final NÃO PODE SER ALTERADA
    }
}
