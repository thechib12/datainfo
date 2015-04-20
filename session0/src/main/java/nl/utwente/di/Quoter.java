package nl.utwente.di;

public class Quoter {
	//testje
	public double getBookPrice(String in){
		if(in.equals("1")){ 
			return 10.0;
		}
		else if(in.equals("2")){
			return 45.0;
		}
		
		else if(in.equals("3")){
			return 20.0;
		}
		
		else if(in.equals("4")){
			return 35.0;
		}
		
		else if(in.equals("5")){
			return 50.0;
		}
		else {
			return 0.0;
		}
		
		
	}
}
