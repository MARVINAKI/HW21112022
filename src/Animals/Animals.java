package Animals;

public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
    }

    public abstract void hunt();

    public abstract void move();

    public String getNickname() {
        return nickname;
    }

    public final void setNickname(String nickname) {
        if (getNickname() == null) {
            this.nickname = nickname == null || nickname.trim().isEmpty() ? null : nickname.trim();
        }
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (getAge() == 0) {
            this.age = Math.abs(age);
        }
    }
}
