package sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        long l1 = 2; long l2 = 3; long l3 = 4;
        String s1 = "2" , s2 = "3";
        var calc = new Calculadora(); // Atribui o valor de calc para Calculadora, ou seja atribui sozinho.
        calc.somar(l1, l2); // soma direta com os 2 valores.
        System.out.println(calc.somar(l1, l2)); //soma 2 valores de long.
        System.out.println(calc.somar(s1, s2)); //soma 2 valores de string.
        System.out.println(calc.somar(l1, l2, l3)); // soma com 3 valores.
        System.out.println(calc.somar(s1, l2)); // soma com String e long.
        System.out.println(calc.somar(l1, s1)); //soma com long e String

    }
}
