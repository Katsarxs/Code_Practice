#include <stdio.h>

/*

Laboratory 6, Exercise 2.

A program in C that accepts 3 student grades and in the case that all grades are passable (i.e. from 5 and above) displays "Everyone passed!".

*/

int main() {

    float a, b, c;

    int average_score;

    printf("Enter 3 scores : ");

    scanf("%f %f %f", &a, &b, &c);

    ((a >= 5) == (b >= 5) == (c >= 5)) ? printf("Everyone passed!") : printf("None");
    
}