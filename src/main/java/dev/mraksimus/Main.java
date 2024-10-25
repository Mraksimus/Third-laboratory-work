package dev.mraksimus;

public class Main {

    public static void main(String[] args) {

        /*
        Вариант 9
        Реализация хэш-таблицы для учета автомобилей в автопарке.
        Ключом будет номерной знак автомобиля, а значением - объект класса
        Car, содержащий информацию о марке, модели и годе выпуска.
        Необходимо реализовать операции вставки, поиска и удаления
        автомобиля по знаку.
         */
        HashTable<String, Car> hashTable = new HashTable<>(16);

        Car car1 = new Car("Audi", "A7", 2020);
        Car car2 = new Car("Audi", "RS7", 2023);
        Car car3 = new Car("Audi", "RS5", 2020);

        hashTable.put("1", car1);
        hashTable.put("2", car2);
        hashTable.put("3", car3);

        Car record = hashTable.get("1");

        System.out.println(record.getBrand() + " " + record.getModel() + " " + record.getYear());

        record = hashTable.remove("2");

        System.out.println(record.getBrand() + " " + record.getModel() + " " + record.getYear());

        hashTable.remove("3");
        hashTable.remove("1");

    }

}