package designexample;

public class Factorydesignpattern {
	
	Car getModel(String model_name) {
	
	if(model_name.equals("Audi"))
		
		return new Audi();
	
	else if(model_name.equals("Benz"))
		
		return new Benz();
	
	else
		
		return new Nano();

}
}
