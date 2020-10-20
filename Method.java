public class Method
{
    public static int Min(int a, int b)
    {
        if(a<b)
           return a;
         else 
           return b;
     }
   public static void main(String[] args)
    {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Min(a, b);
       System.out.println("Minimum value is " + c);
     }
}
