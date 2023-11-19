import java.util.ArrayList;

public class Animal {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public class Employeee extends Human{
        private String work_type;
        private float salary;
        private long social_security;
        private  String email;
        private String password;

        public Employeee(String first_name, String last_name, String address, String date_of_birth, String work_type, float salary, long social_security, String email, String password) {
            super(first_name, last_name, address, date_of_birth);
            this.work_type = work_type;
            this.salary = salary;
            this.social_security = social_security;
            this.email = email;
            this.password = password;
        }

        public String getWork_type() {
            return work_type;
        }

        public float getSalary() {
            return salary;
        }

        public long getSocial_security() {
            return social_security;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() +
                ", age=" + getAge() ;
    }

}
