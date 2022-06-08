public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName (String name){
        this.name = name;
        System.out.println(name);
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
        System.out.println(email);
    }

    public String getEmail(){
        return email;
    }

    public void setId (int id){
        if (id < 10) {
            System.out.println(this.id = 11);}
        else {
            System.out.println(id);}
    }

    public int getId() {
        return id;
    }

    public void setAccountType(String accountType) {
        if (accountType == ("s")){
            System.out.println("Saving Account");}
        else if (accountType == ("c")){
            System.out.println("Checking Account");}
    }

    public String getAccountType(){
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount name = new BankAccount();
        BankAccount email = new BankAccount();
        BankAccount id = new BankAccount();
        BankAccount accountType = new BankAccount();

        name.setName("A");
        email.setEmail("arif@arif.com");
        id.setId(12);
        accountType.setAccountType("c");

        name.getName();
        email.getEmail();
        id.getId();
        accountType.getAccountType();
    }
}
