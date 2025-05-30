/*Problem Description

You are given a 2D integer matrix A, and return a 2D Dynamic Array containing odd numbers of every row in A.
Note :
In Java: Dynamic Array is ArrayList.
In C++: Dynamic Array is vector.
In Python: Dynamic Array is List.


Problem Constraints

1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103


Input Format

First and only argument A is a 2D Dynamic Array of integers (2D matrix).


Output Format

Return a 2D Dynamic Array containing row-wise odd numbers of the original matrix.


Example Input

Input 1:
A = [ [1, 2, 3, 4],
      [5, 6, 7, 8],
      [9, 4, 3, 5] ]
Input 2:
A = [ [1, 3],
      [2, 4] ]


Example Output

Output 1:
[ [1, 9], 
  [5, 7], 
  [9, 3, 5] ]
Output 2:
[ [1, 3],
  [ ] ]


Example Explanation

Explanation 1:
1st row odd elements = 1, 3
2nd row odd elements = 5, 7
3rd row odd elements = 9, 3, 5
Explanation 2:
1st row odd elements = 1, 9
There is no odd elements in the 2nd row. */



public class Q3AP_Beginner_2D_Array_1{
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        for(int i=0;i<A.size();i++)
        {
            ArrayList<Integer> oddrow= new ArrayList<>();
            for(int j=0;j<A.get(i).size();j++)
            {
                if(A.get(i).get(j)%2!=0)
                    oddrow.add(A.get(i).get(j));
            }

            result.add(oddrow);
        }

        return result;
    }
}


import java.util.ArrayList;

