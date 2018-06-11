
public class gettersAndsetters {
	
	private String data;
	
	public void setData(String parameter) {
		data = parameter;
	}
	
	public String getData() {
		return data;
	}
	
	public void showHowifitworks(String parameter) {
		System.out.printf("The Data is: %s", parameter);
	}

}
