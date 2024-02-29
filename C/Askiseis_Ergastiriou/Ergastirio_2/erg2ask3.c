#include <stdio.h>

/*

Laboratory 2, Exercise 3.

What will the following program display if run?

Result :

Value of x is 0
Value of y is: 4.100000      
Value of y is: 4.10 (shorter)
Value of y is: 4.1000 (longer)

Value of z = 0

New value of z = -1

All variables: 3 4.100000 -1

*/

int main(void) {

    int x;
    
    printf("Value of x is %d\n", x);

    x = 3;

    float y = 4.1;

    printf("Value of y is: %f\n", y);

    printf("Value of y is: %.2f (shorter)\n", y);

    printf("Value of y is: %3.4f (longer)\n\n", y);

    int z;

    z = x / y;

    printf("Value of z = %d\n\n", z);

    z = x + z * y - y;

    printf("New value of z = %d\n\n", z);

    printf("All variables: %d %f %d\n   ", x, y, z);

    return 0;

}