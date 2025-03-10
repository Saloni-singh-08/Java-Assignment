public class star {
    public static void main(String[] args) {
         for(int i=1;i<=13;i++){
                for(int j=1;j<=13;j++){
                  if((i+j==8 && j<=7) || (j-i==6 && i<=7 && j>=7) || i==7 || i==3 || (i-j==2 && j<=7) || (i+j==16 && i>=3 && j>=7)){
                    System.out.print("* ");
                  }
                  else
                    System.out.print("  ");
                }
                System.out.print("\n");
              }
            }
          }

