public class Employee extends Human{
    private String work_type;
    private float salary;
    private long social_security;
    private  String email;


    static public int number_of_employee;


    public Employee(String first_name, String last_name, String address, String date_of_birth, String work_type, float salary, long social_security, String email) {
        super(first_name, last_name, address, date_of_birth);
        this.work_type = work_type;
        this.salary = salary;
        this.social_security = social_security;
        this.email = email;
        number_of_employee+=1;
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

    @Override
    public String toString() {
        return "Employee name : " +getFirst_name() +" " +getLast_name()+
                ",work_type=" + getWork_type()  +
                ", salary=" + getSalary() +
                ", social_security=" + getSocial_security() +
                ", email='" + getEmail() ;
    }
}
