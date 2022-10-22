import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;//тип пищи

    public Herbivores(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }

    public void graze() {
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
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty())
        this.typeOfFood = typeOfFood;
    }
}
