public class Main {
    public static void main(String[] args) {
        System.out.println("########## Calculadora do joão ##########");
        double numero1 = 4;
        double numero2 = 0;
        /*
        operações:
        1 - soma
        2 - subtração
        3 - multiplicação
        4 - divisão
        */
        int operacao = 4;

        if (operacao == 1) {
            System.out.printf("O resultado de (%.1f + %.1f) = " + (numero1 + numero2), numero1, numero2);
        } else if (operacao == 2) {
            System.out.printf("O resultado de (%.1f - %.1f) = " + (numero1 - numero2), numero1, numero2);
        } else if (operacao == 3) {
            System.out.printf("O resultado de (%.1f x %.1f) = " + (numero1 * numero2), numero1, numero2);
        }else if (operacao == 4) {
            if (numero2 != 0){
                System.out.printf("O resultado de (%.1f / %.1f) = " + (numero1 / numero2), numero1, numero2);
            }else {
                System.out.printf("o resultado de (%.1f / %.1f) é uma operação matematica indefinida!!!",numero1,numero2);
            }
        }else{
            System.out.println("operação invalida!!!");
        }

    }
}