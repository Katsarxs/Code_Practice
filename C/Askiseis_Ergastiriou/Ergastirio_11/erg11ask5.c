#include <stdio.h>

/*

Laboratory 11, Exercise 5.

A program that will print series of asterisks depending on the number selected by the user with execution as below:

Please insert number of rows: 6
*
**
***
****
*****
******

*/

int main(void) {

    int i, j, rows;

    printf("Please insert number of rows: ");

    scanf("%d", &rows);

    for (i = 1; i <= rows; i++) {

        for (j = 1; j <= i; j++)

            printf("*");

        printf("\n");

    }

}