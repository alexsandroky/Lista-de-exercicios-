import java.util.Scanner;
class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        // Calculei o novo salário com aumento de 25%, usei (double salario) pq o salario pode ter centavos
        double novoSalario = salario + (salario * 0.25);
        System.out.println("O novo salário é: R$ " + novoSalario);
        scanner.close();
    }
}
