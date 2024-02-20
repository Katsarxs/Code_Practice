#include <stdio.h>
#include <stdlib.h>

/*

Laboratory 13, Exercise 2.

A function that accepts 2 integers a and b as parameters.
The function generates 10 integers in the interval [-100, 100] and calculates and displays the minimum of those generated with a value in the interval [a, b].
If no integer occurs in the above interval display a message that none was found between [a, b].
Then we construct a program that reads 2 integers and calls the above function.
The program should check data so that the value of the first integer is less than the second.

*/

void min(int a, int b);

int main(void) {

    int i, j;

    printf("Enter first number: ");

    scanf("%d", &i);

    do {

        printf("Enter second number: ");

        scanf("%d", &j);

    } while(i >= j);

    min(i, j);

    return 0;

}

void min(int a, int b) {

    int i, min, num, first;

    srand(time(NULL));

    first = 0;

    for (i = 0; i < 10; i++) {

        num = rand()%201 - 100;

        printf("Created number: %d\n", num);

        if (num >= a && num <= b) {

            if (first == 0) {

                min = num;

                first = 1;

            }

            if (num < min) {

                min = num;

            }

        }

    }

    if (first == 0) {

        printf("\nNo number in [%d, %d]\n", a, b);

    }

    else {

        printf("\nMin = %d\n", min);

    }

}