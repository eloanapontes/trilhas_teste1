import java.util.Scanner;
//escreva 1 progama p ler 2 valores e escrever o maior deles

public class comparacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");

        Integer numero1 = prompt.nextInt();
        System.out.println("Informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();

        if (numero1 > numero2){
            System.out.println("O numero  " + numero1+ " é maior que o numero: "+ numero2);
        }else if(numero1 < numero2){
            System.out.println("O numero "+ numero2 +" é menor  que o numero: "+numero1);
        } else{
            System.out.println("o numero "+ numero1 +" é igual ao numero "+ numero2);



        }

    }
}
