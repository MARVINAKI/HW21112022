import Animals.Animals;
import Animals.Bird;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        /*Car.Key keyType1 = new Car.Key("YES", "YES");
        Car.Key keyType2 = new Car.Key("YES", "NO");
        Car.Key keyType3 = new Car.Key("NO", "YES");
        Car.Key keyType4 = new Car.Key("NO", "NO");
        Car.Key keyType5 = new Car.Key("", "");

        Car car1 = new Car("Nissan", "Terrano", "Japan",
                "", 2019, 180, 2,
                "МКП", "Crossover", "А126КМ702",
                "Зимняя", 5);
        Car car2 = new Car("Chevrolet", "Cruze", "USA",
                "Silver", 2013, 200, 1.8,
                "МКП", "Sedan", "О871ОА102",
                "Летняя", 5);

        Train train1 = new Train("Ласточка", "В-901", "РФ", null,
                2011, 301, 3500, 11, "Белорусский вокзал",
                "Минск", 11);
        Train train2 = new Train("Ленинград", "D-125", "РФ", null,
                2019, 270, 1700, 3, "Ленинградский вокзал",
                "Ленинград", 8);

        Bus bus1 = new Bus("НЕФАЗ", "5299-30-57", "РФ", "белый",
                2022, 140);
        Bus bus2 = new Bus("VolgaBus", "СитиРитм-10", "РФ", "желтый",
                2017, 120);
        Bus bus3 = new Bus("Volvo", "7900", "Belgium", "зеленый",
                2011, 120);*/


        Bird.FlyType flying = new Bird.FlyType("Летающие");
        Bird.FlyType notFlying = new Bird.FlyType("Нелетающие");

        Bird peacock = new Bird("Павлик", 31, "Индостан, остров Цейлон");
        peacock.setFlyType(notFlying);
        Bird penguin = new Bird(null, 5, "Южное полушарие");
        penguin.setFlyType(notFlying);
        Bird dodo = new Bird("Мавр", 3, "остров Маврикий");
        dodo.setFlyType(notFlying);
        Bird seagull = new Bird("Кричуха", 2, "");
        seagull.setFlyType(flying);
        Bird albatross = new Bird("Джессика", 4, "Южные тропики и Антарктида");
        albatross.setFlyType(flying);
        Bird falcon = new Bird("Фил", 3, null);
        falcon.setFlyType(flying);
        dodo.move();
        falcon.move();
        penguin.move();
        peacock.hunt();
        seagull.hunt();
        albatross.hunt();
    }
}