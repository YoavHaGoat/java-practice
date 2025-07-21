import java.util.Scanner;
public class FRC {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("put in the robot weight");
        double weight=reader.nextDouble();
        System.out.println("put in the robot velocity");
        double vMax=reader.nextDouble();
        System.out.println("put in the robot acceleration");
        double aMax=reader.nextDouble();
        System.out.println("put in the robot name");
        String name=reader.next();
        double timeToVmax= vMax/aMax;
        System.out.println("timeToVmax="+timeToVmax);
        double dToVmax=Math.pow(timeToVmax,2)*aMax*0.5;
        System.out.println("dToVmax="+dToVmax);
        double dToVzero=dToVmax;
        double dAtVmax=4-2*dToVzero;
        double timeAtVmax=dAtVmax/vMax;
        double timeToVzero=timeToVmax;
        double timeAt4Meter=timeToVmax+timeAtVmax+timeToVzero;
        System.out.println("time to stop at exactly 4 meter="+ timeAt4Meter);
        double dAfterAcceleration=12-dToVmax;
        double timeOver12Meters=timeToVmax+(dAfterAcceleration/vMax);
        System.out.println("time to get over 12 meters at vMax="+ timeOver12Meters);
        System.out.print("Kinetic Energy="+ 0.5*weight*Math.pow(vMax, 2));
        double aAtAccident=(0.5*Math.pow(vMax, 2))/0.7;
        System.out.println("acceleration at the accident"+ aAtAccident);
        double timeToStopAtAccident= vMax/aAtAccident;
        System.out.println("time to stop at the accident"+ timeToStopAtAccident);
    }


    
}

