public class Owner extends Human{
    static private double money=0;

    public Owner(String first_name, String last_name, String address, String date_of_birth, double money) {
        super(first_name, last_name, address, date_of_birth);
        Owner.money = money;
    }

    public double getMoney() {
        return money;
    }

    public static void IncreaseMoney(double money) {
        Owner.money += money;
    }

}
