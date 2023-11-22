#include <stdio.h>

/*

Laboratory 2, Exercise 2.

A program that calculates the product of 3 integers. The result should be displayed on the screen in the form shown below.

Test :

First Integer : 7
Second Integer : 5
Third Integer : 2

Result :

Product is: 70

*/

int main(void) {

    int a, b, c, calc;

    a = 7;

    b = 5;

    c = 2;

    calc = a * b * c;

    printf("Product is: %d", calc);
    
}