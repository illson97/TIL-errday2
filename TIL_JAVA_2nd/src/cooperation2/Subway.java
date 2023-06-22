package cooperation2;

public class Subway {
	 public String lineNumber;           
	 public int passengerCount;          
	 public int money;                  
	    
	 public Subway(String lineNumber) {   
		  this.lineNumber = lineNumber;   
	 }
	    
	 public void take(int money) {         
		  this.money += money;              
		  passengerCount++;                 
	 } 
	    
	 public void showInfo()              
	 {
		  System.out.println(lineNumber + "passgers are" + passengerCount +"money " + money + "last");
	 }

}
