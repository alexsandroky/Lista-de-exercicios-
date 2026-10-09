import java.util.Scanner;

public class AlexsandroKayque_Algoritmo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mínimo: ");
        double SalarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário: ");
        double Salario = scanner.nextDouble();

        if (Salario >= SalarioMinimo) {
            System.out.println("A pessoa está ganhando pelo menos o salário mínimo.");
        } else {
            System.out.println("A pessoa está ganhando menos que o salário mínimo.");
        }

        scanner.close();
    }
}