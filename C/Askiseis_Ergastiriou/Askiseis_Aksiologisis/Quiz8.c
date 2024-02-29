#include <stdio.h> // Include standard input/output library.

/*

Assessment Exercise 8

Write a function with signature: float get_tax(int ​​region, char type, float price) which has 3 parameters, the region code, the VAT rate code (character 'N', 'R' or 'L' and the value of a product and returns the tax for the product (product price x VAT rate).The following table is given for the VAT rate:

Area code Normal rate (N) Reduced rate (R) Overrated rate (L)
16        24%             13%              6%
57        24%             13%              6%
41        24%             13%              6%
83        17%             9%               4%
85        17%             9%               4%
81        17%             9%               4%

*/

float get_tax(int, char, float); // Function prototype for get_tax.

/*

int main(void) {

    printf("%.2f\n", get_tax(16, 'N', 100.00));

    printf("%.2f\n", get_tax(83, 'N', 50.00));

    printf("%.2f\n", get_tax(85, 'L', 80.50));

    printf("%.2f\n", get_tax(57, 'R', 70.00));
}

*/

float get_tax(int region, char type, float price) {

    float x; // Variable to hold VAT rate.

    float tax; // Variable to hold calculated tax amount.

    // Determine VAT rate based on region and type.

    if (region == 16 || region == 57 || region == 41) { // For regions 16, 57, and 41.

        if (type == 'N') { // For normal rate.

            x = 0.24; // Set VAT rate.

        }

        else if (type == 'R') { // For reduced rate.

            x = 0.13; // Set VAT rate.

        }

        else if (type == 'L') { // For overrated rate.

            x = 0.06; // Set VAT rate.

        }

    }

    else if (region == 83 || region == 85 || region == 81) { // For regions 83, 85, and 81.

        if (type == 'N') { // For normal rate.

            x = 0.17; // Set VAT rate.

        }

        else if (type == 'R') { // For reduced rate.

            x = 0.09; // Set VAT rate.

        }

        else if (type == 'L') { // For overrated rate.

            x = 0.04; // Set VAT rate.
            
        }
    }

    tax = price * x; // Calculate tax amount.

    return tax; // Return calculated tax amount.

}