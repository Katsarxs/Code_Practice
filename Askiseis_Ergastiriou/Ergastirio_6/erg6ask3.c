#include <stdio.h>
#include <math.h>

/*

Laboratory 6, Exercise 3.

A program that asks the user for an integer.
If the number is three digits, displays the sum of its three digits, otherwise displays "Wrong number..."

needs fixes...

*/

int main() {

    int a;

    printf("Enter an integer of 3 digits : ");

    scanf("%d", &a);

    printf("%d", (floor(log10(a)) + 1));
}