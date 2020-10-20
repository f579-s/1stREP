public class IfElse
{
   public static void main(String[] args)
   {
        int i=76;
        char grade;

        if (i>= 90)
        {
            grade= 'A';
        } 
        else if (i>= 80) 
        {
            grade= 'B';
        } 

        else 
        {
            grade= 'C';
        }
     System.out.println("Grade is: " + grade);
   }
}
