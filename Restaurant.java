public abstract class Restaurant {
    private String numePreparat;
    private int pretPreparat;

    public Restaurant(String numePreparat, int pretPreparat) {
        this.numePreparat = numePreparat;
        this.pretPreparat = pretPreparat;
    }

    public String getNume(){
        return numePreparat;
    }

    public int getPrice(){
        return pretPreparat;
    }
}
