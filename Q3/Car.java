public class Car {
    private String maker;
    private int rate;
    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }
    public Car(){
        
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
}
