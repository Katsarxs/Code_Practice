#include <stdio.h>
#include <math.h>

/*

Laboratory 7, Exercise 3.

A program that accepts weight in kilograms and height in meters and calculates a person's body mass index (BMI).
Displays the clinical nutrition assessment, depending on the input data, with one of the following messages:

For BMI <19: Underweight
For BMI 19 to 25: Normal weight
For a BMI of 25 to 30: Overweight
For BMI from 30 to 35: Obese
For BMI of 35 and above: Severe obesity

*/

int main(void) {

    float a, y;

    int b;

    printf("Enter Height : ");

    scanf("%f", &a);

    printf("Enter Weight : ");

    scanf("%d", &b);

    y = b / pow(a, 2);

    if (y < 19) {

        printf("Underweight\n");

    }

    else if (y >= 19 && y < 25) {

        printf("Normal weight\n");

    }

    else if (y >= 25 && y < 30) {

        printf("Overweight\n");

    }

    else if (y >= 30 && y < 35){

        printf("Obese\n");

    }

    else if (y >= 35) {

        printf("Severe obesity\n");
        
    }
}