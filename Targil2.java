import java.util.Scanner;
public class Targil2 {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        double[]arr=new double[1000];
        int j=0;
        double sum=0;
        int count=0;
        double sumMinusMinAndMax;
        double average;
        for(int i=0;i<1000;i++){
            arr[i]=Math.random()*1000;
            sum+=arr[i];
        }
        double max=arr[0];
        for(int i=1;i<1000;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the max is"+max);
        double min=arr[0];
        for(int i=1 ;i<1000; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the min is"+min);
        average=sum/1000;
        System.out.println("the average is"+ average);
        sumMinusMinAndMax=sum-(min+max);
        System.out.println("the average without min and max"+ sumMinusMinAndMax/998);
        for(int i=0;i<1000;i++){
            if(arr[i]>1.5*average || arr[i]<0.25*average){
                count++;
            }
        }
        System.out.println("count of harigim");
        System.out.println(count);
        double[]newArr=new double[1000-count];
        for(int i=0;i<1000;i++){
    
            if(!(arr[i]>1.5*average || arr[i]<0.25*average)){
                newArr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}