public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1.4 Циклы");
        //Задание 1
        System.out.println("Задание 1");
        int i = 1;
        while (i <= 10){
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (int p = 10; p >= 1; p = p-1){
            System.out.print(p +" ");
        }
        System.out.println();
        //Задание 2
        System.out.println("Задание 2");
        int f = 5;

        for (int everyFriday = f; everyFriday <= 31; everyFriday +=7) {
            System.out.println("Сегодня пятница " + everyFriday + "-е число. Необходимо подготовить отчет");
        }

    }
}