package cooperation2;

public class TakeTrans {
	public static void main(String[] args) {
		// �� ���� �л��� ����
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  Student studentEdward = new Student("Edward", 30000);
		  
		  
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     
		  studentJames.showInfo();          
		  bus100.showInfo();               
		
		  Subway subwayGreen = new Subway("line2");  
		  studentTomas.takeSubway(subwayGreen);  
		  studentTomas.showInfo();               
		  subwayGreen.showInfo();
		  

		  Taxi taxi = new Taxi("kakao");
		  studentEdward.takeTaxi(taxi);  
		  studentEdward.showInfo(); 
		  taxi.showInfo();
	}
}
