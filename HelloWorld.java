import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner pronpt = new Scanner(System.in);

        System.out.println("informe um valor inteiro");

        Integer numerointeiro = pronpt.nextInt();

        if (numerointeiro % 2 == 0) {
            System.out.println("o numero" + numerointeiro + " é um numero par");

        } else {
            System.out.println(("o numero" + numerointeiro + " é numero impar"));

        }
    }

}
