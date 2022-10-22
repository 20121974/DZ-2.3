public class Flying extends Birds{
    private String typeOfMovement;
    public Flying(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }
    public void toFly() {
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isBlank() && !typeOfMovement.isEmpty())
            this.typeOfMovement = typeOfMovement;
    }
}
