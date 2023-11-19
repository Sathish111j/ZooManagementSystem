public class Human {
    private String  first_name;
    private String last_name;
    private String address;
    private String date_of_birth;

    public Human(String first_name, String last_name, String address, String date_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.date_of_birth = date_of_birth;
    }



    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }
}
