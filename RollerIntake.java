public class RollerIntake {
    Motor motorForTheBall =new Motor();
    Motor motorForTurnOnTheMechanisemForCollecting=new Motor();
    BallSensor entranceSensor=new BallSensor();
    BallSensor exitSensor=new BallSensor();
    LimitSensor MechanisemClosed=new LimitSensor();
    LimitSensor MechanisemCollecting=new LimitSensor();
    public void mechanisemOut(){
        while(!MechanisemCollecting.atLimit()){
            motorForTurnOnTheMechanisemForCollecting.setPower(500);//מספיק כוח להפעיל את המכונה לאיסוף
        }
        motorForTurnOnTheMechanisemForCollecting.stop();
    }
    public void startTheCollectingUntilSensor1(){
        while(!entranceSensor.haveBall()){
            motorForTheBall.setPower(1000);//כוח מלא!
        }
    }
    public void startTheCollectingUntilSensor2(){
        while(!exitSensor.haveBall()){
            motorForTheBall.setPower(100);//כוח נמוך!
        }
        motorForTheBall.stop();
    }
    public void getBackTheMechanisem(){
        while(!MechanisemClosed.atLimit()){
            motorForTurnOnTheMechanisemForCollecting.setPower(500);//מספיק כוח להפעיל את המכונה לאיסוף!
        }
        motorForTurnOnTheMechanisemForCollecting.stop();
    }
    public void checkBallAtLimit(){
        if(exitSensor.getValue()>0.9){
            System.out.println("the ball at the end");
        }
    }
}
    

