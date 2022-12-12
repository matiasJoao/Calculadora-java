public class Operacao {

    public String calcu(double num1, double num2, String operacao) {
            double resultado;
            String print;
        switch (operacao){
            case "+":
               resultado = num1 + num2;
             print = "A soma foi: "+ resultado;
                break;
            case "-":
                resultado = num1 - num2;
                print ="A subtração foi: " + resultado;
                break;
            case "*":
                 resultado = num1 * num2;
                print = "A multiplicação  foi: " + resultado;
                break;
            case "/":
                 resultado = num1 / num2;
                print =   "A divisão  foi: "+ resultado;
                break;
            default: print = "digite uma operação correta (+ | - | * | / )";
        }
      return print ;
    }

}
