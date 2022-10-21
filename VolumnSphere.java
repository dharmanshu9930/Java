package demo1;

import java.util.Scanner;

public class VolumnSphere {

    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);

        int R = variavel.nextInt();

        double resultado = Math.pow(R, 3)*3.14159*(4.0/3);

        System.out.printf("VOLUME = %.3f\n",resultado);
    }

}
