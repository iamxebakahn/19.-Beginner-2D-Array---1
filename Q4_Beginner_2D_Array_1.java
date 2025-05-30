/*Problem Description

Given 2D Array A[][] and Row index B, return max of Bth row.


Problem Constraints

1 <= A.length <= 103
1 <= A[i].length <= 103
-105<= A[i][j] <= 105
0 <= B < A.length



Input Format

Given two arguments A and B, in which A is 2D Array and B is an Integer.


Output Format

Return max value of ith row.


Example Input

Input 1 :
 
A = [[12, 65, 89, 74],
     [22, 44, 12, 30],
     [10, 12, 97, 19]]
B = 2
Input 2 :
A = [[12, 16, 19]
     [21, 23, 59]]
B = 1


Example Output

Output 1 :
97
Output 2 :
59


Example Explanation

Explanation 1:
The max element of 2nd indexed row [10, 12, 97, 19] is 97.
Explanation 2:
The max element of 1st indexed row [21, 23, 59] is 59. */
public class Q4_Beginner_2D_Array_1{
    public int solve(int[][] A, int B) {
        int N=A.length;
        int M=A[0].length;
        int max=A[B][0];
        for(int i=0;i<M;i++)
        {
            if(A[B][i]>max)
                max=A[B][i];


        } 
           
           
        return max;
    }
}
