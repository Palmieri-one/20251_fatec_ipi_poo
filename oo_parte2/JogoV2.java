package oo_parte2;
import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var p2 = new Personagem();
        p2.nome = "Fernando";
        while (true){
        //1 = cacar
        //2 = comer
        //3 = dormir
        var oQueFazer = 1 + gerador.nextInt(3); // [0,2], ao adicionar o 1 + ele permite que fique entre 1 e 3
        switch (oQueFazer) {
            case 1:
            p2.cacar();  
            break;
            case 2:
            p2.comer();
            break;
            case 3:
            p2.dormir();
        }    
        System.out.println(p2);
        Thread.sleep(4000);

        }
        
    }

}
