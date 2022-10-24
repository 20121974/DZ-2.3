public class Main {
    public static void main(String[] args) {
        Train swallow = new Train("Ласточка", "B-901", 2011, "Россия", "301 км/ч",
                3500, "Белорусский вокзал", "Минск-Пассажирский", "11");
        swallow.outputMessage();
        swallow.refill();
        Train leningrad = new Train("Ленинград", "Д-125", 2019, "Россия", "270 км/ч",
                1700, "Ленинградский вокзал", "Ленинград-Пассажирский", "8");
        leningrad.outputMessage();
        swallow.refill();
        Bus lada = new Bus("Lada", "Grande", 2015, "Россия", "желтый", "170");
        lada.outputMessage();
        lada.refill();
        Bus audi = new Bus("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", "200");
        audi.outputMessage();
        lada.refill();
        Bus bmv = new Bus("BMW", "Z8", 2021, "Германия", "черный", "220");
        bmv.outputMessage();
        lada.refill();
    }
}