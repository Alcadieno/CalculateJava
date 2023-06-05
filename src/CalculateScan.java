import java.util.Scanner; //Importar objeto do pacote Scanner

public class CalculateScan {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Guardar o OBJETO
        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt(); // Esperar definição do valor

        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Digite o segundo numero:");
        int numero2 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite a Operacao:");
        String operacao = scanner2.nextLine();

        if( operacao.equals("somar")){ // Estrutura condicional compara a valor da variavel Operacao
            System.out.println(numero1 + numero2);// Somar
        } else if (operacao.equals("subtrair")) {
            System.out.println(numero1 - numero2);

        } else if (operacao.equals("dividir")) {
            System.out.println(numero1 / numero2);

        } else if (operacao.equals("multiplicar")){
            System.out.println(numero1 * numero2);
        }else {
            System.out.println("Operador Invalido");
        }


    }
}
