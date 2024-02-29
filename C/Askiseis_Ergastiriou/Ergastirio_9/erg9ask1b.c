#include <stdio.h>

/*

Laboratory 9, Exercise 1b.

A program that displays the integers from 0 to 10.
With the while function.

Result :

0
1
2
3
4
5
6
7
8
9
10

*/

int main(void) {

    int a = 0;

    while (a <= 10) {

        printf("%d\n", a );

        a += 1;
        
    }
    
}