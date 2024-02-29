#include <stdio.h>

/*

Laboratory 12, Exercise 1.

What will the following program display? Description of its function.

Result :

22 10

*/

int calc(int, int); // Definition of calc function.

int main(void) {

    int x = 2, y = 4; // Definition of x as 2 and y as 4.

    y = calc(y, x); // y = 2 * y + x = 2 * 4 + 2 = 10.
    
    x = calc(y, x); // x = 2 * y + x = 2 * 10 + 2 = 22.

    printf("%d %d\n", x, y); // Prints the final x and y.

}

int calc(int a, int b) {

    a = 2 * a + b; // The calculation.

    return a; // Returns the result.

}