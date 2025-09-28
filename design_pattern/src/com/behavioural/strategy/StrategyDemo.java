package behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.checkout(1200);

        context.setPaymentStrategy(new UpiPayment());
        context.checkout(800);
    }
}
