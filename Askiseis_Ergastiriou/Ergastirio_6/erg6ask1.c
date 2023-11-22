#include <stdio.h>

/*

Laboratory 6, Exercise 1.

A program that accepts 3 student scores and calculates their average.
If the average grade is more than 5, displays the message "Average grade more than 5".

*/

int main() {

    float a, b, c;

    int average_score;

    printf("Enter 3 scores : ");

    scanf("%f %f %f", &a, &b, &c);

    average_score = (a + b +c) / 3;

    (average_score > 5) ? printf("Average grade more than 5") : printf("None") ;
    
}