#include <stdio.h>

/*

Laboratory 10, Exercise 2.

A program that accepts 10 integers and finds and displays the largest of them all.

*/

int main(void) {

    int a, b, i = 1;

    do {

        printf("Enter number %d: ", i);

        scanf("%d", &a);

        if (a > b) {

            b = a;

        }

        i += 1;

    }
    
    while (i <= 10); {

        printf("The largest number is: %d", b);

    }

}