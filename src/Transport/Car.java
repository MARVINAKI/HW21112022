package Transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String numberOfRegistration;
    private String rubber;
    private int numberOfSeats;
    private Insurance insurance;
    private Key key;


    public class Insurance {
        private String validity;
        private String number;
        private int price;

        public Insurance(String validity, String number, int price) {
            setValidity(validity);
            setNumber(number);
            setPrice(price);
        }

        public String getValidity() {
            return validity;
        }

        public String getNumber() {
            return number;
        }

        public int getPrice() {
            return price;
        }

        public String getCarNumber() {
            return Car.this.getNumberOfRegistration();
        }

        private void setValidity(String validity) {
            this.validity = validity == null || validity.trim().isEmpty() || validity.length() != 10 ? "Некорректные данные (Пр.: чч.мм.гггг)" : validity.trim();
            //проверку чч.мм.гггг
        }

        private void setNumber(String number) {
            this.number = number == null || number.trim().isEmpty() || number.length() != 9 ? "Номер страховки некорректный!" : number.trim();
        }

        private void setPrice(int price) {
            this.price = Math.abs(price);
        }
    }

    public static class Key {
        private String remoteEngine;
        private String keyless;

        public Key(String remoteEngine, String keyless) {
            setRemoteEngine(remoteEngine);
            setKeyless(keyless);
        }

        public String getRemoteEngine() {
            return remoteEngine;
        }

        public void setRemoteEngine(String remoteEngine) {
            this.remoteEngine = remoteEngine == null || remoteEngine.trim().isEmpty() ? "default" : remoteEngine.trim();
        }

        public String getKeyless() {
            return keyless;
        }

        public void setKeyless(String keyless) {
            this.keyless = keyless == null || keyless.trim().isEmpty() ? "default" : keyless.trim();
        }
    }

    public Car(String brand, String model, String countryOfProduction, String colorOfBody, int yearOfProduction, int speedMAX, double engineVolume, String transmission, String bodyType, String numberOfRegistration, String rubber, int numberOfSeats) {
        super(brand, model, countryOfProduction, colorOfBody, yearOfProduction, speedMAX);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setBodyType(bodyType);
        setNumberOfRegistration(numberOfRegistration);
        setRubber(rubber);
        setNumberOfSeats(numberOfSeats);
    }

    @Override
    public void refill() {
        System.out.println("Заправка автомобиля на АЗС (бензин/дизель) / зарядка АКБ на СЗЭ");
    }

    public void changeTires(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                this.rubber = "зимняя";
                System.out.println("Установлена " + rubber + " резина");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.rubber = "летняя";
                System.out.println("Установлена " + rubber + " резина");
                break;
            default:
                System.out.println("Некорректно указан месяц, введите значение от 1 до 12");
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumberOfRegistration() {
        return numberOfRegistration;
    }

    public String getRubber() {
        return rubber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        double scale = Math.pow(10, 1);
        this.engineVolume = engineVolume <= 0 ? 1.5 : Math.ceil((engineVolume / scale) * scale);
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null || transmission.trim().isEmpty() ? "Не указано" : transmission.trim();
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType == null || bodyType.trim().isEmpty() ? "Не указано" : bodyType.trim();
    }

    public void setNumberOfRegistration(String numberOfRegistration) {
        if (numberOfRegistration.trim().length() != 9) {
            this.numberOfRegistration = "Гос.номер некорректен (Пример: x000xx000)";
        } else {
            char[] mas = numberOfRegistration.toCharArray();
            this.numberOfRegistration = Character.isLetter(mas[0] & mas[4] & mas[5]) &
                    Character.isDigit(mas[1] & mas[2] & mas[3] & mas[6] & mas[7] & mas[8]) ?
                    numberOfRegistration : "Гос.номер некорректен (Пример: x000xx000)";
        }
    }

    public void setRubber(String rubber) {
        this.rubber = rubber == null || rubber.trim().isEmpty() ? "Не указано" : rubber.trim();
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats <= 0 || numberOfSeats > 10 ? 2 : numberOfSeats;
    }
}
