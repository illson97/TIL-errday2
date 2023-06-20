package cooperation2;

public class Bus {
	int busNumber;            
	int passengerCount;       
	int money;                
	    
	public Bus(int busNumebr)  
	{   
		 this.busNumber = busNumebr;
	}
	
	public void take(int money) 
	{  
		 this.money += money;   
		 passengerCount++;     
	}
	    
	public void showInfo() {  
		 System.out.println("Bus Number is" + busNumber + "and passengers are" + passengerCount +"and" + money + "last");
	}

}
