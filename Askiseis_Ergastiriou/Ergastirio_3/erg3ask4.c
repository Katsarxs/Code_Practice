#include <stdio.h>

/*

Laboratory 3, Exercise 4.

A program that reads an integer and a real number and displays three times their sum.

Test :

Enter numbers: 1 4.222223

Input :

1 4.222223

Result :

Enter numbers: 15.666669

*/

int main(void) {

    int i;
    
    double j;

    printf("Enter numbers: ");

    scanf("%d %lf", &i, &j);

    printf("Enter numbers: %lf", (i + j) * 3);

}