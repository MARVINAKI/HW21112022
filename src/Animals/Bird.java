package Animals;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Bird extends Animals {

    private String habitat;
    private FlyType flyType;

    public static class FlyType {
        private String flyType;

        public FlyType(String flyType) {
            setFlyType(flyType);
        }

        private boolean flyOrNot() {
            return getFlyType().equals("Летающие");
        }

        public String getFlyType() {
            return flyType;
        }

        public final void setFlyType(String flyType) {
            this.flyType = flyType == null || flyType.trim().isEmpty() ? null : flyType.trim();
        }

        @Override
        public String toString() {
            return this.getFlyType();
        }


    }

    public Bird(String nickname, int age, String habitat) {
        super(nickname, age);
        setHabitat(habitat);
    }

    public void hunt() {
        if (this.getNickname() == null) {
            System.out.println("Птица охотится");
        } else {
            System.out.println(this.getNickname() + " охотится");
        }
    }

    public void move() {
        if (this.flyType == null) {
            System.out.println("Не определено");
        } else if (this.getNickname() == null) {
            System.out.println(this.getFlyType().flyOrNot() ?
                    "Птица летает" : "Птица гуляет");
        } else {
            System.out.println(this.getFlyType().flyOrNot() ?
                    this.getNickname() + " летает" : this.getNickname() + " гуляет");
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (this.getHabitat() == null) {
            this.habitat = habitat == null || habitat.trim().isEmpty() ? null : habitat.trim();
        }
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public final void setFlyType(FlyType flyType) {
        if (this.getFlyType() == null) {
            this.flyType = flyType;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return habitat.equals(bird.habitat) && flyType.equals(bird.flyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, flyType);
    }

    @Override
    public String toString() {
        return "Птица {" + "Кличка=" + this.getNickname() +
                " \\ Возраст=" + this.getAge() +
                " \\ Среда обитания=" + this.getHabitat() +
                " \\ Тип передвижения=" + this.getFlyType() + "}";
    }
}
