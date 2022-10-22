public class Mammals extends  Animals {
    private String livingEnvironment;//среда проживания
    private int movementSpeed;//скорость перемещения

    public Mammals(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }

    public void walk() {
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
        if (movementSpeed > 0)
        this.movementSpeed = movementSpeed;
    }
}
