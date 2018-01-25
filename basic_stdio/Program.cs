using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

/*
 * This is a C# program with a few basic input/output examples.
 * We show how to read/write arrays, and arrays that can change size (lists).
 * We show how to print large outputs using StringBuilder.
 */

namespace MyNamespace
{
    class MyProgram
    {
        static void Main(string[] args)
        {
            // Declare an integer N
            int N;

            // Declare a pointer A to an array of integers.
            int[] A;

            // Read a line with a single number and store it in N.
            N = int.Parse(Console.ReadLine());

            // Read a line with two integers.
            string[] input_line = Console.ReadLine().Split();
            int L = int.Parse(input_line[0]);
            int R = int.Parse(input_line[1]);

            // Print the difference between them.
            Console.WriteLine(L - R);

            // Read N lines with one integer in each line, and store them in A
            A = new int[N];
            for (int i = 0; i < N; i++)
            {
                A[i] = int.Parse(Console.ReadLine());
            }

            // Declare an empty list B.
            // The size of B can change. It is stored in B.Count.
            List<int> B = new List<int>();

            // This loop copies the elements of A into B in reverse order.
            for (int i = 0; i < N; i++)
            {
                B.Add(A[N - 1 - i]);
            }

            // Sort A from the smallest value to the largest value.
            Array.Sort(A);

            // Sort B from the smallest value to the largest value.
            B.Sort();

            int sum_of_even_places = 0;
            int sum_of_odd_places = 0;

            // This for loop goes over all elements of B, and calculates the
            // sum of elements in even position and sum of elements in odd positions.
            // Note: the first position is even (0).
            for (int i = 0; i < N; i++)
            {
                if((i % 2) == 0)
                {
                    sum_of_even_places += B[i];
                }
                else
                {
                    sum_of_odd_places += B[i];
                }
            }

            // Print the results in one line.
            Console.Write(sum_of_even_places);
            Console.Write(" ");
            Console.WriteLine(sum_of_odd_places);

            // This part calculates the integer value of 100 divided by 30
            // (which is 3), and the remainder (which is 10).
            // This is just an example! Normally you should use "100/30" and "100%30".
            int X = 100, Y = 30;
            Console.Write(X);
            Console.Write(" / ");
            Console.Write(Y);
            Console.Write(" = ");

            int counter = 0;
            while (X >= Y)
            {
                X = X - Y;
                counter = counter + 1;
            }
            Console.Write(counter);
            Console.Write(" with remainder ");
            Console.WriteLine(X);


            // Printing has overhead, which can be expensive. For large outputs, use StringBuilder.
            // If you don't want to store all of the output at once, you can occasionally
            // print the builder and empty it. But if you do it too frequently, your program
            // might be too slow.
            // The following example works better than 1000 calls to Console.WriteLine.

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 1000; i++)
            {
                sb.Append(i + ",\n");
            }
            Console.WriteLine(sb.ToString());
        }
    }
}
