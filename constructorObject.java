
public class constructorObject {
	private String data;
	
	public constructorObject() {}
	
	public constructorObject(String constructordata) {
		data = constructordata;
	}
	
	public void setData(String information) {
		data=information;
	}
	
	public String getData() {
		return data;
	}
	
	public void showData() {
		System.out.printf("The data in the constructor is: %s\n", getData());
	}

}
