public class swastik {
    public static void main(String[] args) {
        for(int i = 1; i <8; i++) 
        {
            for(int j = 1; j <=9; j++)
             {
                if((i<=4 && j<=1) || (j==5) || (i==4) || (i>=4 && j==9) || (j>=5 && i==1) || (i==7 && j<=5))
                {
                    System.out.print("*"); 
                } 
                else
                {
                    System.out.print(" "); 
                }
            
            }
            System.out.println();
             }
        }
    
}
