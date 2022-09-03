public class Manager {

    private static double income = 0;

    public static void getIncome() {
        System.out.println("Income: " + income);
    }

    public static void addIncome(double price) {
        income += price;
    }

}
