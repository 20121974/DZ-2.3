public class train extends transport {
    String thePriceOfTheTrip;//Цена поездки
    String travelTime;//Время поездки
    String nameOfTheDepartureStation;//Название станции отбытия
    String finalStop;// Конечная остановка
    String numberOfWagons;//Количество вагонов

    public train(String brand, String model, int productionYear, String productionCountry,String maximumMovementSpeed,
                 String thePriceOfTheTrip, String nameOfTheDepartureStation, String finalStop,
                 String numberOfWagons) {
        super();
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maximumMovementSpeed = maximumMovementSpeed;
        this.thePriceOfTheTrip = thePriceOfTheTrip;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public String getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(String thePriceOfTheTrip) {
        if (thePriceOfTheTrip != null && !thePriceOfTheTrip.isBlank() && !thePriceOfTheTrip.isEmpty())
        this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime != null && !travelTime.isBlank() && !travelTime.isEmpty())
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
