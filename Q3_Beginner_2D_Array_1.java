/*Problem Description

Given 2D Array A[][] and Row Index B, return sum of Bth row.


Problem Constraints

0 < total row, total col <= 1000
-100000 <= A[i][j] <= 100000
0 <= B < A.length


Input Format

Given two Arguments A and B in which A is 2D array and B is index.


Output Format

Return Sum of Bth row.


Example Input

Input 1 :
A :
12 65 89 74
22 44 12 30
10 12 97 19
B : 1

Input 2 :
A :
12 16 19
21 23 59
B : 1


Example Output

Output 1 :
108

Output 2 :
103


Example Explanation

Explanation 1:
Sum of 1st row is = 22 + 44 + 12 + 30 = 108

Explanation 2:
Sum of 1st row is = 21 + 23 + 59 = 103




Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases */
public class Q3_Beginner_2D_Array_1{
    public int solve(int[][] A, int B) {
        int N=A.length;
        int M=A[0].length;
        int sum=0;
        for(int i=0;i<M;i++)
           sum=sum+A[B][i];
           
        return sum;
            
        
    }
}
