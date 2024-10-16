class Calc
{
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
    public int multiply( int n1,int n2)
    {
        return n1*n2;
    }
}
public class testing 
{
    public static void main(String[] args) 
    {
        Calc c = new Calc();
        int result = c.divide(4, 2);
        
        if(result==2)
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test cases failed");
        }

    }
    
}
