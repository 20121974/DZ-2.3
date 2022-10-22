public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, String maximumMovementSpeed) {
        brand = brand;
        model = model;
        productionYear = productionYear;
        productionCountry = productionCountry;
        color = color;
        maximumMovementSpeed = maximumMovementSpeed;}

    @Override
    public void refill() {
        System.out.println("Заправтесь бензином или дизелем на заправке");
    }

    public void outputMessage() {
        System.out.println("Марка " + getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() +
                ", страна производитель " + getProductionCountry() + ", цвет " + getColor() + ", объем двигателя "
                + getMaximumMovementSpeed());}


}
