package Animals;

import java.util.Objects;

public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
    }

    public abstract void hunt();

    public abstract void move();

    public void sleep() {
        if (getNickname() == null) {
            System.out.println("Животное спит");
        } else {
            System.out.println(getNickname() + " спит");
        }
    }

    public final String getNickname() {
        return nickname;
    }

    public final void setNickname(String nickname) {
        if (getNickname() == null) {
            this.nickname = nickname == null || nickname.trim().isEmpty() ? null : nickname.trim();
        }
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (getAge() == 0) {
            this.age = Math.abs(age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && nickname.equals(animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
