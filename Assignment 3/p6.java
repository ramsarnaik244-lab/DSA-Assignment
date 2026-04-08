import java.util.Scanner;
class Demo{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     
     int size = 2*n-1;

    for(int i=1;i<=size;i++){
       for(int j=1;j<=size;j++){
         int top=i-1;
         int bottom=size-i;
         int left=j-1;
         int right=size-j;
         int layerNo=Math.min(Math.min(top,bottom),Math.min(left,right));

         System.out.print((n-layerNo)+" ");
       }
         System.out.println();
     }
   }
}