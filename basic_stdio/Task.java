// Important: no package!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * This is a Java program with a few basic input/output examples.
 * We show how to read/write arrays, and arrays that can change size (ArrayLists).
 */

// The name of the class MUST be "Task".
public class Task
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        // Use BufferedReader and BufferedWriter for input and output.
        // Do not use Scanner and System.out (they can be too slow).
        // Do not forget to use writer.flush() eventually!
        // writer.write() expects a string, NOT a number. To print numbers,
        // convert them to strings with String.valueOf(). See examples below.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // Declare an integer N
        int N;

        // Declare a pointer A to an array of integers
        int[] A;
        
        // Read a line with a single number and store it in N
        N = Integer.parseInt(reader.readLine());

        // Read a line with two integers.
        String[] input_line = reader.readLine().split(" ");
        int L = Integer.parseInt(input_line[0]);
        int R = Integer.parseInt(input_line[1]);

        // Print the difference to one line.
        writer.write(String.valueOf(L-R));
        writer.newLine();
        
        // Create a new array of N integers and make A point to this array.
        A = new int[N];
        
        // Read N lines with one number in each line and store them in the array A
        for (int i = 0; i < N; i++)
        {
            A[i] = Integer.parseInt(reader.readLine());
        }

        // Declare an empty ArrayList B.
        // The size of B can change. It is stored in B.size().
        // Note: sometimes normal arrays are faster than ArrayLists.
        ArrayList<Integer> B = new ArrayList<Integer>();

        // This loop copies the elements of A into B in reverse order.
        for (int i = 0; i < N; i++)
        {
            B.add(A[N - 1 - i]);
        }

        // Sort A from the smallest value to the largest value.
        Arrays.sort(A);

        // Sort B from the smallest value to the largest value.
        Collections.sort(B);

        int sum_of_even_places = 0;
        int sum_of_odd_places = 0;

        // This for loop goes over all elements of B, and calculates the
        // sum of elements in even position and sum of elements in odd positions.
        // Note: the first position is even (0).
        for (int i = 0; i < N; i++)
        {
            if((i % 2) == 0)
            {
                sum_of_even_places += B.get(i);
            }
            else
            {
                sum_of_odd_places += B.get(i);
            }
        }

        // Print the results in one line.
        writer.write(String.valueOf(sum_of_even_places));
        writer.write(" ");
        writer.write(String.valueOf(sum_of_odd_places));
        writer.newLine();

        // Read a string.
        // The string is read until the end of the line.
        // my_str will not include the newline character.
        String my_str;
        my_str = reader.readLine();
        
        // Print the string size, and the first character.
        writer.write(String.valueOf(my_str.length()));
        writer.newLine();
        writer.write(my_str.charAt(0));
        writer.newLine();

        // This part calculates the integer value of 100 divided by 30
        // (which is 3), and the remainder (which is 10).
        // This is just an example! Normally you should use "100/30" and "100%30".
        int X = 100, Y = 30;
        writer.write(String.valueOf(X));
        writer.write(" / ");
        writer.write(String.valueOf(Y));
        writer.write(" = ");

        int counter = 0;
        while (X >= Y)
        {
            X = X - Y;
            counter = counter + 1;
        }

        writer.write(String.valueOf(counter));
        writer.write(" with remainder ");
        writer.write(String.valueOf(X));
        writer.newLine();

        // Don't forget to flush before exiting.
        writer.flush();
    }
}


