class Continue
{
    public static void main(String[] args)
    {
      System.out.println("Continue Statement:");
      for(int i=1; i<=10; i++)
       {
        if(i==5)
        {     
          continue; //It will skip the condition and continue the statement
        } 
        System.out.println(i);
       }
    }
}