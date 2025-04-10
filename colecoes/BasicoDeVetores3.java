package colecoes;
class Veiculo{
    String placa;
    int ano;

Veiculo(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
}

}

public class BasicoDeVetores3 {
    public static void main(String[] args) {
    Veiculo [] veiculos = new Veiculo[4];
    // Veiculo veiculos [] = new Veiculo [4];
    veiculos[0] = new Veiculo("abc-1234", 2000); // assim que faco esse codigo eu instancio um objeto no vetor.
    trocaValor(veiculos);
    System.out.println(veiculos[0].ano); // altera o valor para 2001, pois opera na mesma referencia de memoria.
    }
    static void trocaValor(Veiculo[] veiculos){
        veiculos[0].ano = 2001;
    }
  }