public class Child extends Visitor{
    static public int ticket_amt=30;
    static public int no_of_ticket_sold;

    public Child(String first_name, String last_name, String address, String date_of_birth, int age) {
        super(first_name, last_name, address, date_of_birth, age);
        Owner.IncreaseMoney(ticket_amt);
        no_of_ticket_sold+=1;

    }
    @Override
    public String toString() {
        return "Children" +
                "  first_name= " + getFirst_name() +
                ", last_name= " + getLast_name() +
                ", address= " + getAddress() +
                ", date_of_birth= " + getDate_of_birth() ;
    }
    public int getTicket_amt() {
        return ticket_amt;
    }
}
