package Animals;

import java.util.Objects;

public class Amphibia extends Animals {

    private String habitat;

    public Amphibia(String nickname, int age, String habitat) {
        super(nickname, age);
        setHabitat(habitat);
    }

    public void hunt() {
        if (this.getNickname() == null) {
            System.out.println("Животное охотится");
        } else {
            System.out.println(this.getNickname() + " охотится");
        }
    }

    public void move() {
        if (this.getNickname() == null) {
            System.out.println("Животное передвигается");
        } else {
            System.out.println(this.getNickname() + " передвигается");
        }
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (this.habitat == null) {
            this.habitat = habitat == null || habitat.trim().isEmpty() ? null : habitat.trim();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibia amphibia = (Amphibia) o;
        return habitat.equals(amphibia.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return "Земноводное {" + "Кличка=" + this.getNickname() +
                " \\ Возраст=" + this.getAge() +
                " \\ Среда обитания=" + this.getHabitat() + "}";
    }
}
