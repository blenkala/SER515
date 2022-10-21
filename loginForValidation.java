import java.io.*;
public class loginForValidation {
    public boolean validate(String sellerOrBuyer,String uname, String password) throws IOException {
        BufferedReader br;
        File file;
        if(sellerOrBuyer.equals("0")) {
             file = new File(
                    "BuyerInfo.txt");
        }
        else{
             file = new File(
                    "SellerInfo.txt");
        }
        br = new BufferedReader(new FileReader(file));
        String val;
        while ((val = br.readLine()) != null){
            String[] arrOfStr = val.split(":");
            String dbUsername= arrOfStr[0];
            String dbPassword=arrOfStr[1];
            if(dbUsername.equals(uname) && dbPassword.equals(password))
                 return true;
    }
        return false;
}}
