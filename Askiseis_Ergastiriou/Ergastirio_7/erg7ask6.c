#include <stdio.h>

/*

Laboratory 7, Exercise 6.

A program that reads the prices of three products and uses the ternary operator ?: (ternary operator).
Display a message "Yes" if any of them costs more than €100 otherwise "No".

*/

int main(void) {

    float a, b, c;

    scanf("%f %f %f", &a, &b, &c);

    (a <=100 && b <= 100 && c <= 100) ? printf("Yes") : printf("No");

}