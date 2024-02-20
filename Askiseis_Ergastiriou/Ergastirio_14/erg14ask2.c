#include <stdio.h>

/* 

Laboratory 14, Exercise 2.

A program that implements an array of 8 integers, initializes the array elements from the keyboard, and then displays the array in reverse order.
Example, to input array elements {4, 6, 3, 7, 43, 6, 23, 15} to display:
15 23 6 43 7 3 6 4

*/

int main(void) {

    int arr[7] = {};

    int i;

    for (i = 0; i <= 6; i++) {

        scanf("%d", &arr[i]);

    }

    scanf("%d", &arr[7]);

    printf("%d ", arr[7]);

    for (i = 6; i >= 0; i--) {

        printf("%d ", arr[i]);

    }
}