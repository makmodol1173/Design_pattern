public class EcommercePlatform{
    public static void main(String[] args) {
        Payment payment = new Payment("200.00", "USD");
        System.out.println(payment.getAmount());
        System.out.println(payment.getCurrency());
    }
}
