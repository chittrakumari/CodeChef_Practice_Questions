/*
Q.Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.

The first thing Chefu wanted to do was to calculate the result of his homework — the sum of A and B,
and write it using matches. Help Chefu and tell him the number of matches needed to write the result.

Digits are formed using matches in the following way:

Input
The first line of the input contains a single integer T denoting the number of test cases. The description
of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B.
Output
For each test case, print a single line containing one integer — the number of matches needed to write
 the result (A+B).

Constraints
1≤T≤1,000
1≤A,B≤106
Example Input
3
123 234
10101 1010
4 4
Example Output
13
10
7
Explanation
Example case 1: The result is 357. We need 5 matches to write the digit 3, 5 matches to write the digit
5 and 3 matches to write the digit 7.

Example case 2: The result is 11111. We need 2 matches to write each digit 1, which is 2⋅5=10 matches in
total.
*/





import java.util.Scanner;

public class MatchSticks {
    public static void main(String[] args) {
        int[] arr= {6,2,5,5,4,5,6,3,7,6};
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c;
        for (int i = 0; i <t; i++) {
            c=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            String q=new String(String.valueOf(sum));
            for (int j = 0; j < q.length(); j++) {
                if(q.charAt(j)=='0'){
                    c=c+arr[0];
                }
                if(q.charAt(j)=='1'){
                    c=c+arr[1];
                }
                if(q.charAt(j)=='2'){
                    c=c+arr[2];
                }
                if(q.charAt(j)=='3'){
                    c=c+arr[3];
                }
                if(q.charAt(j)=='4'){
                    c=c+arr[4];
                }
                if(q.charAt(j)=='5'){
                    c=c+arr[5];
                }
                if(q.charAt(j)=='6'){
                    c=c+arr[6];
                }
                if(q.charAt(j)=='7'){
                    c=c+arr[7];
                }
                if(q.charAt(j)=='8'){
                    c=c+arr[8];
                }
                if(q.charAt(j)=='9'){
                    c=c+arr[9];
                }
            }
            System.out.println(c);
        }



    }
}
