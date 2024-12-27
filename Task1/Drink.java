public enum Drink {
    COKE("Кока-Кола", 50, 10),
    PEPSI("Пепси", 45, 5),
    FANTA("Фанта", 40, 0), // Нет в наличии
    MINERAL_WATER("Минеральная вода", 30, 8),
    JUICE("Сок", 60, 3);

    private final String name;
    private final double price;
    private int stock;

    Drink(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void decreaseStock() {
        if (stock > 0) {
            stock--;
        }
    }

    @Override
    public String toString() {
        return name + " - " + price + " рублей, Остаток: " + stock;
    }
}
