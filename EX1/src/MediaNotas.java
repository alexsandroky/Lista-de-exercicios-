void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    IO.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    IO.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    IO.println("A média das notas é: " + media);
    scanner.close();
}