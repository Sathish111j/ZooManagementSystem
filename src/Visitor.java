public class Visitor extends Human {
    private int age;

    public Visitor(String first_name, String last_name, String address, String date_of_birth, int age) {
        super(first_name, last_name, address, date_of_birth);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
