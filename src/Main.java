import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();


        System.out.println("digite o valor do lado 1:");
        double lado1 = scanner.nextDouble();
        System.out.println("digite o valor do lado 2:");
        double lado2 = scanner.nextDouble();
        System.out.println("digite o valor do lado 3:");
        double lado3 = scanner.nextDouble();

        triangulo.valoresDosLadosDosTriangulos(lado1, lado2, lado3);

    }
}