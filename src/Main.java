import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Cycle lesson 2");
        System.out.println("Task 1");
        int contribution = 15_000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000) {
            sum = sum + contribution / 100;
            sum = sum + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Task 2");
        int x = 0;
//        int y = 10;
        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int y = 10; y > 0; y--) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        int populationGrowth = birthRate - deathRate;
        int year = 0;
        while (year < 10) {
            population = population + populationGrowth;
            year++;
            System.out.println("Год " + year + ", численность населения состовляет " + population);
        }
        System.out.println("Task 4");
        int target = 12_000_000;
        int contribution1 = 15_000;
        int sum1 = 0;
        int month1 = 0;
        while (sum1 < target) {
            sum1 = sum1 + sum1 / 100 * 7;
            sum1 = sum1 + contribution1;
            month1++;
            System.out.println("Месяц " + month1 + ", Василий накопил " + sum1 + " рублей");
        }
        System.out.println("Василию потребовалось " + month1 + " месяцев, что-бы накопить " + sum1 + " рублей");
        System.out.println("Task 5");
        int target1 = 12_000_000;
        int contribution2 = 15_000;
        int sum2 = 0;
        int month2 = 0;
        while (sum2 < target1) {
            sum2 = sum2 + sum2 / 100 * 7;
            sum2 = sum2 + contribution2;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", Василий накопил " + sum2 + " рублей");
            }
        }
        System.out.println("Task 6");
        int targetYear1 = 9;
        int contribution3 = 15_000;
        int sum3 = 0;
        int month3 = 1;
        int totalmonth = targetYear1 * 12;
        for (; month3 <= totalmonth; month3++) {
            sum3 = sum3 + contribution3;
            sum3 = sum3 + sum3 / 100 * 7;
            if (month3 % 6 == 0) {
                System.out.println("Василий за " + month3 + " месяца накопил " + sum3 + " рублей");
            }
        }
        System.out.println("Task 7");
        int friday = 1;
        int month4 = 31;
        for (; friday < month4; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо погдготовить отчет");
        }
        System.out.println("Task 8");
        int cometFlightCycle = 79;
        int beginningOfPeriod = 1823;
        int endOfPeriod = 2123;
        for (; beginningOfPeriod <= endOfPeriod; beginningOfPeriod++) {
            if (beginningOfPeriod % cometFlightCycle == 0) {
                System.out.println(beginningOfPeriod);
            }
        }
    }
}