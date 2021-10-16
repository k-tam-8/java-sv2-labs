package classstructuremethods;

public class Client {
    private String ClientName;
    private int ClientYear;
    private String ClientAddress;

    public String getName() {return "Neve: " + ClientName;}
    public String getYear() {return "Születési éve: " + ClientYear;}
    public String getAddress() {return "Címe: " + ClientAddress;}

    public String getAllData() {return ClientName + " nevű " + ClientYear + " születési évü " + ClientAddress + " című kliens.";}

    public void ChangeClientName(String newClientName) {ClientName = newClientName;}
    public void ChangeClientYear(Integer newClientYear) {ClientYear = newClientYear;}
    public void ChangeClientAddress(String newClientAddress) {ClientAddress = newClientAddress;}

    public void migrate(String address) {
        {ClientAddress = address;}
}
}
