#include <stdio.h>

/*

Laboratory 9, Exercise 2.

A program that prompts the user for an integer and then prints that number and the next 10 integers.

Input :

7
25

Output :

7 8 9 10 11 12 13 14 15 16 17
25 26 27 28 29 30 31 32 33 34 35

*/

int main(void) {

    int i, j;

    printf("Enter an integer : ");

    scanf("%d", &i);

    j = i + 10 ;

    while (i <= j) {

        printf("%d ", i);

        i++;

    }
}