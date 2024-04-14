#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 17, Exercise 3.

The errors in the following code sections:

a)

int main(void) {

    int x, *p;

    x = 20;

    *p = x; // The pointer p does not point to the address of a variable.
    
}

b)

int main(void) {

    int x, *pl;

    x = 20;

    pl = x; // Pointer p1 must be assigned a memory address, not a value.

}

*/