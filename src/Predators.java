public class Predators extends Mammals {
    private String typeOfFood;//тип пищи

    public Predators(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }

    public void hunting() {
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty())
            this.typeOfFood = typeOfFood;
    }
}
