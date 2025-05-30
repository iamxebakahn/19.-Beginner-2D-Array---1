/*Problem Description

Given an N x N matrix, print the elements of the matrix in a wave form row-wise. For the first row, traverse from left to right, for the second row, traverse from right to left, and continue this alternating pattern for the remaining rows.


Problem Constraints

1 <= N <= 103

0 <= Mat[i][j] <= 109



Input Format

First line is an integer N

Next N lines contain N space separated integers representing the matrix Mat




Output Format

A single line containing N*N integers of matrix Mat in wave form (row wise)

Note: Ensure there is a space character (' ') at the end of the line.


Example Input

Input 1:

3
4 1 2
7 4 4 
3 7 4
Input 2:

2
1 2
3 4


Example Output

Output 1:

4 1 2 4 4 7 3 7 4
Output 2:

1 2 4 3


Example Explanation

For Input 1:
We will first iterate the 1st row from left to right and print the elements, 
then we will iterate the 2nd row from right to left and print the elements,
then we will iterate the 3rd row from left to right and print the elements.
This looks like a wave.
For Input 2:
We will first iterate the 1st row from left to right and print the elements, 
then we will iterate the 2nd row from right to left and print the elements.
This looks like a wave. */

import java.lang.*;
import java.util.*;

public class Q5_Beginner_2D_Array_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<N;j++)
                {
                    System.out.print(mat[i][j]+" ");

                    // if(!((i==N-1)&&(j==0)))
                    //     System.out.print(" ");
                }
            }

            else
            {
              for(int j=N-1;j>=0;j--)
                {
                    System.out.print(mat[i][j]+" ");

                    // if(!((i==N-1)&&(j==N-1)))
                    //     System.out.print(" ");

                }  
            }

        }
    }
}