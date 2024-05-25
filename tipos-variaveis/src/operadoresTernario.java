public class operadoresTernario{
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);

        //operador ternário
        String resultado2 = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}