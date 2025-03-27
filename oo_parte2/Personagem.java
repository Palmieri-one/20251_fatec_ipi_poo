package oo_parte2;
import java.util.Random;

public class Personagem {
    //encapsular variaveis para que nao sejam alteradas. ex : energia = 500, seria roubado
    private String nome; // = null
    private String[] possiveisNomes = {"Steve", "Alex", "Mark"};
    private int energia = 10; //Declarando energia inicial
    private int fome = 0; //Declarando fome inicial (nao ha necessidade de adicionar 0, mas a regra fica explicita para todos)
    private int sono = 0; //Declarando sono inicial (nao ha necessidade de adicionar 0, mas a regra fica explicita para todos)



    //construtor
    public Personagem (){
        nome = obterNomeAleatorio();
        energia = 10;
        fome = 0;
        sono = 0;
    }
    
    private String obterNomeAleatorio(){
        var gerador = new Random();
        return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
    }

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome.length() >= 4 ? nome: 
        obterNomeAleatorio();
        this.energia = energia >= 0 && energia <= 10? 
        energia:
        10;
        this.fome = fome >= 0 && fome <= 10 ?
        fome:
        0;
        this.sono = sono >= 0 && sono <= 10 ?
        sono:
        0;
    }
    // deve ser possivel construir um Personagem com dados passados pela classe cliente
    // se algum valor for invalidado usar aquele que e padrao para a respectiva propriedade
    // incluir a validacao de nome: somente valem nomes que tenham pelo menos 4 caracteres
    // se essa regra for violada, atribuir um nome aleatorio
    
    public void cacar(){

        if (energia >=2){
        System.out.println(nome + " está caçando..."); // exemplo : aqui ele possui 2 strings e cria uma terceira para a concatenação nome + "está caçando..."
            energia -=2; //diminui em 2 a energia apos cacar
            System.out.println(nome + " perdeu as energias\n");// declaracao que o personagem perdeu energia
    }
    else{
        System.out.println(nome + "esta sem energia para cacar");
    }
    fome = fome < 10 ? fome + 1 : fome; //Resumo fome = fome eh menor do que 10? se for verdadeiro fome = fome + 1, se for falso fome = fome
    sono = Math.min(sono + 1, 10); //Limite de 10 no Sono
    }

    public void comer(){

        if (fome >=1){
            System.out.println(nome + " está comendo...");// o printfln permite pular a linha sem o \n
            fome -=1; //diminui em 1 a fome apos comer pode ser tambem "fome--", "fome = fome -1", "--fome"
            System.out.println(nome + " esta saciado.\n");// declaracao que o personagem comeu
            System.out.println("Fome atual: " + fome); // declaracao da fome atual
        }
        else {
            System.out.println(nome + " nao está com fome");
        }
        energia = Math.min(energia + 1, 10); //Limite de 10 na Energia


    }
    public void dormir(){

        if(sono >= 1){
            System.out.printf("%s está dormindo...\n", nome); // exemplo : aqui ele possui 1 string
            sono -= 1; //diminui em 1 o sono apos dormir
            System.out.println(nome + " acordou descansado\n");// declaracao que o personagem dormiu
            System.out.println("Sono atual: " + sono); // declaracao do sono atual
        }
        else{
            System.out.println(nome + " nao está com sono");
        }
        energia = Math.min(energia + 1, 10); //Limite de 10 na Energia
    }
    @Override
    public String toString(){
        return String.format (
            "%s: e: %d, f: %d, s: %d", 
            nome, energia, fome, sono
        );
    }

    /* 
    void status(){
        System.out.println("--------------------------");
        System.out.println("Status atual: ");
        System.out.println("Energia: " + energia);
        System.out.println("Fome: " + fome);
        System.out.println("Sono: " + sono);
        System.out.println("--------------------------");
    } */
}