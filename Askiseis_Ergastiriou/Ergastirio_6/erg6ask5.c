#include <stdio.h>

/*

Laboratory 6, Exercise 5.

A program that calculates and displays the profit (the loss) in euros (2 decimal places) of a day of a KTEL bus.
It will accept the following information from the user:
    • The total kilometers traveled
    • The number of customers served
    • The cost per kilometer of fuel
The ticket cost is fixed at €4 per customer served. To the costs of the bus, the fixed costs of amortizing the purchase of the bus should be added which is 15 cents per kilometer traveled.

*/

int main(void) {

    float a, b, c, d, e;

    scanf("%f %f %f", &a, &b, &c);

    d = (b * 4);

    e = (a * c) + (a * 0.15);

    printf("%.2f", d - e);
    
}