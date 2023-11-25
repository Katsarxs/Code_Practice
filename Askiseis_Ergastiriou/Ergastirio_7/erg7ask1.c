#include <stdio.h>

/*

Laboratory 7, Exercise 1.

What will the following program display?

Result :

Two#One#One

*/

int main(void) {

    int a = 4, b = 5, c = 3;

    if (a && a / b) {

        printf("One#");

    }

    else {

        printf("Two#");

    }

    if (++a == b++) {

        printf("One#");

    }

    else {

        printf("Two#");

    }

    if (a< b < c) {

        printf("One");

    }

    else {

        printf("Two");

    }

}