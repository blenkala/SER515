import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	   System.out.println("FACADE initialised successfully!!");
	   System.out.println("Hii! Do you want to login as a Buyer or Seller? Enter 0 for buyer and 1 for seller.");
	   String sellerOrBuyer= sc.next();
	   System.out.println("Enter the Username");
	   String uname=sc.next();
	   System.out.println("Enter the password");
	   String password=sc.next();
	   boolean result=login(sellerOrBuyer,uname,password);
	   if(result == true){
		   System.out.print("You are successfully logged in as a ");
		   if(sellerOrBuyer.equals("0"))
			   System.out.println("BUYER!!!");
		   else
			   System.out.println("SELLER!!!");
		   String selectedMenu="0";
		   while(!selectedMenu.equals("E")) {
			   System.out.println("What do you want to see: \nEnter 1 to display ProductMenu of Meat: \nEnter 2 to display ProductMenu of Produce: \nEnter 3 to purchase products: \nEnter 4 to add products to Menu: \nEnter E to EXIT");
			   selectedMenu = sc.next();
			   if (selectedMenu.equals("1") || selectedMenu.equals("2")) {
				   ProductIterator pi = new ProductIterator();
				   pi.iterateThroughMenu(selectedMenu);
			   } else if (selectedMenu.equals("4")) {
				   System.out.println("Enter the type: 1 for Meat and 2 for Produce ");
				   String ptype = sc.next();
				   System.out.println("Enter the product name:");
				   String pname = sc.next();
				   Product pr = new Product();
				   pr.addProduct(ptype, pname);
			   }
		   }
	   }
	   else
		   System.out.println("Authentication failed!!");
	}

	public boolean login(String sellerOrBuyer,String uname,String password) throws IOException {
     loginForValidation obj=new loginForValidation();
	 boolean res=obj.validate(sellerOrBuyer,uname,password);
		return res;
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
