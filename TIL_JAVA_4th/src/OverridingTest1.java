public class OverridingTest1 {
    public static void main(String[ ] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        VIPCustomer customerkim = new VIPCustomer(10020, "김유신", 12345);
        customerkim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName() + "님이 지불해야할 금액은" + customerLee.calcPrice(price) + "원입니다.");
        System.out.println(customerkim.getCustomerName() + "님이 지불해야할 금액은" + customerkim.calcPrice(price) + "원입니다.");
    }
}
