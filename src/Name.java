/*
Q.Nitika was once reading a history book and wanted to analyze it. So she asked her brother to create a list of names
 of the various famous personalities in the book. Her brother gave Nitika the list. Nitika was furious when she saw
 the list. The names of the people were not properly formatted. She doesn't like this and would like to properly
 format it.

A name can have at most three parts: first name, middle name and last name. It will have at least one part.
The last name is always present. The rules of formatting a name are very simple:

Only the first letter of each part of the name should be capital.
All the parts of the name except the last part should be represented by only two characters.
The first character should be the first letter of the part and should be capitalized. The second character
should be ".".
Let us look at some examples of formatting according to these rules:

gandhi -> Gandhi
mahatma gandhI -> M. Gandhi
Mohndas KaramChand ganDhi -> M. K. Gandhi
Input
The first line of the input contains an integer T denoting the number of test cases.

The only line of each test case contains the space separated parts of the name.

Output
For each case, output the properly formatted name.

Constraints
1 ≤ T ≤ 100
2 ≤ Length of each part of the name ≤ 10
Each part of the name contains the letters from lower and upper case English alphabets
(i.e. from 'a' to 'z', or 'A' to 'Z')
Subtasks
Subtask #1 (40 points)

There is exactly one part in the name.
Subtask #2 (60 points)

Original constraints.
Example
Input:
3
gandhi
mahatma gandhI
Mohndas KaramChand gandhi

Output:
Gandhi
M. Gandhi
M. K. Gandhi
Explanation
The examples are already explained in the problem statement.
*/

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int m = 0; m < t; m++) {
            String str=sc.nextLine();
            String str1=str.toLowerCase();
            StringBuffer obj = new StringBuffer(str1);



            for (int i = 0; i < obj.length(); i++) {
                if (i == 0) {

                    if (Character.isLowerCase(obj.charAt(i))) {
                        obj.replace(0, 1, String.valueOf(Character.toUpperCase(obj.charAt(i))));
                    }
                }
                if (obj.charAt(i) == ' ') {


                    obj.replace(i + 1, i + 2, String.valueOf(Character.toUpperCase(obj.charAt(i + 1))));
                    for (int k = i + 1; k < obj.length(); k++) {
                        if (obj.charAt(k) == ' ') {
                            obj.replace(k + 1, k + 2, String.valueOf(Character.toUpperCase(obj.charAt(k + 1))));
                            obj.replace(i + 2, k, String.valueOf('.'));
                            break;
                        }
                    }
                    int l = 1;
                    obj.replace(1, i, String.valueOf('.'));
                    break;


                }

            }
            System.out.println(obj.toString());

        }
    }
}