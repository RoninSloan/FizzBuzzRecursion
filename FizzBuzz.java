//Ronin Sloan
//3/13/23
//Recursive FizzBuzz Project
//purpose: create a recursive program that prints "Fizz" for
//every multiple of 3 and "Buzz" for every multiple of 5.
//numbers that are both will print "FizzBuzz"
public class FizzBuzz {
    public static void main(String[] args) {
        //number program stops at
        int count = 100;
        recursion(count, 1);
    }
    //end of main

    //recursion method
    static void recursion(int count, int n){
        //base case
        if(n == count){
            return;
        }
        //recursive step
        if(n % 15 == 0){
            System.out.print("FizzBuzz");
        }
        else if(n % 5 == 0){
            System.out.print("Fizz");
        }
        else if(n % 3 == 0){
            System.out.print("Buzz");
        }
        else{
            System.out.print(n);
        }
        System.out.println();
        recursion(count, n + 1);
    }
}
