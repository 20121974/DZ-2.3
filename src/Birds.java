import java.util.Objects;

public class Birds extends Animal {
    private String livingEnvironment;//среда проживания

    public Birds(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }
    @Override
    public void eat() {
        System.out.println("Ешь корм");
    }
    @Override
    public void sleep() {
        System.out.println("Спи");
    }
    @Override
    public void go() {
        System.out.println("Добывай пищу");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public void hunt() {
        System.out.println("Охоться");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()){
            this.livingEnvironment = livingEnvironment;}
    }

}
