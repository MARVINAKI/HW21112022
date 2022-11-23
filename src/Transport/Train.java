package Transport;

import java.util.Objects;
import java.util.SortedMap;

public class Train extends Transport {
    private double tripPrice;
    private double tripTime;
    private String nameOfStationA;
    private String nameOfStationB;
    private int amountOfWagons;

    public Train(String brand, String model, String countryOfProduction, String colorOfBody, int yearOfProduction, int speedMAX, double tripPrice, double tripTime, String nameOfStationA, String nameOfStationB, int amountOfWagons) {
        super(brand, model, countryOfProduction, colorOfBody, yearOfProduction, speedMAX);
        setTripPrice(tripPrice);
        setTripTime(tripTime);
        setNameOfStationA(nameOfStationA);
        setNameOfStationB(nameOfStationB);
        setAmountOfWagons(amountOfWagons);
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизелем");
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public double getTripTime() {
        return tripTime;
    }

    public String getNameOfStationA() {
        return nameOfStationA;
    }

    public String getNameOfStationB() {
        return nameOfStationB;
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    private void setTripPrice(double tripPrice) {
        double scale = Math.pow(10, 2);
        this.tripPrice = Math.abs(Math.ceil((tripPrice / scale) * scale));
    }

    public void setTripTime(double tripTime) {
        double scale = Math.pow(10, 1);
        this.tripTime = Math.abs(Math.ceil((tripTime / scale) * scale));
    }

    private void setNameOfStationA(String nameOfStationA) {
        this.nameOfStationA = nameOfStationA == null || nameOfStationA.trim().isEmpty() ? "Не указано" : nameOfStationA.trim();
    }

    public void setNameOfStationB(String nameOfStationB) {
        this.nameOfStationB = nameOfStationB == null || nameOfStationB.trim().isEmpty() ? "Не указано" : nameOfStationB.trim();
    }

    public void setAmountOfWagons(int amountOfWagons) {
        this.amountOfWagons = Math.abs(amountOfWagons);
    }

    @Override
    public String toString() {
        return "Train{" +
                "tripPrice=" + tripPrice +
                ", tripTime=" + tripTime +
                ", nameOfStationA='" + nameOfStationA + '\'' +
                ", nameOfStationB='" + nameOfStationB + '\'' +
                ", amountOfWagons=" + amountOfWagons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Double.compare(train.tripPrice, tripPrice) == 0 && Double.compare(train.tripTime, tripTime) == 0 && amountOfWagons == train.amountOfWagons && nameOfStationA.equals(train.nameOfStationA) && nameOfStationB.equals(train.nameOfStationB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripPrice, tripTime, nameOfStationA, nameOfStationB, amountOfWagons);
    }
}

