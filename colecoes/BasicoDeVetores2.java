package colecoes;
public class BasicoDeVetores2 {
    public static void main(String[] args) {
        int [] v = {1, 2};
        manipulaVetor(v);
        System.out.println(v[0]);
        System.out.println(v[1]);
        // passagem de parametro por valor e por referencia
        // int b = 3;
        // manipulaVetor(b);
        // System.out.println(b);
    }
    static void manipulaVetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }
    //desse modo ele nao consegue modificar o valor, somente cria uma copia do valor passado
    static void manipulaVetor(int a){
        a = 2;
    }
}
