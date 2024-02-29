#include <stdio.h>

/*

Laboratory 8, Exercise 1.

A program that reads a character from the keyboard and checks whether it is an uppercase or lowercase letter of the Latin alphabet by displaying a corresponding message.
If it is not a letter, displays a message.

*/

int main(void) {

    char a;

    printf("Enter Char : ");

    scanf("%c", &a);

    if (a >= 'A' && a<= 'Z') {

        printf("\nCapital Letter");

    }

    else if (a >= 97 && a <= 122) {

        printf("\nLowercase Letter");

    }

    else {

        printf("\nNot a Letter");
    }
}