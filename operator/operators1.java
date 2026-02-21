import java.util.Scanner;
public class operators1 {
    public static void main(){
    Scanner sc = new Scanner(System.in);
    int theoryMarks = sc.nextInt();
    int practicalMarks = sc.nextInt();
    double average = (theoryMarks + practicalMarks / 2);
    if(theoryMarks >=50 && practicalMarks >=50 && average>60){
        System.out.println("Result = Pass");
    }
    
    else{
        System.out.println("Result = Fail");
    }
}
}