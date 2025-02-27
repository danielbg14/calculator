import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Тест тест! :O");
        System.out.println(" ");
        System.out.println("Shte napravim kalkulator s dve chisla");
        System.out.println(" ");
        System.out.println("Vuzmojni presmqtaniq");
        System.out.println(" ");
        System.out.println("1 - Suberi");
        System.out.println("2 - Izvadi");
        System.out.println("3 - Umnoji");
        System.out.println("4 - Razdeli");
        System.out.println("5 - Stepenuvane");

        int typed = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Napishi purvoto chislo: ");
        int number1 = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Napishi vtoroto chislo: ");
        int number2 = scanner.nextInt();

        int suberi = number1 + number2;
        int izvadi = number1 - number2;
        int umnoji = number1 * number2;
        int razdeli = number1 / number2;
        int stepen = number1 ^ number2;

        if (typed == 1)
        {
            System.out.println("Reshenieto e slednoto: " + number1 + "+" + number2 + "=" + suberi  );
        }
        else if (typed == 2)
        {
            System.out.println("Reshenieto e slednoto: " + number1 + "-" + number2 + "=" + izvadi  );
        }
        else if (typed == 3)
        {
            System.out.println("Reshenieto e slednoto: " + number1 + "*" + number2 + "=" + umnoji  );
        }
        else if (typed == 4)
        {
            System.out.println("Reshenieto e slednoto: " + number1 + "/" + number2 + "=" + razdeli  );
        }
        else if (typed == 5)
        {
            System.out.println("Reshenieto e slednoto: " + number1 + "^" + number2 + "=" + stepen  );
        }
        else
        {
            System.out.println("neshto se oburka braaat.");
        }
    }
}