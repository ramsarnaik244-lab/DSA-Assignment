import java.util.*;
class Demo{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n = sc.nextInt();

   int num=1;

   for(int i=1;i<=n;i++){
      for(int p=1;p<=n-i;p++){
         System.out.print(" ");
   }
    
   for(int j=1;j<=i;j++){
       if((i+j)%2==0){
       System.out.print("1"+" ");
      }else{
       System.out.print("0"+" ");
    }
  }
   System.out.println();
 }
   for(int i=n-1;i>=1;i--){
      for(int p=1;p<=n-i;p++){
         System.out.print(" ");
  }
    for(int j=1;j<=i;j++){
      if((i+j)%2==0){
        System.out.print("1"+" ");
   }else{
        System.out.print("0"+" ");
  }
}
   System.out.println();
    }
  }
}