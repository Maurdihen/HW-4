public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 18; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1904; i < 2097; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();

        int sum_ = 0;
        for (int i = 1; i <= 12; i++) {
            sum_ += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum_ + " рублей");
        }
        System.out.println();

        int sum1 = 0;
        for (int i = 1; i <= 12; i++) {
            sum1 += 29000;
            sum1 *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum1 + " рублей");
        }
        System.out.println();

        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }
    }
}