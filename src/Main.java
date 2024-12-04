import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("########## Calculadora do joão ##########");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero ");
        double numero2  = entrada.nextDouble();
        String menu = """
         \noperações:
         1 - soma
         2 - subtração
         3 - multiplicação
         4 - divisão
         0 - sair
         """;

        int operacao = -1;
        while (operacao != 0) {
            System.out.print(menu);
            System.out.println("digite uma opção:");
            operacao = entrada.nextInt();


            if (operacao == 1) {
                System.out.printf("\nO resultado de %.1f + %.1f = " + (numero1 + numero2), numero1, numero2);
            } else if (operacao == 2) {
                System.out.printf("O resultado de %.1f - %.1f = " + (numero1 - numero2), numero1, numero2);
            } else if (operacao == 3) {
                System.out.printf("\nO resultado de %.1f x %.1f = " + (numero1 * numero2), numero1, numero2);
            } else if (operacao == 4) {
                if (numero2 != 0) {
                    System.out.printf("\nO resultado de %.1f / %.1f = " + (numero1 / numero2), numero1, numero2);
                } else {
                    System.out.printf("\nO resultado de %.1f / %.1f é uma operação matematica indefinida!!!", numero1, numero2);
                }
            } else if (operacao == 0){
                System.out.println("OK SAINDO DA APLICAÇÃO ................");
            }else {
                System.out.println("operação invalida!!!");
            }

        }



    }
}