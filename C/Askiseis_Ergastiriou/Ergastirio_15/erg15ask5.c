#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 15, Exercise 5.

A program that, for a sorted array of 10 integers,
will read an integer and create a new 11-element array that will contain the elements of the first array as well as the new element, sorted.

*/

#define N 10

int main(void) {

    int basic_array[N]; // Declare an array to hold 10 integers

    srand(time(NULL)); // Seed the random number generator with the current time

    // Fill the basic_array with random integers between 0 and 100

    for (int i = 0; i < N; i++) {

        basic_array[i] = 0 + rand() % 101;

    }

    int user_input; // Variable to store the integer entered by the user

    // Prompt the user to enter a number between 0 and 100

    printf("Enter A number (0 - 100) : ");

    scanf("%d", &user_input);

    int new_array[N + 1]; // Declare an array to hold the sorted array plus the new element

    int i, j;

    // Iterate through the basic_array to find the position to insert the new element

    for (i = 0; i < N; i++) {

        if (basic_array[i] < user_input) {

            new_array[i] = basic_array[i]; // Copy elements from basic_array to new_array

        }
        
        else {

            new_array[i] = user_input; // Insert the new element when the appropriate position is found

            break; // Exit the loop since the element has been inserted

        }
        
    }

    // If the new element is larger than all elements in basic_array, insert it at the end

    if (i == N) {

        new_array[i] = user_input;

    }
    
    else {

        // Shift elements in basic_array to the right to make space for the new element

        for (j = i; j < N; j++) {

            new_array[j + 1] = basic_array[j];

        }

    }

    // Print the elements of basic_array

    printf("First Array : ");

    for (int i = 0; i < N; i++) {

        printf("%4d ", basic_array[i]);

    }

    puts("");

    // Print the elements of new_array

    printf("New Array : ");

    for (int i = 0; i < (N + 1); i++) {

        printf("%4d ", new_array[i]);

    }

}