#include <stdio.h>

/*

Laboratory 13, Exercise 3.

What will the following program display on the screen?

Result :

4
5
6
7
8
9
10
11
12
13
14
15
16
17
18

*/

int x = 10;

void out1();

void out2();

void out3();

int main (void) {

    int i;

    for (i = 1; i <= 5; i++) {

        out1();

    }

    for (i = 1; i <= 5; i++) {

        out1();
        
    }

    for (i = 1; i <= 5; i++) {

        out1();
        
    }

    return 0;

}

void out1() {

    static int x = 4;

    printf("%d\n", x++);

}

void out2() {

    static int x;

    printf("%d\n", x++);

}

void ou3() {

    printf("%d\n", x++);

}