public class Main {
    public static void main(String[] args) {

        task_01();
        task_02();
        task_03();
        task_04();
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
}