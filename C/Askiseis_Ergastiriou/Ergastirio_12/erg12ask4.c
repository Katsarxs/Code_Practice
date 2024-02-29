#include <stdio.h>

/*

Laboratory 12, Exercise 4.

2 functions with prototypes:
int my_fmin(int, int); // Returns the value of the smallest integer
int my_fmax(int, int); // Returns the value of the largest integer
A program that reads from the input 3 integers and, using the above functions, calculates and displays the largest and smallest of them.

*/

int my_fmin(int, int);

int my_fmax(int, int);

int main(void) {

    int a, b, c, max, min;

    scanf("%d %d %d", &a, &b, &c);

    max = my_fmax(my_fmax(a, b), c);

    min = my_fmin(my_fmin(a, b), c);

    printf("Max number : %d\n", max);

    printf("Min number : %d", min);

}

int my_fmin(int a, int b) {

    if (a < b) {

        return a;

    }

    else {

        return b;

    }

}

int my_fmax(int a, int b) {

    if (a > b) {

        return a;

    }

    else {

        return b;

    }

}