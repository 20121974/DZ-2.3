public class Main {
    public static void main(String[] args) {
        train swallow = new train("Ласточка", "B-901", 2011, "Россия", "301 км/ч",
                "3500 рублей", "Белорусский вокзал", "Минск-Пассажирский", "11");
        swallow.outputMessage();

        train leningrad = new train("Ленинград", "Д-125", 2019, "Россия", "270 км/ч",
                "1700 рублей", "Ленинградский вокзал", "Ленинград-Пассажирский", "8");
        leningrad.outputMessage();

        bus lada = new bus("Lada", "Grande", 2015, "Россия", "желтый", "170");
        lada.outputMessage();

        bus audi = new bus("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", "200");
        audi.outputMessage();

        bus bmv = new bus("BMW", "Z8", 2021, "Германия", "черный", "220");
        bmv.outputMessage();
    }
}