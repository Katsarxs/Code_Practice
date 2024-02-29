#include <stdio.h>

/*

Laboratory 10, Exercise 3.

What will the following program display?

Result :

10
11
12

*/

int main(void) {

    short i = 10, i_cnt = 0;

    for(;;) {

        printf("%d\n", i);

        i++;

        i_cnt++;

        if (i_cnt == 3) {

            break;

        }

    }

}