public class Triangulo {

    public void valoresDosLadosDosTriangulos(double lado1, double lado2, double lado3){

            if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.println("esse triangulo é escaleno");
            }
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("esse triangulo é equilátero");
            }
            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("esse triangulo é isóceles");
            }


    }


}
