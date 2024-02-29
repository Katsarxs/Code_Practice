#include <stdio.h> // Include standard input-output library
#include <stdlib.h> // Include standard library
#include <time.h> // Include time library

/*

Laboratory 17, Exercise 1.

Construct a function that accepts a one-dimensional array of integers and returns the largest element.
Then write a program that constructs 2 one-dimensional arrays arr1 and arr2 ,
either with input from the user or with random values ​​and using the above function to display in which array of the 2 the largest number is located and which number it is .

*/

#define N 10 // Define the size of the arrays

int max(int[]); // Declare the function for finding the maximum element in an array

int max(int arr[]) { // Define the function to find the maximum element in an array

    int i, max_element = 0; // Initialize variables to store the maximum element

    for (i = 0; i < N; i ++) { // Iterate through the array

        if (arr[i] > max_element) { // Check if the current element is greater than the maximum element so far

            max_element = arr[i]; // If yes, update the maximum element

        }

    }

    return max_element; // Return the maximum element

}

int main(void) { // Main function

    int array1[N], array2[N]; // Declare two arrays

    int i; // Declare loop variable

    srand(time(NULL)); // Seed the random number generator with the current time

    // Initialize array1 with random values

    for (i = 0; i < N; i ++) {

        array1[i] = 0 + rand() % 11;

    }

    // Initialize array2 with random values

    for (i = 0; i < N; i ++) {

        array2[i] = 0 + rand() % 11;

    }

    int max1, max2; // Declare variables to store the maximum elements of array1 and array2

    // Find the maximum element in array1

    max1 = max(array1);

    // Find the maximum element in array2

    max2 = max(array2);

    // Compare the maximum elements of array1 and array2

    if (max1 > max2) { // If the maximum element of array1 is greater than that of array2

        printf("The biggest number is in Array 1 and it is %d", max1); // Print the result

    }

    else if (max2 > max1) { // If the maximum element of array2 is greater than that of array1

        printf("The biggest number is in Array 2 and it is %d", max2); // Print the result

    }

    else { // If the maximum elements of both arrays are equal

        printf("Same"); // Print the result

    }

}