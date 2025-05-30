/*Problem Description

You are given a 2D integer matrix A, Return a 2D Dynamic Array containing even numbers of every row in A.

Note :
In JAVA: Dynamic Array is ArrayList
In C++: Dynamic Array is vector.
In Python: Dynamic Array is List



Problem Constraints

1 <= A.length <= 103
1 <= A[i].length <= 103
1 <= A[i][j] <= 103


Input Format

First and only argument A is a 2D Dynamic Array of integers (2D matrix).


Output Format

Return a 2D Dynamic Array containing row-wise even numbers of the original matrix.


Example Input

Input 1:
A = [[1,2,3,4],
     [5,6,7,8],
     [9,4,3,5]]
Input 2:
A = [[10, 30],
     [11, 13]]


Example Output

Output 1:
[[2 4],
 [6 8], 
 [4]]
Output 2:
[[10, 30],
 []]


Example Explanation

Explanation 1:
1st row even elements = 2,4
2nd row even elements = 6,8
3rd row even elements = 4
Explanation 2:
1st row even elements = 10, 30
There is no even elements in the 2nd row */

public class Q2_Beginner_2D_Array_1{
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        for(int i=0;i<A.size();i++)
        {
            ArrayList<Integer> evenrow= new ArrayList<>();
            for(int j=0;j<A.get(i).size();j++)
            {
                if(A.get(i).get(j)%2==0)
                    evenrow.add(A.get(i).get(j));
            }

            result.add(evenrow);
        }

        return result;

    }
}


import java.util.ArrayList;

