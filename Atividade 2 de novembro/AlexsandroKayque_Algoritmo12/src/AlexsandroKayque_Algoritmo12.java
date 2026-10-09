import java.util.Scanner;

public class AlexsandroKayque_Algoritmo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("1 - Feijoada");
        System.out.println("2 - Lasanha");
        System.out.println("3 - Frango Grelhado");
        System.out.println("4 - Salada Caesar");
        System.out.print("Escolha uma opção: ");
        int Opcao = scanner.nextInt();

        switch (Opcao) {
            case 1:
                System.out.println("Você escolheu: Feijoada");
                break;
            case 2:
                System.out.println("Você escolheu: Lasanha");
                break;
            case 3:
                System.out.println("Você escolheu: Frango Grelhado");
                break;
            case 4:
                System.out.println("Você escolheu: Salada Caesar");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}