#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*

Laboratory 7, Exercise 2.

A program that reads a number from the user and displays its absolute value.
In case the user enters an integer, the result should be displayed without decimal places.

Input :

25
2.34
-5.5

Result :

25
2.340000
5.500000

FIXESSSSSSSSSSSSSSSS

*/

int main(void) {

    double a;

    scanf("%lf", &a);

    a = abs(a);

    printf("%.lf", a); // ?????
}