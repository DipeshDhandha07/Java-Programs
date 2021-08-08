class Exception
{
        public static void main(String[] args)
      {
            int a=4; int b=0; int c;
            try   // Is used to write any operation
            {
                  c=a/b;
                  System.out.println("C="+c);
                  System.out.println("This will be skipped if exception occurs");
            }
            catch(ArithmeticException ae)
            {
                  System.out.println("ArithmeticException occurs");
                  System.out.println("Exception is:" +ae);           
            }
            System.out.println("Out of try catch block");
      }      
}
