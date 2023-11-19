public class Lion extends Animal implements Animal_action {
    static public int number_of_animals;
    public Lion(String name, int age) {
        super(name, age);
        number_of_animals+=1;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String feed() {
        return "Employee Feeds Lion with meat";
    }

    @Override
    public String eat() {
        return "Lion eat meat and other animals";
    }

    @Override
    public String clean() {
        return "Employee cleans grounds and water for lion";
    }

    @Override
    public String move() {
        return "Lion runs around the ground";
    }

    public String toString() {
        return "lion" +
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
