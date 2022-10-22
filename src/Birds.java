public class Birds extends Animals{
    private String livingEnvironment;//среда проживания

    public Birds(String nicknameAnimal, int numberOfYears) {
        super(nicknameAnimal, numberOfYears);
    }

    public void hunt() {
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty())
            this.livingEnvironment = livingEnvironment;
    }
}
