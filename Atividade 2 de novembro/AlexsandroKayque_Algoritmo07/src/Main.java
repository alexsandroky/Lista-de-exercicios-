import java.util.Scanner;

public class AlexsandroKayque_Algoritmo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int Idade = scanner.nextInt();

        String Categoria;

        if (Idade <= 7) {
            Categoria = "INFANTIL";
        } else if (Idade <= 10) {
            Categoria = "JUVENIL";
        } else if (Idade <= 15) {
            Categoria = "ADOLESCENTE";
        } else if (Idade <= 30) {
            Categoria = "ADULTO";
        } else {
            Categoria = "SENIOR";
        }

        System.out.println("Categoria: " + Categoria);

        scanner.close();
    }
}