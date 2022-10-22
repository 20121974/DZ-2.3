import java.util.Objects;

public class Flightless extends Birds {

    private String typeOfMovement;

    public Flightless(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }
    public void walk() {
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isBlank() && !typeOfMovement.isEmpty())
        this.typeOfMovement = typeOfMovement;
    }
}
