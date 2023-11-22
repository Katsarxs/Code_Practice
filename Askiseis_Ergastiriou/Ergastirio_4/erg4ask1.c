#include <stdio.h>
#include <math.h>

/*

Laboratory 4, Exercise 1.

A program that asks for the radius of a circle in centimeters and calculates and prints to the screen its perimeter and area respectively.
The formula for the circumference of the circle is 2*p*r, the area is p*r2, where r is the radius of the circle and p is the constant 3.14 (to be defined and used as a constant in the program as well).

*/

int main(void) {

    const float pi = 3.14;

    float r, perimetros, embadon;

    printf("r = ");

    scanf("%f", &r);

    perimetros = 2 * pi * r;

    embadon = pi * pow(r, 2);

    printf("Circumference : %f , Area : %f", perimetros, embadon);
    
}