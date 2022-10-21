public class transport {
    String brand;//марка автомобиля
    String model;//модель
    int productionYear;//год выпуска
    String productionCountry;//страна-производитель
    String color;//цвет
    String maximumMovementSpeed;//максимальная скорость передвижения

    public transport(String brand, String model, int productionYear, String productionCountry, String color, String maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public transport() {

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
