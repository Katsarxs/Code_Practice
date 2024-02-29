#include <stdio.h>

/*

Laboratory 9, Exercise 5.

A program that reads two numbers that correspond to miles (let be variables a and b) and a third number (let be variable step).
The program should display in one column the miles and in a second column the corresponding kilometers starting from the first number (a) to the second number (b, assuming that a < b) with a step the third number (e.g. step).

*/

int main(void) {

    float a, b, c, d;

    scanf("%f %f %f", &a, &b, &c);

    printf("MILE\tKLM\n------------\n");

    d = a;

    do {
        
        printf("%.2f\t%.2f\n", d, d * 1.6);

        d += c;

    } while(d <= b);

}