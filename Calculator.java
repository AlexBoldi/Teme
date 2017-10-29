/* Un calculator aritmetic simplu (adunare, scadere, inmultire, impartire si restul impartirii).
* Am folosit clasa Scanner din pachetul java.util pentru a citi de la tastatura numerele si operatia pe care vrem sa o
* efectuam. */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar intreg");
        int a = scanner.nextInt(); // 'Scanam' primul numar intreg
        System.out.println("Introduceti al doilea numar intreg");
        int b = scanner.nextInt(); // 'Scanam' al doilea numar intreg
        System.out.println("Introduceti operatia");
        char operation = scanner.next().charAt(0); // 'Scanam' operatia

        switch(operation) {

            case '+':
                int suma = a + b;
                System.out.println(a + " + " + b + " = " + suma); // Cazul in care programul trebuie sa printeze suma
                break;
            case '-':
                int diferenta = a - b;
                System.out.println(a + " - " + b + " = " + diferenta); // Cazul in care programul trebuie sa printeze diferenta
                break;
            case '*':
                int produsul = a * b;
                System.out.println(a + " * " + b + " = " + produsul); // Cazul in care programul trebuie sa printeze produsul
                break;
            case '/':
                float catul = (float) a / b;
                System.out.println(a + " / " + b + " = " + catul); // Cazul in care programul trebuie sa printeze rezultatul impartirii
                break;
            case '%':
                int restul = a % b;
                System.out.println(a + " % " + b + " = " + restul); // Cazul in care programul trebuie sa printeze restul impartirii
                break;
            default: System.out.println(operation + " nu este o operatie valida"); // Cazul in care caracterului citit de la tastatura nu ii este atribuita nici o operatie
                break;
        }

    }
}