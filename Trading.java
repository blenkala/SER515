import java.io.*;
import java.util.Scanner;

public class Trading {

    public void getBiddingDetails(String bidval) throws IOException {
		System.out.println("VISITOR initialized successfully!!");
		File file = new File(
				"UserProduct.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String val;
		System.out.print("People who are bidding for the same product are:");
		int count=0;
		while ((val = br.readLine()) != null){
			String arrOfStr[]=val.split(":");
			String dbProdVal= arrOfStr[1];
			if(dbProdVal.equals(bidval)){
				count++;
				System.out.print(arrOfStr[0]+",");
		}}
		System.out.println();
		System.out.println("The number of people who are bidding for the product is:" + count);
	}
	public void accept(NodeVisitor visitor) {

	}

}
