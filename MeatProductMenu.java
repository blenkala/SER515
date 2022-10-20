import java.io.*;
public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		File file = new File(
					"/Users/bhavanilenkala/SER515/composition_diagram/SER515-xyz/Database/ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String val;
		System.out.println("The MeatProductMenu is:");
		while ((val = br.readLine()) != null){
			String[] arrOfStr = val.split(":");
			String dbMeatName= arrOfStr[0];
			String dbMeatValue=arrOfStr[1];
			if(dbMeatName.equals("Meat"))
				System.out.println("Meat:" + dbMeatValue);
	}}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
