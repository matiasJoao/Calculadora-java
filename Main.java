import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        String operacao, res, finalizar;
        Scanner leia = new Scanner(System.in);
        while (true) {
            System.out.println("digite o primeiro numero");
            num1 = leia.nextDouble();
            System.out.println("digite o segundo numero");
            num2 = leia.nextDouble();
            System.out.println("digite a operação desejada (+ | - | * | / )");
            operacao = leia.next();
            Operacao resul = new Operacao();
            res = resul.calcu(num1, num2, operacao);
            System.out.println(res);
            System.out.println("Deseja Finalizar (S ou N)");
            finalizar  = leia.next();
            if(finalizar.equalsIgnoreCase("S")){
                break;
            }
        }
    }
}