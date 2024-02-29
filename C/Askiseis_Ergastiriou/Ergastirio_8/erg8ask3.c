#include <stdio.h>

/*

Laboratory 8, Exercise 3.

A program that asks for a taxpayer's income and calculates and displays the tax according to the following:
If the income is up to €12000 the tax will be 0.
If the income is over €12000 up to €20000 the tax will be 10%.
If the income is over €20,000 to €30,000, the tax will be 20%.
If the income is over €30,000 the tax will be 35%.

*/

int main(void) {

    float a;

    printf("Enter your income : ");

    scanf("%f", &a);

    if (a <= 12000) {

        printf("Tax : 0");

    }

    else if (a > 12000 && a <= 20000) {

        printf("Tax : %.f", a * 0.1);

    }

    else if (a > 20000 && a <= 30000) {

        printf("Tax : %.f", a * 0.2);

    }

    else if (a > 30000) {

        printf("Tax : %.f", a * 0.35);

    }
}