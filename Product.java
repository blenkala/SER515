import java.io.*;
public class Product {
         public void addProduct(String pType,String pName) throws IOException {
             File f1 = new File("ProductInfo.txt");
             if(!f1.exists()) {
                 f1.createNewFile();
             }

             FileWriter fileWritter = new FileWriter(f1.getName(),true);
             BufferedWriter bw = new BufferedWriter(fileWritter);

             if(pType.equals("1"))
             bw.write("\n"+"Meat"+":"+pName);
             else
             bw.write("\n"+"Produce"+":"+pName);
             bw.close();
             System.out.println("Done");
         }
}
