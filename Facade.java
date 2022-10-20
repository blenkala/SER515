import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void beginFacade() throws IOException
	{  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Username");
	   String uname=sc.next();
	   System.out.println("Enter password");
	   String password=sc.next();
	   boolean result=login(uname,password);
		System.out.println(uname+" "+password);
	}

	public boolean login(String uname,String password) throws IOException {
     loginForValidation obj=new loginForValidation();
	 boolean res=obj.validate(uname,password);
		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
