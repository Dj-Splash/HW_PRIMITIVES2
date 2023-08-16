public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс на счету
        int addBalance = 1999; //пополнение баланса
        int bonus; //бонус

        if (addBalance > 1000) {
            bonus = addBalance / 100;
        } else {
            bonus = 0;
        }
        int d = balance + addBalance + bonus; //сумма баланса, пополнения и бонусов
        System.out.println("Ваш баланс составляет " + d + " рублей, из которых " + bonus + " бонусов");
    }
}