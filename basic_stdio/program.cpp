#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

/*
 * This is a C++ program with a few basic input/output examples.
 * We show how to read/write arrays, and arrays that can change size (vectors).
 */

int main()
{
    // If you use cin/cout, always include this line first.
    std::ios::sync_with_stdio(false);

    // Declare an integer N.
    int N;

    // Create an array A that can store up to 1000 integers.
    // The array is initially filled with zeros.
    int A[1000] = {};

    // Read a single number and store it in N.
    cin >> N;

    // Read N numbers and store them in A.
    // We must be sure that N <= 1000, or the program might crash.
    for(int i = 0; i < N; i++) {
        cin >> A[i];
    }

    // Declare an empty vector B.
    // The size of B can change. It is stored in B.size().
    vector<int> B;

    // This loop copies the elements of A into the vector B in reverse order.
    for(int i = 0; i < N; i++) {
        B.push_back(A[N - 1 - i]);
    }

    // Sort A from the smallest value to the largest value.
    sort(A, A + N);

    // Sort B from the smallest value to the largest value.
    sort(B.begin(), B.end());

    int sum_of_even_places = 0;
    int sum_of_odd_places = 0;

    // This for loop goes over all elements of B, and calculates the
    // sum of elements in even position and sum of elements in odd positions.
    // Note: the first position is even (0).
    for(int i = 0; i < N; i++) {
        if((i % 2) == 0) {
            sum_of_even_places += B[i];
        }
        else {
            sum_of_odd_places += B[i];
        }
    }

    // Print the results.
    cout << sum_of_even_places << " " << sum_of_odd_places << endl;

    // Read a string.
    // The string is read until we meet a space, or a newline,
    // or the end of the input (whatever comes first).
    // my_str will not include this space/newline.
    string my_str;
    cin >> my_str;

    // Print the string size, and the first character.
    cout << my_str.size() << endl << my_str[0] << endl;

    // This part calculates the integer value of 100 divided by 30
    // (which is 3), and the remainder (which is 10).
    // This is just an example! Normally you should use "100/30" and "100%30".
    int X = 100, Y = 30;
    cout << X << " / " << Y << " = ";

    int counter = 0;
    while(X >= Y) {
        X = X - Y;
        counter = counter + 1;
    }

    cout << counter << " with remainder " << X << endl;

    return 0;
}
