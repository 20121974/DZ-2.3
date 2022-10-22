public class Flightless extends Birds {

    private String typeOfMovement;

    public Flightless(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }
    public void walk() {
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isBlank() && !typeOfMovement.isEmpty())
        this.typeOfMovement = typeOfMovement;
    }
}
