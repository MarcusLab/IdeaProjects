package Урок_3;

public class Lesson_3 {

    public static void main(String[] args) {

        // boolean всегда true / false

        int personAge = 30;
        int maxAge = 50;
        int minAge = 10;

        System.out.println("Вам больше  " + minAge + " и меньше " + maxAge + " лет?");

        if (personAge > minAge || personAge < maxAge) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (personAge > minAge) {
            if (personAge < maxAge) {
                System.out.println("Вам больше " + minAge + "и меньше " + maxAge);
            } else {
                System.out.println("Вам больше " + maxAge);
            }
        } else {
            System.out.println("Вам меньше " + minAge);
        }

    }

}
