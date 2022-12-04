import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        ScoreBook s1 = new ScoreBook( "Poly", 4 );
        ScoreBook s2 = new ScoreBook( "Barbar", 5 );
        s1.average();
        System.out.println(s1);
        s2.average();
        System.out.println(s2);
    }
}
class ScoreBook{ 
    private String name;
    private int num;
    private int avg;
    public ScoreBook(String name,int num){   
      this.name=name;
      this.num=num;
    }
    public void average(){
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.printf("Input %d scores:",num);
        for(int i=0;i<num;i++){
            sum+=input.nextInt();
        }
        avg=sum/num;
    }
    public String toString(){
        return "Name:"+name+" "+"Average:"+avg;
    }
}
