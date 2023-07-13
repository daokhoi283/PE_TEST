public class SpecCar extends Car{
    private int type;
    public SpecCar(){
        super();
    }
    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }
    public void setData(){
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }
    public int getValue(){
        if(type < 7){
            return super.getPrice() + 10;
        }
        return super.getPrice() + 15;
    }
    @Override
    public String toString() {
        return super.getMaker() + ", "+super.getPrice()+", "+this.type ;
    }
    
}
