import java.util.*;

/**
 * 2. Написать приложение в которое можно ввести 10 чисел и нажать Enter,
 * а оно выведет их на экран отсортировав по возрастанию
 * (предпочтителен язык Java).
 */


public class SortValue {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 10 numbers separated by a space and press <ENTER>");
        String str = scanner.nextLine();
        scanner.close();

        scanner = new Scanner(str);

        while (scanner.hasNextInt()) {

            array.add(scanner.nextInt());
        }

        scanner.close();

        Collections.sort(array);

        System.out.println(array);

    }
}
