import java.util.Scanner;

import view.ToyStoreView;

/**
 * Класс ToyStoreProgram представляет программу для работы с игрушечным магазином.
 */
public class ToyStoreProgram {
    /**
     * Главный метод, который запускает программу для работы с игрушечным магазином.
     * В этом методе добавляются игрушки, изменяются частоты их выпадения, организуется розыгрыш призовых игрушек,
     * получается призовая игрушка, уменьшается ее количество в магазине и записываются призовые игрушки в файл.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToyStoreView view = new ToyStoreView();

        // Добавление новых игрушек
        System.out.println("Добавление новых игрушек:");
        view.addNewToy(1, "Мяч", 30);
        System.out.println("Добавлена игрушка: Мяч");
        view.addNewToy(2, "Мягкая игрушка", 20);
        System.out.println("Добавлена игрушка: Мягкая игрушка");
        view.addNewToy(3, "Машинка", 30);
        System.out.println("Добавлена игрушка: Машинка");

        // Изменение веса (частоты выпадения игрушки)
        System.out.println("Изменение частоты выпадения игрушек:");
        view.updateToyFrequency(1, 201);
        view.updateToyFrequency(2, 2101);
        view.updateToyFrequency(3, 2201);
        System.out.println("Частота игрушки Мяч установлена на 201");
        System.out.println("Частота игрушки Мяч установлена на 2101");
        System.out.println("Частота игрушки Мяч установлена на 2201");

        // Организация розыгрыша игрушек
        System.out.println("Организация розыгрыша игрушек:");
        view.organizeGiveaway();
        System.out.println("Розыгрыш организован");

        // Получение призовой игрушки
        System.out.println("Получение призовой игрушки:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите любой символ, чтобы получить призовую игрушку:");
        scanner1.nextLine();
        System.out.println("Вы получили призовую игрушку: " + view.getPrizeToy().getName());

        // Запись призовых игрушек в файл
        System.out.println("Запись призовых игрушек в файл:");
        view.writePrizeToysToFile("prize_toys.txt");
        System.out.println("Призовые игрушки записаны в файл");
    }
}