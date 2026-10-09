import java.util.Scanner;

public class AlexsandroKayque_Algoritmo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double Salario = scanner.nextDouble();

        if (Salario < 1000.00) {
            double SalarioReajustado = Salario + (Salario * 0.30);
            System.out.printf("Salário reajustado: R$ %.2f%n", SalarioReajustado);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }

        scanner.close();
    }
}