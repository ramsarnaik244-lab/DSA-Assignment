import java.util.Scanner;
class Demo{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number:");
     int n = sc.nextInt();
     int num=0;
     int sum = 0;
     for(int i=1;i<num;i++){
       if(num % i == 0){
         sum= sum+i;
      }
   }
          if(sum==num){
      System.out.println("Perfect number");
         }else{
     System.out.println("Not perfect number");
    }
  }
}