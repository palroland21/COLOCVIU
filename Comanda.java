public class Comanda {
    private int IDComanda;
    private static int idAdder =1;
    private Client client;
    private int pretPlatitTotal;
    private Bauturi bauturi;
    private Pizza pizza;
    private Desert desert;
    private String status;
    private int price = 0;


    public Comanda(Client client, Bauturi bauturi, Pizza pizza, Desert desert, String status) {
        client.addComanda();
        client.addTotalPlata(bauturi.getPrice());
        client.addTotalPlata(pizza.getPrice());
        client.addTotalPlata(desert.getPrice());
        this.IDComanda = idAdder++;
        this.client = client;
        this.bauturi = bauturi;
        this.pizza = pizza;
        this.desert = desert;
        this.status = status;
        this.price += pizza.getPrice();
        this.price += desert.getPrice();
        this.price += bauturi.getPrice();
    }

    public Comanda(Client client, Pizza pizza, String status) {
        client.addComanda();
        client.addTotalPlata(pizza.getPrice());
        this.IDComanda = idAdder++;
        this.client = client;
        this.pizza = pizza;
        this.status = status;
        this.price += pizza.getPrice();
    }

    public Comanda(Client client, Bauturi bauturi, String status) {
        client.addComanda();
        client.addTotalPlata(bauturi.getPrice());
        this.IDComanda = idAdder++;
        this.client = client;
        this.bauturi = bauturi;
        this.status = status;
        this.price += bauturi.getPrice();
    }

    public Comanda(Client client, Desert desert, String status) {
        client.addComanda();
        client.addTotalPlata(desert.getPrice());
        this.IDComanda = idAdder++;
        this.client = client;
        this.desert = desert;
        this.status = status;
        this.price += desert.getPrice();
    }

    public int getIDComanda() {
        return IDComanda;
    }

    public String getStatus(){
        return status;
    }

    public String getClientName(){
        return client.getNumeClient();
    }

    public int getIdAdder(){
        return idAdder;
    }

    public int getPrice(){
        return price;
    }

    public String getNumeClient(){
        return client.getNumeClient();
    }

}
