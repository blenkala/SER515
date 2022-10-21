**REQUIRED**
 Please add relevant text database files in the relative path with other java files(i.e In the same location of java files).

 **COMPILATION PROCESS**
MainTrading.java is the java file containing MAIN method

**DESIGN PATTERNS COVERED**

STEP 1: Authentication(Design Pattern: FACADE )

-Ask the user whether it is a Seller or buyer.User selects 0 for Buyer and 1 for seller
-Get username and password
-Check for credentials in buyer and seller text files and perform validation
-Facade design pattern is used to implement the entire authentication

STEP 2: Printing Menu

   Menu option 1: Displays the list of all available MEAT options from productInfo.txt file.
   (BRIDGE && FACTORY)
   Menu option 2: Displays the list of all available PRODUCE options from productInfo.txt file.
   (BRIDGE && FACTORY)
   Menu option 3: Displays all the items attached to that respective user from UserProduct.txt file.(ITERATOR)
   Menu option 4: Allows the user to input type and product name and adds it to the menu i.e productInfo.txt file.(FACADE addMenu)
   Menu option 5: Asks for product name as bid input and gets all the users who are bidding/associated for/with it and displays it along with the count.(VISITOR)

   


