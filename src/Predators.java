import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;//тип пищи

    public Predators(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
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
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
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
