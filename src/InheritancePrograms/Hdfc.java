package InheritancePrograms;

class Bank{
    long AccountNum;
    double AccountBalance;
    String Name;
    String Address;
    
    Bank(){

    }
    Bank(String Name, long AccountNum, double AccountBalance, String Address){
        this.Name = Name;
        this.AccountNum = AccountNum;
        this.AccountBalance = AccountBalance;
        this.Address = Address;
    }
    public void checkbalance(){
        System.out.println("HI " + Name + " YOUR BANK ACCOUNT NUMBER = " + AccountNum +
         " AND YOUR BALANCE AMOUNT IS = " + AccountBalance );
    }
    public void accountdetails(){
        System.out.println("HI " + Name);
        System.out.println("YOUR BANK ACCOUNT NUMBER IS = " + AccountNum);
        System.out.println("YOUR ADDRESS IS = " + Address);
    }
}
    class Hdfc extends Bank{
        public static void main(String[] args) {
            Bank obj = new Bank("Gowtham", 78347343, 5000.00, "Nellore");
            obj.checkbalance();
            obj.accountdetails();
        }
    }
