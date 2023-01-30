import java.util.Scanner;

public class index{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Informe a primeira nota");
        nota1 = sc.nextDouble();

        System.out.println("Informe a primeira nota");
        nota2 = sc.nextDouble();

        System.out.println("Informe a primeira nota");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é:" + media);
    }
}