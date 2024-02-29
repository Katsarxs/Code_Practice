#include <stdio.h>

/*

Laboratory 11, Exercise 4.

A program that displays all numbers from 111 to 999, except those that start with 4 or end with 6.

Result is too big. I'm going to skip it.

*/

int main(void) {

    int base = 111;

    int final = 999;

    while (base < final) {

        if ((base%10) == 6 || (int)(base/100) == 4) {

            base += 1;

            continue;

        }

        else {

            printf("%d ", base);

            base += 1;

        }

    }

    printf("%d", final);

}