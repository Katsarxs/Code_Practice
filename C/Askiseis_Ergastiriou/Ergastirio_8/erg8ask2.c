#include <stdio.h>

/*

Laboratory 8, Exercise 2.

A program that simulates the operation of the 4 basic operations calculator.
The program should read the symbol of the arithmetic operation and 2 integers and display the result of the operation.
With the help of switch function.

*/

int main(void) {

    char a;

    int b, c;

    printf("Enter two integers : ");

    scanf("%d %d", &b, &c);

    printf("Enter math operation : ");

    scanf("%s", &a);

    switch(a) {

        case '+' : printf("Result : %d", b + c);

            break;

        case '-' : printf("Result : %d", b - c);

            break;

        case '*' : printf("Result : %d", b * c);

            break;

        case '/' : printf("Result : %f", (float)(b / c));

            break;

        default : printf("Something Went Wrong");

            break;

    }
}