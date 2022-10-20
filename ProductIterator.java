import java.io.IOException;

public class ProductIterator {

	private ClassProductList classProductList;

	public void iterateThroughMenu(String selectedMenu) throws IOException {
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

	public boolean hasNext() {

		return false;
	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
