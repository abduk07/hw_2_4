import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пять слов");
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Список А: " + listA);

        System.out.println("Введите пять цифр");
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список B: " + listB);

        ArrayList<String > listC = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(listB.size() - i - 1 ));
        }
        System.out.println("Список С " + listC);

        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Список С после сортировки " + listC);

    }
}

