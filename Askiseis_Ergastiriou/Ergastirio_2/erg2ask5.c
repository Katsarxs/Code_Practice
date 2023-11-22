#include <stdio.h>

/*

Laboratory 2, Exercise 5.

A program in which we will define a variable named r (of floating point type) and give it a value of our own (eg 5.62).
Also, we define a variable named perimetros to which the result of calculating the perimeter of a circle with radius r is assigned.
The perimeter of a circle is calculated from the expression 2*p*r. Display the perimeter value on the screen to 2 decimal places.

Test :

r = 5.62

Result :

Circumference is: 35.29

*/

int main(void) {

    float r, perimetros;

    const float pi = 3.14;

    r = 5.62;

    perimetros = 2 * pi * r;

    printf("Circumference is: %.2f", perimetros);

}