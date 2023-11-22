#include <stdio.h>

/*

Laboratory 4, Exercise 4.

A program that reads a five digit number (we assume it always types a 5 digit), then prints it vertically on the screen.
For example if the number 75943 is entered, displays:

7
5
9
4
3

*/

int main(void) {

    int a;

    printf("Write 5 digits : ");

    scanf("%d", &a);

    printf("%d\n%d\n%d\n%d\n%d", a / 10000, (a % 10000) / 1000, (a % 1000) / 100, (a % 100) / 10, a % 10);

}