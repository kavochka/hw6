public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i -= 1) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i -= 1) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.printf("%s год является високосным%n", i);
            }
        }
        System.out.println();

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Task 8");
        int total = 0;
        int deposit = 29000;
        for (int month = 1; month <= 12; month++) {
            total += deposit;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, total);
        }
        System.out.println();

        System.out.println("Task 9");
        // double totalBank = 0;
        //int depositBank = 29000;
        //for (int month = 1; month <= 12; month++) {
        //    totalBank = totalBank + depositBank;
        //    totalBank = totalBank + totalBank / 100жз
        //    System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей%n", month, totalBank);}

        int salaryI = 29000;
        int totalBank = 0;
        for (int i = 1; i <= 12; i++) {
            totalBank = totalBank + salaryI;
            totalBank = totalBank + totalBank / 100;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", i, totalBank);
        }

        System.out.println();

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %s = %s%n", i, i * 2);
        }

    }
}