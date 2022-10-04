public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2:");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
    }

    public static void task3() {
        System.out.println("Задание 3:");
        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника  — ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ё")) {
                String word = words[i].replaceAll("ё", "е");
                System.out.print(word+" ");
            }
            else {System.out.print(words[i]+" ");
            }
        }
    }

}