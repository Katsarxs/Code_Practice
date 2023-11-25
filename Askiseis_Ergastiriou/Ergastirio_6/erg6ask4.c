#include <stdio.h>

/*

Laboratory 6, Exercise 4.

A program that reads four integers and displays the smallest of them.

*/

int main(void) {

    int a, b, c, d, min;

    printf("Enter 4 integers : ");

    scanf("%d %d %d %d", &a, &b, &c, &d);

    if (a < b) {

        if (a < c) {

            if (a < d) {

                min = a;

            }

            else {

                min = d;

            }
        }
        
    }

    if (b < a) {

        if (b < c) {

            if (b < d) {

                min = b;

            }

            else {

                min = d;

            }
        }
    }

    if (c < a) {

        if (c < b) {

            if (c < d) {

                min = c;
            }

            else {

                min = d;
            }
        }
    }

    if (d < a) {

        if (d < b) {

            if (d < c) {

                min = d;

            }

            else {

                min = c;
            }
        }
    }

    printf("%d", min);
}