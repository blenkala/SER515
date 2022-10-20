import java.io.*;
public class loginForValidation {
    public boolean validate(String uname, String password) throws IOException {
        File file = new File(
                "/Users/bhavanilenkala/SER515/composition_diagram/SER515-xyz/Database/BuyerInfo.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
            String dbUsername=st.substring(0,4);
            String dbPassword=st.substring(5);
            if(dbUsername.equals(uname) && dbPassword.equals(password))
                 return true;
    }
        return false;
}}
