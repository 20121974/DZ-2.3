public class Herbivores extends Mammals {

    private String typeOfFood;//тип пищи

    public Herbivores(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }

    public void graze() {
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty())
        this.typeOfFood = typeOfFood;
    }
}
