#include <stdio.h>

/*

Assessment Exercise 3

Create a C program that accepts 2 property values, the first of 2022 and the second of 2023 and looks and displays the rate of increase or decrease of the values ​​as a percentage to one decimal place (%).

*/

int main(void) {

    double ap, tp, apo, tpo, kas;

    scanf("%lf,%lf %lf,%lf %lf", &ap, &tp, &apo, &tpo, &kas);

    printf("%.2lf", 100 - ((ap * tp) + (apo * tpo)));

}