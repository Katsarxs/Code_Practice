#include <stdio.h>

/*

Laboratory 10, Exercise 4.

A program that simulates entering a pin at an ATM.
After the third failed attempt, the program should stop.

*/

int main(void) {

    const int pin = 4302;
    int input, i = 0;

    do {

        printf("Enter your PIN : ");

        scanf("%d", &input);

        if (input == pin) {

            printf("Welcome my friend.");

            break;

        }

        i += 1;
    }

    while (i < 3); 
    
}