import java.util.Scanner;
class Demo{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();

    for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++){
          System.out.print(" ");
   }
    for(int p=1;p<=i;p++){
       System.out.print(p+" ");
   }
    System.out.println(); 
  }
   for(int i=n-1;i>=1;i--){
     for(int j=1;j<=n-i;j++){
       System.out.print(" ");
    }
    for(int p=1;p<=i;p++){
        System.out.print(p+" ");
    }
     System.out.println();
    }
  }
}