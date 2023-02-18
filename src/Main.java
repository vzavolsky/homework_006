public class Main {
    public static void main(String[] args) {

        task_01();
        task_02();
        task_03();
        task_04();
        task_05();
        task_06();
        task_07();
        task_08();
        task_09();
        task_10();
    }
    public static void task_01() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task_02() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void task_03() {
        boolean devideToTwo;
        for (int i = 0; i <= 17; i++) {
            devideToTwo = (i % 2) == 0;
            if (devideToTwo) System.out.println(i);
        }
    }
    public static void task_04() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task_05() {
        for (int year = 1904; year <= 2096; year++) {
            boolean check400s = (year % 400) == 0;
            boolean check100s = (year % 100) == 0;
            boolean check4s = (year % 4) == 0;
            if (check400s || (check4s && !check100s))
                System.out.println(year + "-й год является високосным.");
        }
    }
    public static void task_06() {
        int res;
        for (int i = 1; i <= 100; i++) {
            res = i * 7;
            System.out.println(res);
            if (res >= 98) break;
        }
    }
    public static void task_07() {
        int increment = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.println(increment);
            increment = increment * 2;
            if (increment > 512) break;
        }
    }
    public static void task_08() {
        int myMoney = 0;
        for (int i = 1; i <= 12; i++) {
            myMoney += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей",i,myMoney);
            System.out.println();
        }
    }
    public static void task_09() {
        double myMoney = 0;
        for (int i = 1; i <= 12; i++) {
            myMoney = myMoney*1.1f + 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей",i,myMoney);
            System.out.println();
        }
    }
    public static void task_10() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2*%d=%d", i, i * 2);
            System.out.println();
        }
    }
}