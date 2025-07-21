import java.util.Scanner;
public class Battery {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("put in batteryVolt");
    double currentVolt=reader.nextDouble();
    while(currentVolt < 12.6){
        int count=0;
        int i=0;
        double increasedVolt=0.06+0.05*(13-currentVolt);
        while(currentVolt < 12.6){
            currentVolt=currentVolt + increasedVolt;
            count++;
            if(count/3 ==i){
                System.out.println("the current batteryVolt");
                System.out.println(currentVolt);
                i++;
            }

        }
        System.out.println("number of sacles");
        System.out.println(count);
        System.out.println("put in batteryVolt");
        currentVolt=reader.nextDouble();
    }



    
}   
}
