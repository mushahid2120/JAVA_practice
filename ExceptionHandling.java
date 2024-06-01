import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Calculation c=new Calculation();
        c.setOperand1(40);
        c.setOperand2(1);
        try {
            System.out.println(c.divide());
            System.out.println(c.subtract());
        }catch (SubtractionException s){System.out.println(s.getMessage());}
            catch(DivisionException d){System.out.println(d.getMessage());}
    }
    static void f1(){
        Scanner sc = new Scanner(System.in);
        int N, s = 0;
        System.out.println("Enter the size of the Arrays ");
        try {
            N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                s = s + arr[i];
            }
            double average = (double) s / N;
            System.out.println("Average is " + average);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException i){System.out.println(i.getMessage());}
        System.out.println("This is outside of the exception");
    }
    static void f2(){
        try{
            System.out.print("A");
            int num=10/0;
            System.out.print("B");
        }
        catch(ArithmeticException ex){
            System.out.print("C");
        }
        catch(Exception ex) {
            System.out.print("D");
        }
        finally{
            System.out.print("E");
        }
    }
}
class Calculation{
    private int operand1,operand2;

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    int subtract() throws SubtractionException{
        if(operand1<operand2)
            throw new SubtractionException("Operand should be greater then operand 2");
        return operand1-operand2;
    }
    double divide() throws DivisionException{
        if(operand2==1)
                throw new DivisionException("Operand2 is not equal 1");
            return (double)operand1/operand2;
    }
}
class SubtractionException extends Exception{
    public SubtractionException(String s){
        super(s);
    }
}
class DivisionException extends Exception{
    public DivisionException(String s){
        super(s);
    }
}