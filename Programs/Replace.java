class Main1 {
    public static void main(String[] args) 
    {        
        String numArray[] = { "one", "two", "three", "four", "five" };
        System.out.println("String Array elements displayed using for loop:");
        // for loop to iterate over the string array
        for (int i = 0; i < numArray.length; i++)
        {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("\n");
        System.out.println("String Array elements displayed using enhanced for loop:");
        for (String val : numArray)
        {
            System.out.print(val + " ");
        }
    }    
}