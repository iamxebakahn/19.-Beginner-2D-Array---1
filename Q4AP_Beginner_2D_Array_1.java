/*Problem Description

Given 2D Array A[][] and Column index B, return max of Bth column.


Problem Constraints

1 <= A.length <= 103
1 <= A[0].length <= 103
-105<= A[i][j] <= 105


Input Format

Given two argument A and B, in which A is 2D Array and B is an Integer.


Output Format

Return max value of Bth column.


Example Input

Input 1 :
A :
12 65 89 74
22 44 12 30
10 12 97 19

B : 0

Input 2 :
A :
12 16 19
21 23 59

B : 1


Example Output

Output 1 :
22

Output 2 :
23


Example Explanation

Explanation 1:
The max element of 0th indexed col is 22.

Explanation 2:
The max element of 1st indexed col is 23. */

//Method 1

public class Q4AP_Beginner_2D_Array_1{
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {

        int max=A.get(0).get(B);
        for(int i=0;i<A.size();i++)
            {
                if(max<A.get(i).get(B))
                    max=A.get(i).get(B);

            }
        return max;

    }
}


import java.util.ArrayList;

//Method 2
public class Solution {
    public int solve(int[][] A, int B) 
    {
        int N=A.length;
        int M=A[0].length;
        int max=A[0][B];
        for(int i=0;i<N;i++)
        {
            if(A[i][B]>max)
                max=A[i][B];


        } 
           
           
        return max;
    }
}

