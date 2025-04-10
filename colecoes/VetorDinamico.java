package colecoes;

import java.util.Objects;

//generics (desde o java 5)
public class VetorDinamico <T> {
    //Varial de Classe, ou seja, e compartilhada entre todos os objetos
    // e o valor dela e o mesmo para todos os objetos.
    private static final int LIMIAR_INFERIOR = 4;
    private T [] elementos;
    private int quantidade;
    private int capacidade;
    // Construtor
    VetorDinamico(){
        this.quantidade = 0;
        this.capacidade = LIMIAR_INFERIOR;
        // quantidade = capacidade = 0; outra forma de inicialar zerado
        //this.elementos = new T[this.capacidade]; intuicao
        elementos = (T[]) new Object [capacidade];
    }
    private void redimensionar(double fator){
        //1. alocar um vetor com a capacidade apropriada.
        T [] aux = (T[]) new Object [(int) (capacidade*fator)];
        //2. copiar todos.
        for (int i = 0 ; i< quantidade ; i++){
            aux [i] = elementos [i];
        }
        //3. ajustar a capacidade.
        capacidade = (int) (capacidade * fator);
        //4. ajustar a variavel elementos.
        elementos = aux;
    }
    public boolean estaVazio(){
        return quantidade == 0;
    }
    public void remover (){
        if (!estaVazio()){
            quantidade--;
            if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade/4)
            redimensionar(0.5);
        }
    }
    public boolean estaCheio(){
        return quantidade == capacidade;
    }
    public void adicionar(T e){
      if (estaCheio()){
        redimensionar(2);
      }
      elementos[quantidade++] = e;
    }
    public String toString(){
        // qtde: 3
        // cap: 4
        // 1 2 3
        var sb = new StringBuilder("");
        sb.append("Qtde: ").append(quantidade).append("\n");
        sb.append("Cap: ").append(capacidade).append("\n");
        for(int i = 0; i < quantidade; i++){
            sb.append(elementos[i]).append(i != quantidade - 1 ? " " : "");
        }
        return sb.toString();
    }
}