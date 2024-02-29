#include <stdio.h>

/*

Laboratory 14, Exercise 1.

What will the following program display?

*/

int main (void) {

    int a[10] = {3, 2, 25, 7, 33, 4, 8, 10, 5, 6}, i, c1 = 0, c2 = 0;

    for (i = 0; i < 10; i ++) {

        if (a[i] % 2 != 0) {

            c1++;

        }

        if (a[i] >= 5) {

            c2++;

        }

        printf("%d %d\n\n", c1, c2);

        for (i = 9; i >= 0; i--) {

            if (a[i] % 2 == 0) {

                printf("%d %d\n", i, a[i]);

            }

        }

    }
    
}