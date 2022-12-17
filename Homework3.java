import java.util.*;

public class Homework3 {
    public static void main(String[] args) {

        // Task1 - Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        List<String> list = new ArrayList<>(Arrays.asList("red","green","blue","grey"));
        list.add("pink");
        list.add("orange");
        list.add("white");
        list.add(7,"yellow");
        System.out.println(list);

        // Task2 - Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        for (String i: list) {
            System.out.println(i + "!");
        }

        // Task3 - Вставить элемент в список в первой позиции.
        list.add(0,"brown");
        System.out.println(list);

        // Task4 - Извлечь элемент (по указанному индексу) из заданного списка
        String s = list.get(5);
        System.out.println(s);

        // Task5 - Обновить определенный элемент списка по заданному индексу.
        list.remove(1);
        list.add(1, "violet");
        System.out.println(list);

        // Task6 - Удалить третий элемент из списка.
        list.remove("green");
        System.out.println(list);

        // Task7 - Поиск элемента в списке по строке.
        String searchString = "brown";
        System.out.println("Список содержит значение \""+searchString+"\": "+list.contains(searchString));

        // Task8 - Создать новый список и добавить в него несколько елементов первого списка.
        List<String> list_1 = new ArrayList<>(Arrays.asList("triangle","square","circle","rectangle"));
        System.out.println(list_1);
        list_1.addAll(list.subList(1,6));
        System.out.println(list_1);

        // Task9 - Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println("---------task9");
        System.out.println(list);
        System.out.println(list_1);
        list.retainAll(list_1);
        System.out.println(list);


        // Task10 - Сортировка списка.
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);


        //  Task 11 - Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        List<String> list_2 = new ArrayList<>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100001; i++) {
            list_2.add(0, "brown");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("ArrayList time:"+(t2 - t1));

        List<String> list_3 = new LinkedList<>();
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100001; i++) {
            list_3.add(0, "brown");
        }
        long t4 = System.currentTimeMillis();
        System.out.println("LinkedList time:"+(t4 - t3));
    }
}
