package oo_parte2;
import java.util.Random;
import java.lang.reflect.*;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var p = new Personagem();
        var p1 = new Personagem ("Lebron", 10 , 10, 0);
        var p2 = new Personagem ("Soneca",4,4, 10);
        Personagem [] personagens = {p, p1, p2};

        Class<?> clazz = Personagem.class;
        Method[] metodosPublicos = clazz.getMethods();
        System.out.println("Numero de metodos publicos:" + metodosPublicos.length);
        Method [] metodosDeclarados = clazz.getDeclaredMethods();
        System.out.println("Numero de metodos declarados:" + metodosDeclarados.length);

        //loop do jogo
        while (true){
        var quemVaiJogar = gerador.nextInt(personagens.length);
        var oQueFazer = 1 + gerador.nextInt(3); // [0,2], ao adicionar o 1 + ele permite que fique entre 1 e 3
        switch (oQueFazer) {
            case 1:
            personagens[quemVaiJogar].cacar();  
            break;
            case 2:
            personagens[quemVaiJogar].comer();
            break;
            case 3:
            personagens[quemVaiJogar].dormir();
        }    
        System.out.println(personagens[quemVaiJogar]);
        Thread.sleep(4000);

        }
        
    }

}
