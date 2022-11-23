package Animals;

import java.util.Objects;

public class Mammalia extends Animals {

    private String habitat;
    private int moveSpeed;
    private TypeOfEat typeOfEat;

    public static class TypeOfEat {
        private String typeOfEat;

        public TypeOfEat(String typeOfEat) {
            setTypeOfEat(typeOfEat);
        }

        private boolean eatHerb() {
            return getTypeOfEat().equalsIgnoreCase("Травоядное");
        }

        private boolean eatMeat() {
            return getTypeOfEat().equalsIgnoreCase("Хищник");
        }

        public String getTypeOfEat() {
            return typeOfEat;
        }

        private void setTypeOfEat(String typeOfEat) {
            this.typeOfEat = typeOfEat == null || typeOfEat.trim().isEmpty() ? null : typeOfEat.trim();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TypeOfEat typeOfEat1 = (TypeOfEat) o;
            return typeOfEat.equals(typeOfEat1.typeOfEat);
        }

        @Override
        public int hashCode() {
            return Objects.hash(typeOfEat);
        }

        @Override
        public String toString() {
            return this.typeOfEat;
        }
    }


    public Mammalia(String nickname, int age, String habitat, int moveSpeed) {
        super(nickname, age);
        setHabitat(habitat);
        setMoveSpeed(moveSpeed);
    }

    public void hunt() {
        if (this.getNickname() == null && this.getTypeOfEat().eatHerb()) {
            System.out.println("Животное пасется и кушает травку");
        } else if (this.getNickname() == null && this.getTypeOfEat().eatMeat()) {
            System.out.println("Хищник охотится на жертву");
        } else {
            System.out.println(this.getTypeOfEat().eatHerb() ? this.getNickname() + " пасется и кушает травку"
                    : this.getNickname() + " охотится на жертву");
        }
    }

    public void move() {
        if (this.getNickname() == null) {
            System.out.println("Животное гуляет");
        } else {
            System.out.println(this.getNickname() + " гуляет");
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

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = Math.abs(moveSpeed);
    }

    public final TypeOfEat getTypeOfEat() {
        return typeOfEat;
    }

    public final void setTypeOfEat(TypeOfEat typeOfEat) {
        if (this.getTypeOfEat() == null) {
            this.typeOfEat = typeOfEat;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammalia mammalia = (Mammalia) o;
        return moveSpeed == mammalia.moveSpeed && habitat.equals(mammalia.habitat) && typeOfEat.equals(mammalia.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, moveSpeed, typeOfEat);
    }

    @Override
    public String toString() {
        return "Млекопитающее {" + "Кличка=" + this.getNickname() +
                " \\ Возраст=" + this.getAge() +
                " \\ Среда обитания=" + this.getHabitat() +
                " \\ Тип млекопитающего=" + this.getTypeOfEat() + "}";
    }
}
