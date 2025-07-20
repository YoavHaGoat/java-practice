import java.util.Scanner;
public class homework3 {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        GameController controller=new GameController();
        controller.pressButton(0);
        controller.pressButton(1);
        int velocityMotor1=20;
        int velocityMotor2=15;
        ServoMotor motor1= new ServoMotor(100, 120, "motor1", velocityMotor1);
        ServoMotor motor2= new ServoMotor(70, 85, "motor2", velocityMotor2);
        for(int i=1;i<=50;i++){
            if(controller.isPressed(0)){
                motor1.moveToAngle(0, velocityMotor1);
                motor2.moveToAngle(180, velocityMotor2);
            }
            if(controller.isPressed(1)){
                motor2.moveToAngle(45, velocityMotor2);
            }
            if(controller.isPressed(2)){
                motor1.moveToAngle(135, velocityMotor1);
            }
            if(controller.isPressed(3)){
                motor1.moveToAngle(90, velocityMotor1);
                motor2.moveToAngle(90, velocityMotor2);
            }
            motor1.periodicUpdate();
            motor2.periodicUpdate();
            System.out.println("cycle number "+ i);
            System.out.println("Does button1 pressed? "+ controller.isPressed(0));
            System.out.println("Does button2 pressed? "+ controller.isPressed(1));
            System.out.println("Does button3 pressed? "+ controller.isPressed(2));
            System.out.println("Does button4 pressed? "+ controller.isPressed(3));
            System.out.println("current angle of motor 1 is "+ motor1.getAngle());
            System.out.println("current angle of motor 2 is "+ motor2.getAngle());

        }

        
    }
}