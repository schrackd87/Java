//Account Test

public class AccountTest

{

   static ArrayList<Account> accounts;

   public static void main(String[]arugs)
   {
   
      Account a1 = new Account(100);
      loadAccounts(); //read recird from file & populate list
      userDialog();//interact with the user thru menus
      saveAccounts(); //write the objects bact to the File
   
   }
   static void loadAccounts() throws FileNotFoundException
   {
      Scanner file = new Scanner(new FileInputStream("accountdata.text")); //crea
      accounts = new ArrayList<Account>(); //lazy interaction
      accounts.add(new Account (file.next(), file.nextDouble()));
      file.close();
   }

   static void userDialog()
   {//interact with user
   
   }

   static void saveAccounts() throws FileNotFoundException
   {
   //writes the account list to the file
   Scanner file = new Scanner(new FileOutputStream("accountdata.text"));
   for (Account a : accounts)
   file.println(a.getname(), a.getNumber, a.GetBalance());
   file.close();
   }
}
