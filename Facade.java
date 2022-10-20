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
	   System.out.println("Are you a seller or buyer?Enter 0 for Buyer and 1 for seller");
	   String sellerOrBuyer= sc.next();
	   System.out.println("Enter Username");
	   String uname=sc.next();
	   System.out.println("Enter password");
	   String password=sc.next();
	   boolean result=login(sellerOrBuyer,uname,password);
	   if(result == true){
		   System.out.println("Authentication successful!!");
		   System.out.println("What do you want to see: \n Enter 1 for MeatProductMenu: \n  Enter 2 for ProduceProductMenu: \n Enter 3 to add products");
		   String selectedMenu = sc.next();
		   if(selectedMenu.equals("1")) {
			   MeatProductMenu mp=new MeatProductMenu();
		       mp.showMenu();
		   }
		   else if(selectedMenu.equals("2")){
			   ProduceProductMenu pp=new ProduceProductMenu();
			   pp.showMenu();
		   }
		   else if(selectedMenu.equals("3")){
			   System.out.println("Enter the type: 1 for Meat and 2 for Produce ");
			   String ptype=sc.next();
			   System.out.println("Enter the product name:");
               String pname=sc.next();
			   Product pr=new Product();
			   pr.addProduct(ptype,pname);
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
