public class Tortoise extends Animal implements Animal_action{
    static public int number_of_animals;
    public Tortoise(String name, int age) {
        super(name, age);
        number_of_animals+=1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String feed() {
        return "Employee Feeds Tortoise with dead fishes ";
    }

    @Override
    public String eat() {
        return "Tortoise eats fishes";
    }

    @Override
    public String clean() {
        return "Employee cleans the pond for Tortoise";
    }

    @Override
    public String move() {
        return "Tortoise crawls on the ground and swims in water";
    }
    public String toString() {
        return "tortoise" +
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