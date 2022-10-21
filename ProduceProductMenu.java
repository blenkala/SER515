import java.io.*;
public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		System.out.println("BRIDGE initialized successfully!!");
		File file = new File(
				"ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String val;
		System.out.println("The ProduceProductMenu is:");
		while ((val = br.readLine()) != null){
			String[] arrOfStr = val.split(":");
			String dbProduceName= arrOfStr[0];
			String dbProduceValue=arrOfStr[1];
			if(dbProduceName.equals("Produce"))
				System.out.println("Produce:" + dbProduceValue);
		}
		System.out.println("FACTORY initialized successfully!!");
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
