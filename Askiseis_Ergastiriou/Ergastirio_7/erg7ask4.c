#include <stdio.h>

/*

Laboratory 7, Exercise 4.

A program that reads three integers, and if the sum of any pair is equal to the third integer, displays those of them that have a value in the interval [0, 10].
Otherwise, reads three more integers and displays those that are multiples of 6 or different from 20.

*/

int print_ifin_range(int), print_if_othershit(int);

int main(void) {

    int a, b, c, d, e, f;

    scanf("%d %d %d", &a, &b, &c);

    if (a + b == c || b + c == a || a + c == b) {

        print_ifin_range(a);
        print_ifin_range(b);
        print_ifin_range(c);
        
    }

    else {

        scanf("%d %d %d", &d, &e, &f);

        print_if_othershit(d);
        print_if_othershit(e);
        print_if_othershit(f);
    }
}

int print_ifin_range(int x) {

    if (x >= 0 && x <= 10) {

        printf("%d\n", x);

    }

    else {

        printf("");

    }
}

int print_if_othershit(int x) {

    if (x % 6 == 0 || x != 20) {

        printf("%d\n", x);

    }

    else {

        printf("");

    }
}