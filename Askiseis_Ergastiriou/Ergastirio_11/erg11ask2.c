#include <stdio.h>

/*

Laboratory 11, Exercise 2.

What will appear from the following execution of the program?

Result :

*
**
***
****
*****
******
*******
********
*********

*/

int main(void) {

    int row, stars;

    row = 0;

    while (row < 10) {

        stars = row;

        while (stars > 0) {

            printf("*");

            stars = stars - 1;

        }

        printf("\n");

        row = row + 1;

    }

}