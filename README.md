# Public documentation for contestants

This repository contains sample code for IOI contestants, that shows how to perform basic operations in C++, Java and C#.

## Notes on basic input/output:
* In C++, use `sync_with_stdio(false)` for fast `cin`/`cout`.
* In Java, `BufferedReader` seems to be faster than `Scanner`.
* In Java and C#, printing seems to have expensive overhead. In Java we can use `BufferedWriter` (remember to `flush()` before exiting!), and in C# we can use `StringBuilder`.
* Java and C# seem to read very long lines slower than C++. Best to avoid long lines if possible.
* Java's `ArrayList` is sometimes slower than normal arrays.
