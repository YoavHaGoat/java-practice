public class Motor {
    public double power;
    public Motor(){
        super();
    }
    public void stop(){
        this.power=0;
    }
    public void setPower(double power){
        this.power=power;
    }
}