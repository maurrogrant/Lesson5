package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Посмотреть меню напитков");
            System.out.println("2. Внести деньги");
            System.out.println("3. Выбрать напиток");
            System.out.println("4. Выход");
            System.out.print("Введите ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingMachine.displayMenu();
                    break;
                case 2:
                    System.out.print("Введите сумму для внесения: ");
                    double amount = scanner.nextDouble();
                    vendingMachine.addMoney(amount);
                    break;
                case 3:
                    System.out.print("Введите номер напитка: ");
                    int drinkNumber = scanner.nextInt();
                    vendingMachine.selectDrink(drinkNumber);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неправильный выбор. Пожалуйста, попробуйте снова.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
