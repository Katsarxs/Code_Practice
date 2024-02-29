#include <stdio.h>

/*

Laboratory 4, Exercise 3.

A program that reads a 4-digit number (we assume it only types four digits) and then displays only the first digit.

*/

int main(void) {

    int a;

    printf("Write 4 digits : ");

    scanf("%d", &a);

    printf("%d", a / 1000);
    
}