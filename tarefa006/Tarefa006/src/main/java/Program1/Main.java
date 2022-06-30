package Program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade em anos meses e dias.");
        System.out.println("Informe a sua idade em anos: ");
        int anos = sc.nextInt();
        System.out.println("Informe a sua idade em meses: ");
        int meses = sc.nextInt();
        System.out.println("Informe a sua idade em meses: ");
        int dias = sc.nextInt();

        int resultado = anos*365 + meses*30 + dias;

        System.out.println( anos + " anos, " + meses + " meses, " + dias + " dias = " + resultado + "dias");
    }
}
