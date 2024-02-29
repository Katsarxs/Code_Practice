#include <stdio.h>     // Including standard input-output header file
#include <stdlib.h>    // Including standard library header file
#include <time.h>      // Including time header file for generating random numbers

/*

Assessment Exercise 12

In the library of the University of the Aegean, the tables arr1[10][6] and arr2[10][6] have registered 
the number of people who borrowed each of the 10 books for each month - in arr1 for the first semester, 
in arr2 for the second half, 
i.e. the first dimension (row) refers to a book and the second dimension (column) refers to a month.
In addition, the code[10] array contains the 4-digit codes for each book and is in full correspondence with 
the arr1 and arr2 arrays.
Write a program that:

Q1) Joins the arrays arr1 and arr2 into a new array arr[10][12] to contain the number of loans for all 
months of the year. Display the sum of all elements of the array arr.
Q2) Reads a book code and displays the month (1-12) in which the most people borrowed that book 
(Find maximum of one row of arr).
If there are more than one such month, display the first month it finds starting from January (column 0 
of the arr table). If there is no book code it will show “Book not found”.

The arrays arr1, arr2 and code are given to you initialized (N = 10, M = 6):

int arr1[N][M] = {

        {15, 20, 12, 8, 7, 0},
        {15, 14, 13, 9, 15, 10},
        {20, 15, 20, 2, 10, 18},
        {4, 2, 20, 9, 2, 15},
        {9, 7, 15, 7, 1, 16},
        {3, 20, 17, 20, 12, 15},
        {15, 1, 0, 16, 10, 12},
        {12, 9, 0, 8, 10, 20},
        {11, 14, 11, 12, 11, 18},
        {6, 5, 6, 20, 7, 3}
    };

    int arr2[N][M] = {

        {7, 2, 1, 11, 5, 10},
        {20, 7, 4, 18, 2, 15},
        {7, 15, 8, 19, 14, 18},
        {0, 12, 18, 11, 2, 9},
        {12, 2, 7, 8, 6, 3},
        {15, 20, 1, 20, 18, 0},
        {2, 4, 8, 5, 8, 15},
        {0, 13, 11, 20, 2, 7},
        {4, 11, 7, 12, 10, 4},
        {12, 0, 17, 13, 20, 13}
    };
    
    int code[N] = {9987, 8830, 4217, 9448, 7509, 3916, 8746, 9951, 6394, 2099};

*/

#define N 10    // Defining the number of books
#define M 6     // Defining the number of months in a semester
#define P 12    // Defining the total number of months in a year

int main(void) { // Main function where the program execution begins.

    int i, j, code_input;    // Declaration of variables

    scanf("%d", &code_input);    // Scanning the input for book code

    int arr1[N][M] = {    // Initializing the first semester array

        {15, 20, 12, 8, 7, 0},
        {15, 14, 13, 9, 15, 10},
        {20, 15, 20, 2, 10, 18},
        {4, 2, 20, 9, 2, 15},
        {9, 7, 15, 7, 1, 16},
        {3, 20, 17, 20, 12, 15},
        {15, 1, 0, 16, 10, 12},
        {12, 9, 0, 8, 10, 20},
        {11, 14, 11, 12, 11, 18},
        {6, 5, 6, 20, 7, 3}

    };

    int arr2[N][M] = {    // Initializing the second semester array

        {7, 2, 1, 11, 5, 10},
        {20, 7, 4, 18, 2, 15},
        {7, 15, 8, 19, 14, 18},
        {0, 12, 18, 11, 2, 9},
        {12, 2, 7, 8, 6, 3},
        {15, 20, 1, 20, 18, 0},
        {2, 4, 8, 5, 8, 15},
        {0, 13, 11, 20, 2, 7},
        {4, 11, 7, 12, 10, 4},
        {12, 0, 17, 13, 20, 13}

    };

    int code[N] = {9987, 8830, 4217, 9448, 7509, 3916, 8746, 9951, 6394, 2099};    // Initializing the book codes

    int arr[10][12];    // Declaring a new array to contain the combined loan data for all months

    for (i = 0; i < N; i++) {    // Loop to copy the first semester data into the combined array

        for (j = 0; j < M; j++) {

            arr[i][j] = arr1[i][j];

        }
        
    }

    for (i = 0; i < N; i++) {    // Loop to copy the second semester data into the combined array

        for (j = M; j < P; j++)
        {
            arr[i][j] = arr2[i][j - 6];

        }
        
    }

    int sum = 0;    // Variable to store the sum of all elements in the combined array

    for (i = 0; i < N; i++) {    // Loop to calculate the sum of all elements in the combined array

        for (j = 0; j < P; j++) {

            // printf("%d ", arr[i][j]);    // Printing the combined array for debugging

            sum += arr[i][j];    // Adding each element to the sum

        }
        
    }

    printf("Q1: %d", sum);    // Printing the sum of all elements in the combined array

    int line;    // Variable to store the index of the book code

    int found = 0;    // Flag to indicate if the book code is found

    for (i = 0; i < N; i++) {    // Loop to search for the book code

        if (code[i] == code_input) {
            
            found = 1;    // Setting the flag to true

            line = i;    // Storing the index of the book code
        
            break;

        }

    }

    if (found)  {    // If the book code is found

        int max, maxi[0];    // Variables to store the maximum value and its index

        for (j = 0; j < P; j++) {    // Loop to find the maximum value in the corresponding row
            
            if (arr[line][j] > maxi[0]) {    // If the current value is greater than the maximum
                
                max = j;    // Update the maximum value and its index

                maxi[0] = arr[line][j]; 

            }
        
        }

        printf("\nQ2: %d", max + 1);    // Printing the month with the most loans

    }
    
    else {    // If the book code is not found
        
        printf("\nQ2: Book not found");    // Printing a message indicating that the book code is not found
    
    }
    
}