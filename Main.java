import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введіть ціле число (int): ");
        int integerVal = scanner.nextInt();
        System.out.print("Введіть число з плаваючою точкою (double): ");
        double doubleVal = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть рядок (String): ");
        String stringVal = scanner.nextLine();
        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanVal = scanner.nextBoolean();
        System.out.println("\nРЕЗУЛЬТАТИ\n");
        System.out.println("1. [Конкатенація] Базове виведення: "
                + "int=" + integerVal + ", double=" + doubleVal
                + ", string=\"" + stringVal + "\", bool=" + booleanVal);
        System.out.println("2. [Конкатенація] Модифіковані дані: "
                + "int x 2=" + (integerVal * 2) + ", double + 1=" + (doubleVal + 1.0)
                + ", UPPER_STRING=" + stringVal.toUpperCase() + ", NOT bool=" + (!booleanVal));
        System.out.printf("3. [printf] Стандартне: int=%d, double=%.2f, string=%s, bool=%b%n",
                integerVal, doubleVal, stringVal, booleanVal);
        System.out.printf("4. [printf] Числові системи: Dec=%d, Hex=0x%X, Oct=0%o%n",
                integerVal, integerVal, integerVal);
        System.out.printf("5. [printf] Формати double: Sci=%e, Prec=%.4f%n",
                doubleVal, doubleVal);
        System.out.printf("6. [printf] Форматування рядка (ширина 15): Right=['%15s'], Left=['%-15s']%n",
                stringVal, stringVal);
        System.out.printf("7. [printf] Обрізання та нулі: Int padded=%06d, String max 3 chars=%.3s%n",
                integerVal, stringVal);
        String pattern8 = "8. [MessageFormat] Індекси: Int={0}, Double={1}, String=''{2}'', Bool={3}";
        System.out.println(MessageFormat.format(pattern8, integerVal, doubleVal, stringVal, booleanVal));
        String pattern9 = "9. [MessageFormat] Числові типи: Валюта={1, number, currency}, Відсотки={1, number, percent}";
        System.out.println(MessageFormat.format(pattern9, integerVal, doubleVal, stringVal, booleanVal));
        String pattern10 = "10. [MessageFormat] Зворотний порядок: Bool={3}, String=''{2}'', Double={1}, Int={0}";
        System.out.println(MessageFormat.format(pattern10, integerVal, doubleVal, stringVal, booleanVal));
        scanner.close();
    }
}