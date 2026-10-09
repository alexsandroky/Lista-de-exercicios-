import java.util.Scanner;

public class AlexsandroKayque_Algoritmo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double Numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double Numero2 = scanner.nextDouble();

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        int Opcao = scanner.nextInt();

        switch (Opcao) {
            case 1:
                System.out.println("Resultado: " + (Numero1 + Numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (Numero1 - Numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (Numero1 * Numero2));
                break;
            case 4:
                if (Numero2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (Numero1 / Numero2));
                }
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}