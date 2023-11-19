public class Environmentt {

    private double temperature;
    private String color_tone;


    public Environmentt(int number_of_animals, double temperature, String color_tone) {

        this.temperature = temperature;
        this.color_tone = color_tone;

    }



    public double getTemperature() {
        return temperature;
    }

    public String getColor_tone() {
        return color_tone;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "temperature=" + temperature +
                ", color_tone='" + color_tone + '\'' +
                '}';
    }
}