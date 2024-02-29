#include <stdio.h>

/*

Laboratory 10, Exercise 1.

What will the following program display?

Result :

ALPHA-AEGEAN-ICSD-AEGEAN-ICSD-ZULU

*/

int main(void) {

    int a = -7, b = 5;

    for (printf("ALPHA"); a + b; printf("ICSD")) {

        a++;

        printf("-AEGEAN-");

    }

    printf("-ZULU");
    
}