#include <stdio.h>

/*

Laboratory 3, Exercise 3.

A program in C that declares 2 real variables i and j, values ​​(eg 2.53 and 7.25) and transposes their integer parts.
For example, the value of i should be 7.53 and j should be 2.25.

Result :

i = 7.53 , j = 2.25

*/

int main(void) {

    float i, j, dekadikos, neoi, neoj;

    i = 2.53;

    j = 7.25;
    
    neoi = (int)j + (i - (int)i);

    neoj = (int)i + (j - (int)j);

    printf("i = %.2f , j = %.2f", neoi, neoj);

}