import java.util.Scanner;

public class validacaoSenha {
    public static void main(String[] args) {
        Scanner prompt =new Scanner(System.in);
        final Integer senhaCorreta = 12345;
        Integer senhaDigitada=0;

        do{
            System.out.println("informe a senha: ");
            senhaDigitada= prompt.nextInt();
        }while(senhaDigitada != senhaCorreta);


    }
}
