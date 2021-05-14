import java.util.Scanner;

public class Main {
    public static void main(String args[]){
         int[] nums = new int[999999];
         Scanner input = new Scanner(System.in);

       for(int j=0; j<999999; j++){
            System.out.println("input a number from 1 to 100");
            int tempNum = input.nextInt();
            if (tempNum >= 1 && tempNum <= 100) {
                nums[j] = tempNum;

            System.out.println("Ready to stop? (y/n)");
            String checkQuit = input.next();
            if (checkQuit.toLowerCase().equals("y")) {
                int[] values = new int[10];

                for(int i =0 ; i<=999999; i++){
                    if(nums[i] == 0){
                        //System.out.println(Arrays.toString(values));
                        System.out.println("amount of numbers from 1-10: " + values[0]);
                        System.out.println("amount of numbers from 11-20: " + values[1]);
                        System.out.println("amount of numbers from 21-30: " + values[2]);
                        System.out.println("amount of numbers from 31-40: " + values[3]);
                        System.out.println("amount of numbers from 41-50: " + values[4]);
                        System.out.println("amount of numbers from 51-60: " + values[5]);
                        System.out.println("amount of numbers from 61-70: " + values[6]);
                        System.out.println("amount of numbers from 71-80: " + values[7]);
                        System.out.println("amount of numbers from 81-90: " + values[8]);
                        System.out.println("amount of numbers from 91-100: " + values[9]);

                        return;
                    }
                   for(int a =1; a<=10; a++){
                       if(nums[i]<=10*a){
                           values[a-1]++;
                           break;
                       }
                   }
                }
               return;
            }
            } else {
                System.out.println("Please input a valid number between 1 and 100");
                j--;
            }
        }


    }
}
