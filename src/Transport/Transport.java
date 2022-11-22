package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private String countryOfProduction;
    private String colorOfBody;
    private int yearOfProduction;
    private int speedMAX;

    public Transport(String brand, String model, String countryOfProduction, String colorOfBody, int yearOfProduction, int speedMAX) {
        setBrand(brand);
        setModel(model);
        setCountryOfProduction(countryOfProduction);
        setColorOfBody(colorOfBody);
        setYearOfProduction(yearOfProduction);
        setSpeedMAX(speedMAX);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand == null || brand.trim().isEmpty() ? "Не указано" : brand.trim();
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model == null || model.trim().isEmpty() ? "Не указано" : model.trim();
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    private void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction == null || countryOfProduction.trim().isEmpty() ? "Не указано" : countryOfProduction.trim();
    }

    public String getColorOfBody() {
        return colorOfBody;
    }

    public void setColorOfBody(String colorOfBody) {
        this.colorOfBody = colorOfBody == null || colorOfBody.trim().isEmpty() ? "белый" : colorOfBody.trim();
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = Math.abs(yearOfProduction);
    }

    public int getSpeedMAX() {
        return speedMAX;
    }

    public void setSpeedMAX(int speedMAX) {
        this.speedMAX = Math.abs(speedMAX);
    }

}
