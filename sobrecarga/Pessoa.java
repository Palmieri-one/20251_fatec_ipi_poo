package sobrecarga;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo; //character

    //construtor padrao
    public Pessoa(){
        System.out.println("Padrao...");
    }
    // construtor escolhido
    public Pessoa (String nome, int idade, char sexo){
        System.out.println("String, int, char");
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa(String nome, int idade){
        this(nome, idade,'\0'); //o construtor que veio primeiro deve ser primeiramente chamado.
        System.out.println("String, int"); 
    }
    public Pessoa(int idade, String nome){
        this(nome,idade); //o construtor que veio primeiro deve ser primeiramente chamado.
        System.out.println("int, String");
    }
    public Pessoa(String nome){
        this(nome, 0); //o construtor que veio primeiro deve ser primeiramente chamado.
        System.out.println("String");
    }
    public Pessoa (int idade){
        this(idade,null); //o construtor que veio primeiro deve ser primeiramente chamado.
        System.out.println("int");
    }

}
