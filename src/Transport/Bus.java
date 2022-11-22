package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String countryOfProduction, String colorOfBody, int yearOfProduction, int speedMAX) {
        super(brand, model, countryOfProduction, colorOfBody, yearOfProduction, speedMAX);
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизелем на АЗС");
    }
}
