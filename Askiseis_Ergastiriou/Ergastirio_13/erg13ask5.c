#include <stdio.h>

/*

Laboratory 13, Exercise 5.

A function named is_leap() which accepts as a parameter the number of a year and returns whether it is a leap year or not (with true-1 or false-0).
Then in the main program continuously asks the user to enter a year and answer if it is a leap year or not using the is_leap() function.
Year prompt to stop when user enters -1 for year.
Also, the system should allow years from 0 to 10000 and, otherwise, inform the user of a wrong year entry and ask again.

*/

int is_leap(int);

int main(void) {

    for (;;) {

        int x;

        scanf("%d", &x);

        if ((x < -1) || (x > -1 && x < 0) || (x > 10000)) {

            printf("Please insert a year between 0 and 10000\n");

            continue;

        }

        else if (x == -1) {
            
            exit(0);

        }

        else {

            printf("%d\n", is_leap(x));
        }
    }

}

int is_leap(int a) {

    if (a % 4 == 0) {

        return 1;

    }

    else if (a % 4 != 0) {

        return 0;

    }
}