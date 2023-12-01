import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Otrzymujemy wartości od użytkownika i wczytujemy je do zmiennej
        System.out.print("Type Int value: ");
        int intvalue = scanner.nextInt();
        System.out.print("Type Double value: ");
        double doublevalue = scanner.nextDouble();
        System.out.print("Type Char value: ");
        char charvalue = scanner.next().charAt(0);
        System.out.print("Type Boolean value (true or false): ");
        boolean booleanvalue = scanner.nextBoolean();

        //Wyświetlamy wprowadzone informacje wraz z konwersją
        System.out.println("Converting Double: " + doublevalue + " into Int: " + (int) doublevalue);
        System.out.println("Converting Int: " + intvalue + " into Double: " + (double) intvalue);
        System.out.println("Converting Char: " + charvalue + " into Int: " + (int) charvalue);
        System.out.println("Converting Boolean: " + booleanvalue + " into String: " + String.valueOf(booleanvalue));

        scanner.close(); //Zamykamy Scanner
    }
}
