public class four {
    public static void main(String[] args)
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i+j==6 || j==5 || i==5)
                System.out.print("+");
                else
                System.out.print(" ");
            }
            System.out.print("\n");

        }
    }
    
}
