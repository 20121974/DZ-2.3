import java.util.Objects;

public class Mammals extends Animal {
    private String livingEnvironment;//среда проживания
    private int movementSpeed;//скорость перемещения

    public Mammals(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }
    @Override
    public void eat() {
    }
    @Override
    public void sleep() {

    }
    @Override
    public void go() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && livingEnvironment.equals(mammals.livingEnvironment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    public void walk() {
        System.out.println("Гуляй");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty())
        this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed > 0){
        this.movementSpeed = movementSpeed;}
    }
}
