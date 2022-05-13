package designexample;

public class Coderunner {

	public static void main(String[] args) {
		
		
		Factorydesignpattern oDesignpatternrun  = new Factorydesignpattern();
		
		Car oCar = oDesignpatternrun.getModel("Audi");
		
		oCar.special();
		

	}

}
