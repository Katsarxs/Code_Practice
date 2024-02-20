#include <stdio.h>

/*

Laboratory 15, Exercise 6.

A program that will read an integer from the keyboard and print it in its binary form using integer division and multiplication by 2.
For example, if the user enters the integer 22 the program should display: 10110 .

*/

#define BITS 32 // Size of the array in bits

int main(void) {

    int num;

    // Read an integer from the user

    printf("Enter an integer: ");

    scanf("%d", &num);

    int binary[BITS]; // Array to store the binary representation of the number

    int i = 0;

    // Convert the number to binary

    while (num > 0) {

        binary[i] = num % 2;

        num /= 2;

        i++;

    }

    // Print the binary representation, reversed since we stored it in the array

    printf("Binary representation: ");

    for (int j = i - 1; j >= 0; j--) {

        printf("%d", binary[j]);

    }

    puts("");

}