public class Adult extends Visitor{
    static public final int ticket_amount =50;
    static public int no_of_ticket_sold;

    public Adult(String first_name, String last_name, String address, String date_of_birth, int age) {
        super(first_name, last_name, address, date_of_birth, age);
        Owner.IncreaseMoney(ticket_amount);
        no_of_ticket_sold+=1;
    }

    @Override
    public String toString() {
        return "Adult" +
                "  first_name= " + getFirst_name() +
                ", last_name= " + getLast_name() +
                ", address= " + getAddress() +
                ", date_of_birth= " + getDate_of_birth() ;
    }

    public int getTicket_amount() {
        return ticket_amount;
    }
}
