import java.util.Scanner;

public class MainClass {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello Java! From Main class."); 									// from the main class
		
		System.out.println(" ");
		System.out.println("----- Calling Object method -----");
		System.out.println(" ");
		
		methodObjectOne firstObject = new methodObjectOne(); 									// object declaration
		firstObject.callObjectmethod();						 									// calling the method from another class
		
		System.out.println(" ");
		System.out.println("----- With parameter -----");
		System.out.println(" ");
		
		System.out.print("Enter parameter here: ");
		String parameter = input.nextLine();													//inputing data set to parameter
		withParametersObjectTwo parameteredObject = new withParametersObjectTwo(); 				//object with parameter
		parameteredObject.methodWithParameter(parameter);										//calling the object includes the parameter
		
		System.out.println(" ");
		System.out.println("----- gettersAndsetters -----");
		System.out.println(" ");
		
		System.out.print("Enter data here: ");											
		String param = input.nextLine();														//input data being set and get
		gettersAndsetters Object = new gettersAndsetters();										//Object
		Object.setData(param);																	//setting the data(into the parameter)
		Object.showHowifitworks(Object.getData());												//getting the data now with method showing it
		
		System.out.println(" ");
		System.out.println("----- Constructors -----");
		System.out.println(" ");
		
		System.out.print("Enter data to show how constructor works: ");
		String constructeddata = input.nextLine();												//input data 
		constructorObject ClassObjectwithConstructor = new constructorObject(constructeddata);	//Object declaration with constructed parameter
		ClassObjectwithConstructor.showData();
		
		System.out.println(" ");
		System.out.println("----- Inheritance -----");
		System.out.println(" ");
		
		inheritanceObject inheritClass = new inheritanceObject();								// Object for inheritance
		inheritClass.methodBeingInherited();													//method from the extended/inherited class
		
		System.out.println(" ");
		System.out.println("----- Polymorphism -----");
		System.out.println(" ");
		
		polymorphSuperClass objectOne = new polymorphSubClassOne();								//Object superclass polymorphing subclass
		polymorphSuperClass objectTwo = new polymorphSubClassTwo();								//Object superclass polymorphing subclass
		objectOne.polymorphMethodfromSuperClass();												//polymorphed method from superclass executed in subclass
		objectTwo.polymorphMethodfromSuperClass();												//polymorphed method from superclass executed in subclass
	}

}
