public class ServoMotor {
    private double currentAngle;
    private double targetAngle;
    private String motorName;
    private double velocity;
    public ServoMotor(String motorName){
        this.currentAngle=90;
        this.targetAngle=90;
        this.motorName=motorName;
        this.velocity=0;
    }
    public ServoMotor(double currentAngle, double targetAngle, String motorName, double velocity){
        this.currentAngle=currentAngle;
        this.targetAngle=targetAngle;
        this.motorName=motorName;
        this.velocity=velocity;
    }
    public double getAngle(){
        return currentAngle;
    }
    public void moveToAngle(double targetAngle, double velocity){
        this.targetAngle=targetAngle;
        this.velocity=velocity;
    }
    public boolean isAtTarget(){
        return currentAngle==targetAngle;
    }
    public void periodicUpdate(){
        this.currentAngle=currentAngle+velocity*0.1;
    }
    public void getMotorName(){
        System.out.println(motorName);
    }
}