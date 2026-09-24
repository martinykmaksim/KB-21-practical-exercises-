import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("ПРИМІТИВНІ ТИПИ ДАНИХ JAVA");
        System.out.println("----------------------------------------");

        System.out.println("byte");
        System.out.println("Розмір: " + Byte.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println();


        System.out.println("short");
        System.out.println("Розмір: " + Short.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println();
        git initgit init
        System.out.println("int");
        System.out.println("Розмір: " + Integer.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long");
        System.out.println("Розмір: " + Long.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("float");
        System.out.println("Розмір: " + Float.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double");
        System.out.println("Розмір: " + Double.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("char");
        System.out.println("Розмір: " + Character.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("boolean");
        System.out.println("Розмір: не визначений стандартом Java");
        System.out.println("Мінімальне значення: false");
        System.out.println("Максимальне значення: true");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("ПЕРЕТВОРЕННЯ РЯДКА У ПРИМІТИВНІ ТИПИ");
        System.out.println("----------------------------------------");

        System.out.print("Введіть значення byte: ");
        String byteString = scanner.nextLine();
        byte byteValue = Byte.parseByte(byteString);
        System.out.println("Результат: " + byteValue);

        System.out.print("Введіть значення short: ");
        String shortString = scanner.nextLine();
        short shortValue = Short.parseShort(shortString);
        System.out.println("Результат: " + shortValue);

        System.out.print("Введіть значення int: ");
        String intString = scanner.nextLine();
        int intValue = Integer.parseInt(intString);
        System.out.println("Результат: " + intValue);

        System.out.print("Введіть значення long: ");
        String longString = scanner.nextLine();
        long longValue = Long.parseLong(longString);
        System.out.println("Результат: " + longValue);

        System.out.print("Введіть значення float: ");
        String floatString = scanner.nextLine();
        float floatValue = Float.parseFloat(floatString);
        System.out.println("Результат: " + floatValue);

        System.out.print("Введіть значення double: ");
        String doubleString = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Результат: " + doubleValue);

        System.out.print("Введіть символ char: ");
        String charString = scanner.nextLine();
        char charValue = charString.charAt(0);
        System.out.println("Результат: " + charValue);

        System.out.print("Введіть значення boolean (true/false): ");
        String booleanString = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        System.out.println("Результат: " + booleanValue);

        scanner.close();
    }
}