#include <stdio.h>

/*

Laboratory 9, Exercise 4.

A program that continuously reads integers and calculates their sum until it exceeds 100.
Then the program displays their sum and how many numbers the user entered.

*/

int main(void) {

    int i = 0, a = 0, b = 0;

    do {

        printf("Enter number : ");

        scanf("%d", &b);

        a += b;

        i += 1;

    } while (a < 100);

    printf("Addition : %d\n", a);

    printf("Numbers Entered : %d", i);
    
}