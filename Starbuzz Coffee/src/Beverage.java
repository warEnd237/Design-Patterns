public abstract class Beverage{
    private String description = "Unknown Beverage";
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;

    public Beverage(String description){
        this.description = description;
    }

    public Beverage(){
    }

    public String getDescription(){ return description; }
    public void setDescription(String description){ this.description = description; }
    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){ return this.size; }
    public abstract double cost();
}
