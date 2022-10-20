import java.io.*;
public class Product {
         public void addProduct(String pType,String pName) throws IOException {
             File f1 = new File("/Users/bhavanilenkala/SER515/composition_diagram/SER515-xyz/Database/ProductInfo.txt");
             if(!f1.exists()) {
                 f1.createNewFile();
             }

             FileWriter fileWritter = new FileWriter(f1.getName(),true);
             BufferedWriter bw = new BufferedWriter(fileWritter);
             bw.write(pType+":"+pName);
             bw.close();
             System.out.println("Done");
         }
}
