package colecoes;
import java.util.Random;
public class TesteVetorDinamicoV1 {
public static void main(String[] args) throws Exception { //Throws Exception exclusivo do thread.sleep.
  var gerador = new Random();
  var v = new VetorDinamico();
    while(true){
      var oQueFazer = gerador.nextDouble();
      if(oQueFazer <= 0.5){
        var numero = gerador.nextInt(1,7);
        v.adicionar(numero);
          } else {
            v.remover();
        }
        System.out.println(v);
        System.out.println("*********************************************");
        Thread.sleep(500);
    }
  }
}
      