public class Car extends transport {
    public class insurance {
        private Integer insuranceValidityPeriod;//Срок действия страховки
        private String theCostOfInsurance;//Стоимость страховки
        private String insuranceNumber;//Номер страховки

        public insurance(Integer insuranceValidityPeriod, String theCostOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            this.theCostOfInsurance = theCostOfInsurance;
            this.insuranceNumber = insuranceNumber;
        }

        public Integer getInsuranceValidityPeriod() {
            if (insuranceValidityPeriod != 0) {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            } else {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            }
            return insuranceValidityPeriod;
        }

        public String getTheCostOfInsurance() {
            if (theCostOfInsurance != null && !theCostOfInsurance.isBlank() && !theCostOfInsurance.isEmpty()) {
                this.theCostOfInsurance = theCostOfInsurance;
            } else {
                this.theCostOfInsurance = "Стоимость страховки введена некорректно";
            }
            return theCostOfInsurance;
        }

        public String getInsuranceNumber() {
            if (insuranceNumber != null && !insuranceNumber.isBlank() && !insuranceNumber.isEmpty()) {
                this.insuranceNumber = insuranceNumber;
            } else {
                this.insuranceNumber = "Номер страховки некорректный";
            }
            return insuranceNumber;
        }

        public Integer checkingTheExpirationDateOfInsurance(Integer insuranceValidityPeriod) {
            if (insuranceValidityPeriod == 0 && insuranceValidityPeriod == null) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            return insuranceValidityPeriod;
        }

        public String checkingInsuranceNumber(String insuranceNumber) {
            if (insuranceNumber.length() != 9) {
                insuranceNumber = "Номер страховки некорректный!";
            } else {
                insuranceNumber = insuranceNumber;
            }
            return insuranceNumber;
        }
    }

    public class key {
        private String remoteEngineStart;//удалённый запуск двигателя
        private String keylessAccess;//бесключевой доступ

        public key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart() {
            if (remoteEngineStart == null && remoteEngineStart.isBlank() && remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "Ошибка";
            } else {
                this.remoteEngineStart = registrationNumber;
            }
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            if (keylessAccess == null && keylessAccess.isBlank() && keylessAccess.isEmpty()) {
                this.keylessAccess = "Ошибка";
            } else {
                this.keylessAccess = keylessAccess;
            }
            return keylessAccess;
        }
    }

    double engineVolume;//объем двигателя
    String transmission;//коробка передач
    private String bodyType;//тип кузова
    String registrationNumber;//регистрационный номер
    private int numberOfSeats;//количество мест
    String aSignOfSummerOrWinterTires;//признак летняя или зимняя резина
    private static insurance insurance;

    public Car.insurance getInsurance(int i, String s, String s1) {
        return insurance;
    }

    public void setInsurance(Car.insurance insurance) {
        this.insurance = insurance;
    }

    public Car.key getKey() {
        return key;
    }

    public void setKey(Car.key key) {
        this.key = key;
    }

    private key key;

    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               String aSignOfSummerOrWinterTires) {


        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
    }

    public double getEngineVolume() {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }

    public String getTransmission() {
        if (transmission == null && transmission.isBlank() && transmission.isEmpty()) {
            this.transmission = "ручная";
        } else {
            this.transmission = transmission;
        }
        return transmission;
    }

    public String getBodyType() {
        if (bodyType == null && bodyType.isBlank() && bodyType.isEmpty()) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        return bodyType;
    }

    public String getRegistrationNumber() {
        if (registrationNumber == null && registrationNumber.isBlank() && registrationNumber.isEmpty()) {
            this.registrationNumber = "А177АА177";
        } else {
            this.registrationNumber = registrationNumber;
        }
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        if (Double.compare(numberOfSeats, 0) <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        return numberOfSeats;
    }

    public String getaSignOfSummerOrWinterTires() {
        if (aSignOfSummerOrWinterTires != null && !aSignOfSummerOrWinterTires.isEmpty() && !aSignOfSummerOrWinterTires.isBlank()) {
            this.aSignOfSummerOrWinterTires = aSignOfSummerOrWinterTires;
        } else {
            this.aSignOfSummerOrWinterTires = "летняя";
        }
        return aSignOfSummerOrWinterTires;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setASignOfSummerOrWinterTires(String aSignOfSummerOrWinterTires) {
        this.aSignOfSummerOrWinterTires = aSignOfSummerOrWinterTires;
    }

    public void outputMessage() {
        System.out.println("Марка автомобиля " + getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() +
                ", страна производитель " + getProductionCountry() + ", цвет " + getColor() + ", объем двигателя " + getEngineVolume()
                + ", коробка передач " + getTransmission() + ", тип кузова " + getBodyType() + ", регистрационный номер " +
                getRegistrationNumber() + ", количество мест " + getNumberOfSeats() + ", признак летняя или зимняя резина " +
                getaSignOfSummerOrWinterTires() + getInsurance(Car.insurance.insuranceValidityPeriod, Car.insurance.insuranceNumber,
                Car.insurance.theCostOfInsurance));
    }

    public void changeTiresForSeasonalOnes(String aSignOfSummerOrWinterTires) {
        if (aSignOfSummerOrWinterTires == "летняя") {
            this.aSignOfSummerOrWinterTires = "зимняя";
        } else {
            this.aSignOfSummerOrWinterTires = "летняя";
        }
    }

    public static String checkingTheCorrectSpellingOfTheCarNumber(String registrationNumber) {
        if (registrationNumber.length() != 7 && !registrationNumber.contains("х000хх000")) {
            registrationNumber = "А177АА177";
        } else {
            registrationNumber = registrationNumber;
        }
        return registrationNumber;
    }
}
