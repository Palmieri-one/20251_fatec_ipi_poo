package colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

class Trak implements Comparable <Trak>{
    private String titulo;
    private int avaliacao;

    public Trak(String titulo, int avalicacao){
        this.titulo = titulo;
        this.avaliacao = avalicacao;
    }
    public Trak (String titulo){
    this.titulo = titulo;
 }
 public String toString(){
    return String.format("Titulo: %s, Avalicao: %d", titulo, avaliacao);
 }
 @Override
    public int compareTo(Trak o) {
        //Se o this for menor, entao devolvemos -1
        //se o this for igual a o, devolvemos 0
        //senao, devolvemos 1
        return this.titulo.compareTo(o.titulo);
    }
    public int getAvaliacao(){
        return this.avaliacao;
    }
    public int setAvaliacao(int avaliacao){
        return this.avaliacao = avaliacao;
    }
    @Override
    public boolean equals(Object obj){
        var outra = (Trak)obj;
        return this.titulo.equals(outra.titulo);
    }
    public void setTitulo(String titulo){
       this.titulo = titulo;
    
    }
}
class AvaliacaoComparator implements Comparator <Trak>{
    @Override
    public int compare(Trak t1, Trak t2){
        //se a avaliacao de t1 for maior, devolvemos -1
        //se forem iguais, devolvemos 0
        //se a avaliacao de t1 for menor, devolvemos 1
        if(t1.getAvaliacao() > t2.getAvaliacao())
        return -1;
        if (t1.getAvaliacao() == t2.getAvaliacao())
        return t1.compareTo(t2);
        return 1;
    }
}
public class MyTrakz {
    public static void main (String[] args){
        var minhasTraks = new ArrayList<Trak>();
        var menu = "1. Cadastrar\n2.Remover\n3.Atualizar\n4.Ordenar por nome\n5.Listar Ordenado por Avalicao\n6.Avaliar\n0.Sair.";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:
                {
                var titulo = JOptionPane.showInputDialog("Titulo?");
                var trak = new Trak(titulo);
                minhasTraks.add(trak);
                JOptionPane.showMessageDialog(null,"Trak adicionada com sucesso!");
                break;
                }
                case 2:
                {
                    var titulo = JOptionPane.showInputDialog(null,"Titulo?");
                    var trak = new Trak(titulo);
                    if (minhasTraks.contains(trak)){
                        minhasTraks.remove(trak);
                        JOptionPane.showMessageDialog(null,"Musica removida");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Musica nao encontrada");
                    }
                break;
                }
                
                case 3:
                {
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var trak = new Trak(titulo);
                    var indice = minhasTraks.indexOf(trak);
                    if (indice >= 0){
                        var novoTitulo = JOptionPane.showInputDialog(null, "Novo Titulo?");
                        minhasTraks.get(indice).setTitulo(novoTitulo);
                        JOptionPane.showMessageDialog(null, "Titulo Alterado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Musica nao encontrada");
                    }
                    
                    
                break;
                }
                

                case 4:
                {
                    if(minhasTraks.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Lista vazia");
                    }
                    else {
                        //opera in-place: altera a lista
                        Collections.sort(minhasTraks); //ordena a lista
                        JOptionPane.showMessageDialog(null,minhasTraks);
                    }
                    break;
                }
                

                case 5:
                {
                    if (minhasTraks.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Lista vazia");
                }
                else{
                    Collections.sort(minhasTraks, new AvaliacaoComparator());
                    JOptionPane.showMessageDialog(null,minhasTraks);
                }
                break;
                }
                case 6:
                {
                var titulo = JOptionPane.showInputDialog("Titulo?");
                var trak = new Trak(titulo);
                var indice = minhasTraks.indexOf((trak));
                if (indice != -1){
                    var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliacao?"));
                    minhasTraks.get(indice).setAvaliacao(avaliacao);
                    JOptionPane.showMessageDialog(null, "Musica Avaliada");
                    //encontrou
                } 
                else{
                    JOptionPane.showMessageDialog(null,"Musica nao encontrada");
                }
                break;
                }
                case 0:
                {
                    JOptionPane.showMessageDialog(null,"Ate logo!");
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                    break;
                }

            }

        }while (op != 0);
    }
}
