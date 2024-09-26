import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {
    private ArrayList<Filme> listaFilmes = new ArrayList<>(); //criação da arraylist de filmes como string

    //public Streaming(ArrayList<String> listaFilmes) { //construtor
       // this.listaFilmes = listaFilmes;
      //  listaFilmes =  new ArrayList<>();
  //  }
    //agora tenho que add os filmes que o usuário vai digitar a arraylist que criei

    public void addFilmes(){
        Scanner scanner = new Scanner(System.in);//o usuário irá digitar os filmes
        System.out.println("Digite o nome do filme que deseja adicionar....: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de lançamento do filme.....: ");
        int anoLancamento = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o gênero do filme....: ");
        String genero = scanner.nextLine();

        Filme filme = new Filme(nome, anoLancamento, genero);
        listaFilmes.add(filme);//adiciono o filme q o usuário vai digitar a arraylist
        System.out.println("Filme "+ nome +" - "+ anoLancamento +" - "+ genero+ " adicionado com sucesso!");
        //listaFilmes.add(filme); //adiciono o filme q o usuário vai digitar a arraylist

    }

    public void exibirMenu() {
        System.out.println("-- !Olá, bem-vindo ao Debugflix! --"); //o bem vindo antes do for pra não repitir toda hora, só na primeira vez
        Scanner scanner = new Scanner(System.in);
        int addOpcao;
        for (addOpcao = 0; addOpcao != 3; ) {
            //System.out.println("-- !Olá, bem-vindo ao Debugflix! --");
            System.out.println("-- Menu --");
            System.out.println("1 - Adicionar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Sair");
            System.out.print("Escolha sabiamente uma opção: ");
            addOpcao = scanner.nextInt();
            scanner.nextLine();

            if (addOpcao == 1) {
                addFilmes();
            } else if (addOpcao == 2) {
                listarFilmes();
            } else if (addOpcao == 3) {
                System.out.println("saindo...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }


    /*public void exibirMenu(){ REFIZ INTEIRO
        if (listaFilmes.isEmpty()){
            System.out.print("-- Ainda sem registros de filmes! --"+"\n"+"-- Digite 1 para adicionar-  "+"\n"+"-- Digite 2 para sair --"+"\n"+"....:");
            Scanner scanner  =  new Scanner(System.in);
            int addOpcao = scanner.nextInt();
            if (addOpcao==1){
                addFilmes();
            } else if (addOpcao==2) {
                System.out.println("saindo....");
            }
        }else {
            for (Filme filme : listaFilmes){
                System.out.println(filme.toString());
            }
        }
    }*/

    public void listarFilmes(){
        if (listaFilmes.isEmpty()){
            System.out.println("Ainda sem registro de filmes!");
        }else {
            for (Filme filme:listaFilmes){
                System.out.println(filme);
            }
        }
    }

    public static void main(String[] args) {
    Streaming streaming = new Streaming();
    streaming.exibirMenu();
        System.out.println("Oii!");
    }


}
