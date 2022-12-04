import java.security.SecureRandom;
public class Q1{
    public static void main( String args[] ){
        ListofNumbers m = new ListofNumbers( );
        m.max();
        m.output();
    } 
}
class ListofNumbers {
    Number[] arr=new Number[10];
    SecureRandom randomnumbers=new SecureRandom();
    public ListofNumbers(){
        for(int i=0;i<arr.length;i++){
           arr[i]=new Number(1+randomnumbers.nextInt(10));
        }
   }
    public void max(){
        int maximum=arr[0].getNum();
        for(int i=1;i<arr.length;i++){
            if(arr[i].getNum() >maximum){
                maximum=arr[i].getNum();
            }
        }
        System.out.println("Maximum:"+maximum);
    }
    public void output(){
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i].getNum());
        }
    }
}
class Number {
    private int num;
    public Number(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
}