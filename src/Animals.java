public class Animals {
    private String nicknameAnimal;//кличка животного
    private int numberOfYears;//количество лет

    public Animals(String nicknameAnimal, int numberOfYears) {
        this.nicknameAnimal = nicknameAnimal;
        this.numberOfYears = numberOfYears;
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void go() {

    }

    public String getNicknameAnimal() {
        return nicknameAnimal;
    }

    public void setNicknameAnimal(String nicknameAnimal) {
        if (nicknameAnimal != null && !nicknameAnimal.isBlank() && !nicknameAnimal.isEmpty())
            this.nicknameAnimal = nicknameAnimal;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears > 0)
            this.numberOfYears = numberOfYears;
    }
}
