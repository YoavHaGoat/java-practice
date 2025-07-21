public class BaseSensor {
    public boolean callibration;
    public void setCallibration(){
        callibration=true;
        System.out.println("doing callibration");
    }

    public double getValue(){
        return Math.random();
    }

    public void restart(){
        System.out.println("doing restart");
    }
    

}