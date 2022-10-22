public class Train extends Transport {
    private int thePriceOfTheTrip;//Цена поездки
    private int travelTime;//Время поездки
    private String nameOfTheDepartureStation;//Название станции отбытия
    private String finalStop;// Конечная остановка
    private String numberOfWagons;//Количество вагонов

    public Train(String brand, String model, int productionYear, String productionCountry, String maximumMovementSpeed,
                 int thePriceOfTheTrip, String nameOfTheDepartureStation, String finalStop,
                 String numberOfWagons) {
        super();
        brand = brand;
        model = model;
        productionYear = productionYear;
        productionCountry = productionCountry;
        maximumMovementSpeed = maximumMovementSpeed;
        this.thePriceOfTheTrip = thePriceOfTheTrip;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("Заправтесь дизелем");
    }

    public int getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(int thePriceOfTheTrip) {
       this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        if (nameOfTheDepartureStation != null && !nameOfTheDepartureStation.isBlank() && !nameOfTheDepartureStation.isEmpty())
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isBlank() && !finalStop.isEmpty())
        this.finalStop = finalStop;
    }

    public String getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(String numberOfWagons) {
        if (numberOfWagons != null && !numberOfWagons.isBlank() && !numberOfWagons.isEmpty())
        this.numberOfWagons = numberOfWagons;
    }

    public void outputMessage() {
        System.out.println("Поезд " + getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() +
                ", страна производитель " + getProductionCountry() + ", скорость " + getMaximumMovementSpeed() + ", название станции отбытия "
                + getNameOfTheDepartureStation() + ", конечная остановка " + getFinalStop() + ", цена поездки "
                + getThePriceOfTheTrip() + ", количество вагонов " + getNumberOfWagons());}
}
