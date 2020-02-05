public class BankAccount extends Asset {
    private String accountNumber;
    
    public BankAccount(String name) {
        super(name);
        this.accountNumber = name + "001";
    }
    
    public void makeTransaction(Sterling change) {
        super.setValue(super.getValue().addValue(change));
    }
}
