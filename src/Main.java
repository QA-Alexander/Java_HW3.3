public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int oneYear = service.calculate(1000000, 12, 9.99);
        int twoYears = service.calculate(1000000, 24, 9.99);
        int threeYears = service.calculate(1000000, 36, 9.99);
        System.out.println("Ежемесечная сумма платежа при сроке кредитования 1 год:" + oneYear);
        System.out.println("Ежемесечная сумма платежа при сроке кредитования 2 года:" + twoYears);
        System.out.println("Ежемесечная сумма платежа при сроке кредитования 3 года:" + threeYears);
    }
}
