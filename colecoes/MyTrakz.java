package colecoes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Trak {
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
                var titulo = JOptionPane.showInputDialog("Titulo?");
                var trak = new Trak(titulo);
                minhasTraks.add(trak);
                JOptionPane.showInputDialog("Trak adicionada com sucesso!");
                break;

                case 2:

                break;

                case 3:
                break;

                case 4:
                break;

                case 5:

                break;

                case 6:
                break;

                case 0:
                break;

                default:
                break;

            }

        }while (op != 0);
    }
}
