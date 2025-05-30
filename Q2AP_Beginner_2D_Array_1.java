/*Problem Description

Given 2D Array A[][] and Column Index B, return sum of Bth column.


Problem Constraints

0 < total row, total col <= 1000
-100000 <= A[i][j] <= 100000
0 <= B < A[i].length


Input Format

Given two Arguments A and B, in which A is 2D Array and B is index.


Output Format

Return Sum of Bth column.


Example Input

Input 1 :
A = [ [12, 65, 89, 74],
      [22, 44, 12, 30],
      [10, 12, 97, 19] ]
B = 1
Input 2 :
A = [ [12, 16, 19],
      [21, 23, 59] ]
B = 2


Example Output

Output 1 :
121
Output 2 :
78


Example Explanation

Explanation 1:
Sum of 1st column is = 65 + 44 + 12 = 121
Explanation 2:
Sum of 2nd column is = 19 + 59 = 78 */

public class Q2AP_Beginner_2D_Array_1{
    public int solve(int[][] A, int B) {
        int N=A.length;
        int M=A[0].length;
        int sum=0;
        for(int i=0;i<N;i++)
           sum=sum+A[i][B];
           
        return sum;
            

    }
}
