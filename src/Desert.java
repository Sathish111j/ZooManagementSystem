public class Desert extends Environmentt {
    static int number_of_animals_in_environment=1;

    public Desert(int number_of_animals, double temperature, String color_tone) {
        super(number_of_animals, temperature, color_tone);


    }
    public void increment(){
        number_of_animals_in_environment+=1;
    }

    public static int getNumber_of_animals_in_environment() {
        return number_of_animals_in_environment;
    }
    @Override
    public String toString() {
        return "Desert Environment \n" +
                "    temperature= " + getTemperature() +
                ",   color_tone= " +getColor_tone() +
                ",   number of animals in the environment :"+getNumber_of_animals_in_environment();
    }
}
