public class EXCEP {
    public static void main(String[] args) {
        
        int i=0;
        int j=0;
        int a[] = new int[5];

        try
        {
            // j = 10/i;
            System.out.println(a[6]);
        }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Cannot divided by 0");
        // }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter a valid length");
        }
        
        
        System.out.println(j);
    }
    
}
