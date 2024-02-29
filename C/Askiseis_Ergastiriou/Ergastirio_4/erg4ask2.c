#include <stdio.h>

/*

Laboratory 4, Exercise 2.

A program that reads the number of students who passed and failed the exam and displays the corresponding percentages (to two decimal places).
For example, if the user enters 12 and 8, the program should display:

Success: 60.00%
Failed: 40.00%

Input :

17 3

Result :

Success: 85.00%
Failed: 15.00%

*/

int main(void) {

    float a, b, petiximenoi, apotiximenoi;

    printf("Who passed and who not : ");

    scanf("%f %f", &a, &b);

    petiximenoi = (a * 100) / (a + b);

    apotiximenoi = (b * 100) / (a + b);

    printf("Success: %.2f%%\nFailed: %.2f%%", petiximenoi, apotiximenoi);

}