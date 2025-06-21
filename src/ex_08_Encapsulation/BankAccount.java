//package ex_08_Encapsulation;
//
//public class BankAccount {
//    private String accountNumber;
//    private String accountHolderName;
//    private double balance=0;
//
//    BankAccount()
//    {
//        System.out.println("Your default account is created");
//    }
//
//    BankAccount(String accountNumber, String accountHolderName)
//    {
//        System.out.println("your account has been created successfully");
//    }
//    public String getAccountNumber() {
//         return accountNumber;
//    }
//    public String getAccountHolderName( )
//    {
//        return accountHolderName;
//    }
//    public double getBalance()
//    {
//        return 0.0;
//    }
//    public String setAccountNumber(String accountNumber)
//    {
//        this.accountNumber= accountNumber;
//        if (accountNumber==null || accountNumber.trim().isEmpty()){
//            System.out.println("Don't set the value");
//        }
//        else{
//            System.out.println("Set the values");
//        }
//    }
//    public String setAccountHolderName(String Name){
//        this.accountHolderName=Name;
//        if (Name==null || Name.trim().isEmpty())
//        {
//            System.out.println("Account Holder Name is incorrect");
//        }
//    }
//    public double setBalance(double balance)
//    {
//        this.balance=balance;
//        if (balance<0)
//        {
//            System.out.println("balance should not be negetive");
//            return 0.0;
//        }
//    }
//    void deposit(double amount)
//
////    If amount is positive, add it to the balance.
////    If amount is not positive, print an error.
////    Print the new balance.
////    void withdraw(double amount):
////    If amount is positive AND less than or equal to the current balance, subtract it from the balance.
////    If amount is not positive or exceeds the balance, print an error message ("Insufficient funds" or "Invalid amount").
////    Print the new balance.
////    void displayAccountDetails(): Prints all account details (number, holder, balance) nicely.
////    main Method (in BankAccount.java):
////
////    Create two BankAccount objects:
////    One using the parameterized constructor (e.g., new BankAccount("12345", "Alice Smith")).
////    One using the default constructor. Manually set its details using the setter methods.
////    Interact with both accounts:
////    Call displayAccountDetails() for both.
////    Perform a deposit() and withdraw() operation on each.
////    Test your validation: Try to set an invalid name, an empty account number, or withdraw more than the balance. Observe your error messages.
////    Call displayAccountDetails() again after interactions to see updated states.
//
//}
