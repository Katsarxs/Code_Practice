#include <stdio.h>
#include <math.h>

/*

Laboratory 5, Exercise 1.

A program in C that reads the coordinates of 2 points (x1, y1) and (x2, y2) in the Cartesian plane and calculates and displays their distance.
The result should be exactly 3 decimal places.

Input :

2,3 10,9

Result :

10.000

*/

int main(void) {

    float x1, x2, y1, y2;

    printf("Write the coordinates : ");

    scanf("%f,%f %f,%f", &x1, &y1, &x2, &y2);

    printf("Distance : %.3f", sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)));

}
