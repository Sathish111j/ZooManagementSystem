public class Panda extends Animal implements Animal_action{
    static public int number_of_animals;
    public Panda(String name, int age) {
        super(name, age);
        number_of_animals+=1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String feed() {
        return "Employee Feeds Panda with Bamboo";
    }

    @Override
    public String eat() {
        return "Panda eats grass";
    }

    @Override
    public String clean() {
        return "Employee cleans grounds and water for Panda";
    }

    @Override
    public String move() {
        return "Panda plays around the trees";
    }
    public String toString() {
        return "Panda" +
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