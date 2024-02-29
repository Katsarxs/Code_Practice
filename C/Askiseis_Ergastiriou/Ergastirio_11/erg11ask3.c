#include <stdio.h>

/*

Laboratory 11, Exercise 3.

A program that continuously reads an integer and displays the word ICSD as many times as the value of the integer.
If the user enters a negative number, the input of integers should stop and the program should display the total number of ICSDs that appeared on the screen.

*/

int main(void) {

    int a, b;

    char word[] = "ICSD";

    while (1) {

        scanf("%d", &a);

        
        if (a > 0) {

            while (a > 0) {

                printf("%s\n", word);

                a -= 1;

                b += 1;

            }

        }

        else if (a == 0) {

            printf("Eisai okey??");

            break;

        }

        else {

            printf("The word ICSD appeared %d times.", b);

            break;

        }

    }

}