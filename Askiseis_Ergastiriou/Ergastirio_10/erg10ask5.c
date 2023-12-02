#include <stdio.h>

/*

Laboratory 10, Exercise 5.

What does the following program display for input 7 -5 -22 4 0?

Result :

2

*/

int main(void) {

    int i, i_cnt = 0;

    while (1) {

        scanf("%d", &i);

        if (i < 0) {

            continue;

        }

        else if (i == 0) {

            break;

        }

        else {

            i_cnt++;

        }

    }

    printf("%d\n", i_cnt);

}