#include <stdio.h>

float get_tax(int, char, float);

/*int main(void) {

    printf("%.2f\n", get_tax(16, 'N', 100.00));

    printf("%.2f\n", get_tax(83, 'N', 50.00));

    printf("%.2f\n", get_tax(85, 'L', 80.50));

    printf("%.2f\n", get_tax(57, 'R', 70.00));
}

*/

float get_tax(int region, char type, float price) {

    float x;

    float tax;

    if (region == 16 || region == 57 || region == 41) {

        if (type == 'N') {

            x = 0.24;

        }

        else if (type == 'R') {

            x = 0.13;

        }

        else if (type == 'L') {

            x = 0.06;


        }

    }

    else if (region == 83 || region == 85 || region == 81) {

        if (type == 'N') {

            x = 0.17;

        }

        else if (type == 'R') {

            x = 0.09;

        }

        else if (type == 'L') {

            x = 0.04;


        }

    }

    tax = price * x;

    return tax;

}