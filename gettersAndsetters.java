
public class gettersAndsetters {
	
	private String data;// eto yung string o yung variable na lalagyan ng value
	//String parameter ang input value
	public void setData(String parameter) {
		data = parameter;
	}
	
	public String getData() {
		return data; // return data yung output.
	}
	
	public void showHowifitworks(String parameter) {
		System.out.printf("The Data is: %s", parameter);
	}

}
