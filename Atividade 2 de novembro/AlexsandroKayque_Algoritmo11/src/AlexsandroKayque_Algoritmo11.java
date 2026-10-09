import java.util.Scanner;

public class AlexsandroKayque_Algoritmo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double Y = scanner.nextDouble();

        System.out.print("Digite o valor de Z: ");
        double Z = scanner.nextDouble();

        if (X < Y + Z && Y < X + Z && Z < X + Y) {
            if (X == Y && Y == Z) {
                System.out.println("Triângulo Equilátero");
            } else if (X == Y || X == Z || Y == Z) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}