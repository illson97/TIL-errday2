package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = 201803120001L;
		order.customerId = "abc123";
		order.orderDate = "2018-03-12"; 
		order.customerName = "honggilsoon";
		order.productId = "PD345-12";
		order.shippingAddress = "seoul";
		
		System.out.println(order.orderId);
		System.out.println(order.customerId);
		System.out.println(order.orderDate);
		System.out.println(order.customerName);
		System.out.println(order.productId);
		System.out.println(order.shippingAddress);

	}

}
