
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int i = 7;
        int count = 0;
        int j = 0;
        int p = 0;
        while(i<=n){
            if(i==7 || j==7 || p==7)
                count = count + 1;
            if(j==7 && p==7)
                count = count + 1;
            i = i+1;
            j = i%10;
            p = i/10;

            


        }System.out.println(count);
    }
}