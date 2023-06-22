public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer()
    {
        initCustomer();
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이고, 보유하신 포인트는" + bonusPoint + "입니다.";
    }

//    public String showVIPInfo() {
//        return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
//    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
