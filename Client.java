public class Client {
    private String numeClient;
    private int nrTotalComezi;
    private int totalPlata = 0;

    public Client(String numeClient, int nrTotalComezi) {
        this.numeClient = numeClient;
        this.nrTotalComezi = nrTotalComezi;
    }


    public void addComanda(){
        nrTotalComezi++;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void addTotalPlata(int plata){
        totalPlata += plata;
    }

    public int getTotalPlata() {
        return totalPlata;
    }

}
