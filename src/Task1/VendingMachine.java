package Task1;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private final Map<Integer, Drink> menu;
    private double balance;

    public VendingMachine() {
        balance = 0.0;
        menu = initializeMenu();
    }

    // Инициализация меню напитков с запасами
    private Map<Integer, Drink> initializeMenu() {
        Map<Integer, Drink> menu = new HashMap<>();
        for (Drink drink : Drink.values()) {
            menu.put(drink.ordinal() + 1, drink);
        }
        return menu;
    }

    // Метод для отображения меню
    public void displayMenu() {
        System.out.println("Меню напитков:");
        for (Map.Entry<Integer, Drink> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    // Метод для внесения денег
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Вы внесли: " + amount + " рублей. Текущий баланс: " + balance + " рублей.");
        } else {
            System.out.println("Сумма должна быть положительной.");
        }
    }

    // Метод для выбора напитка
    public void selectDrink(int drinkNumber) {
        Drink selectedDrink = menu.get(drinkNumber);
        if (selectedDrink != null) {
            if (selectedDrink.getStock() > 0) {
                if (balance >= selectedDrink.getPrice()) {
                    balance -= selectedDrink.getPrice();
                    selectedDrink.decreaseStock();
                    System.out.println("Вы получили: " + selectedDrink.getName());
                    System.out.println("Текущий баланс: " + balance + " рублей.");
                } else {
                    System.out.println("Недостаточно средств для покупки " + selectedDrink.getName() + ".");
                }
            } else {
                System.out.println("Извините, " + selectedDrink.getName() + " нет в наличии.");
            }
        } else {
            System.out.println("Неправильный номер напитка.");
        }
    }
}
