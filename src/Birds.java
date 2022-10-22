public class Birds {
    private String livingEnvironment;//среда проживания

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
