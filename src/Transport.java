public abstract class Transport {
    private String brand;//марка автомобиля
    private String model;//модель
    private int productionYear;//год выпуска
    private String productionCountry;//страна-производитель
    private String color;//цвет
    private String maximumMovementSpeed;//максимальная скорость передвижения

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, String maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public abstract void refill();

    public Transport() {

    }

    public String getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(String maximumMovementSpeed) {
        if (maximumMovementSpeed != null && !maximumMovementSpeed.isBlank() && !maximumMovementSpeed.isEmpty())
            this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty())
            this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }
}
