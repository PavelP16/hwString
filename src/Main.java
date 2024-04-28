public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1________________________________________________________________________");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.printf("«Ф. И. О. сотрудника — %s »\n", fullName); // Вариант 1
        System.out.printf("%s %s %s.\n", firstName, middleName, lastName); // Вариант 2

        String fullName2 = String.format("%s %s %s", firstName, middleName, lastName); // Варинт 3. Метод String
        System.out.println(fullName2);// Вывод варианта 3

        //Варинт 4 но его редко используют, но знать про него надо.
        String fullName3 = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        System.out.println(fullName3);

        //Вариант 5 (не плохой вариант) Хорошо подходит для массива, не нужно циклы городить а можно сразу вывестии все что в массиве
        String fullName4 = String.join(" ", firstName, middleName, lastName);
        System.out.println(fullName4);


        System.out.println("\nЗадача №2________________________________________________________________________");

        System.out.printf("«Данные Ф. И. О. сотрудника для заполнения отчета — %s».\n", fullName.toUpperCase());

        System.out.println("\nЗадача №3________________________________________________________________________");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.printf("«Данные Ф. И. О. сотрудника — %s».\n", fullName);

        //Вариант 2
        System.out.println(fullName.replace("ё", "e"));

    }
}
