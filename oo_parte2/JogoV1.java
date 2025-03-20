package oo_parte2;

public class JogoV1 {
    public static void main(String[] args) {
        //1. construir um objeto do tipo personagem
        //2. atribuir um nome ao personagem
        //3. fazer com que ele execute todos os seus comportamentos, na ordem que desejar.
        // var (feito pelo compilador)
        // var p1 = new Personagem ();
        Personagem p1 = new Personagem(); //1 etapa
        p1.nome = "Fernando"; //2 etapa

        p1.cacar(); //3 etapa
        p1.comer(); //3 etapa
        p1.dormir(); //3 etapa
    }
}
