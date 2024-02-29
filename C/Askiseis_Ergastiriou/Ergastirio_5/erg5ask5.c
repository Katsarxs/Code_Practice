#include <stdio.h>

/*

Laboratory 5, Exercise 5.

A program in C that accepts 2 real values ​​and displays the smaller of them without if statement.

Input :

4 5

Result :

4

*/

int main(void) {

    int i, j;

    printf("Enter 2 number : ");

    scanf("%d %d", &i, &j);

    printf("%d", (i < j) ? i : j);

}