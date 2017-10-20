public class Account {
    private Client owner;
    private Balence balence;
    private int accountNumber;
    private String password;
    private float dinarsBalence;
    private float deviseBalence;

    //getters and setters
    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Balence getBalence() {
        return balence;
    }

    public void setBalence(Balence balence) {
        this.balence = balence;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getDinarsBalence() {
        return dinarsBalence;
    }

    public void setDinarsBalence(float dinarsBalence) {
        this.dinarsBalence = dinarsBalence;
    }

    public float getDeviseBalence() {
        return deviseBalence;
    }

    public void setDeviseBalence(float deviseBalence) {
        this.deviseBalence = deviseBalence;
    }

    //constructor
    public Account(){

    }
}
