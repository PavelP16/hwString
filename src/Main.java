public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1________________________________________________________________________");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.printf("«Ф. И. О. сотрудника — %s».\n", fullName);

        System.out.println("\nЗадача №2________________________________________________________________________");

        System.out.printf("«Данные Ф. И. О. сотрудника для заполнения отчета — %s».\n", fullName.toUpperCase());

        System.out.println("\nЗадача №3________________________________________________________________________");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.printf("«Данные Ф. И. О. сотрудника — %s».", fullName);


    }
}
