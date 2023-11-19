public class Camel extends Animal implements Animal_action{
    public Camel(String name, int age) {
        super(name, age);
        number_of_animals+=1;
    }
    static public int number_of_animals;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String feed() {
        return "Employee Feeds Camel with grass";
    }

    @Override
    public String eat() {
        return "Camel eats grass";
    }

    @Override
    public String clean() {
        return "Employee cleans sand for Camel";
    }

    @Override
    public String move() {
        return "Camel moves in the sand";
    }
    public String toString() {
        return "Camel" +
                "  name='" + getName() +
                ", age=" + getAge() ;
    }
    public void details(){
        System.out.println(feed());
        System.out.println(eat());
        System.out.println(clean());
        System.out.println(move());
    }
}