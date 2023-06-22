public class CustmoerTest2 {
    public static void main(String[ ] args) {
        VIPCustomer customerkim = new VIPCustomer();
        customerkim.setCustomerID(10020);
        customerkim.setCustomerName("김유신");
        customerkim.bonusPoint = 10000;
        System.out.println(customerkim.showCustomerInfo());
    }
}
