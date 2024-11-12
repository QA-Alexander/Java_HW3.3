public class CreditPaymentService {
    public int calculate(int sum, int month, double percent) {
        double monthPercent = percent / 1200;
        double annuity = (monthPercent * Math.pow(1 + monthPercent, month)) / (Math.pow(1 + monthPercent, month) - 1);
        double result = sum * annuity;
        return (int) result;
    }
}
