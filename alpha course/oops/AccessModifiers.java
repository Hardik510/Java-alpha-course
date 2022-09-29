package oops;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "hardikChopra";
        // myAcc.password = "kjrbv"; // shows error coz password is private
        myAcc.setPassword("hbrivbriejvc ");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd; // password can be accessed or modified within the class
    }
}