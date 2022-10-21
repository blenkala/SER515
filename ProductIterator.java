import java.io.*;
import java.util.Scanner;

public class ProductIterator {

	private ClassProductList classProductList;

	public void iterateThroughMenu(String selectedMenu) throws  IOException {
		System.out.println("ITERATOR initialized successfully!!");
		if(selectedMenu.equals("1")){
		    MeatProductMenu mp=new MeatProductMenu();
		    mp.showMenu();
		}
		else if(selectedMenu.equals("2")){
			ProduceProductMenu pp=new ProduceProductMenu();
			pp.showMenu();
		}
	}

	public boolean hasNext(String uname) throws FileNotFoundException {
		File file = new File(
				"UserProduct.txt");
               Scanner scm=new Scanner(file);
		String val;
		System.out.print("Your associated items are:");
		while (scm.hasNextLine()){
			val = scm.nextLine();
			String arrOfStr[]=val.split(":");
			String dbUserN= arrOfStr[0];
			if(dbUserN.equals(uname))
				System.out.print(arrOfStr[1]+" ");
		}
		System.out.println();
		return true;
	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
