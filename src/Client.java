public class Client extends Person {
    private int clientNumber;
    private String adress;
    private Account account;

    //getters and setters
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    //constructor
    public Client(){

    }
}
