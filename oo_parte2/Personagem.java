package oo_parte2;

public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar(){
        System.out.println(nome + " está caçando..."); // exemplo : aqui ele possui 2 strings e cria uma terceira para a concatenação nome + "está caçando..."

    }
    void comer(){
        System.out.print(nome + " está comendo...\n");// o printfln permite pular a linha sem o \n

    }
    
    void dormir(){
        System.out.printf("%s está dormindo...\n", nome); // exemplo : aqui ele possui 1 string

    }
}
