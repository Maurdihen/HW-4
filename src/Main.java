public class Main {
    public static void main(String[] args) {
        int sum1 = 0;
        short i = 0;
        while (sum1 < 2459000) {
            sum1 *= 1.01;
            sum1 += 15000;
            i += 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum1 + " рублей");
        }
        System.out.println();

        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();

        --i;

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int population = 12000000;
        int populationGrowth = (17 - 8) * (population / 1000);
        for (i = 1; i < 11; i++) {
            population += populationGrowth;
            System.out.println("Год " + (i) + ", численность населения составляет " + population);
        }
        System.out.println();

        int sum2 = 15000;
        int goal = 12000000;
        i = 1;
        while (sum2 < goal) {
            sum2 *= 1.07;
            System.out.println("Месяц " + i + ", на счете " + sum2);
            i += 1;
        }
        System.out.println();

        sum2 = 15000;
        i = 1;
        while (sum2 < goal) {
            sum2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", на счете " + sum2);
            }
            i += 1;
        }
        System.out.println();

        sum2 = 15000;
        i = 1;
        while (i <= 9 * 12) {
            sum2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", на счете " + sum2);
            }
            i += 1;
        }
        System.out.println();

        int day = 1;

        do {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day += 7;
        } while (day <= 31);
        System.out.println();

        int year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;

        for (year = yearBefore; year <= yearAfter; year++) {
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}