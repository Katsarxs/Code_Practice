#include <stdio.h>

/*

Assessment Exercise 6

Write a program that simulates an ATM transaction as follows:

It will initially display a menu of options for the following functions:
Deposit money (press 1)
Withdraw money (press 2)
Update balance (press 3)

Represent the PIN as a constant and have the value 2345
The remaining amount of the account should be represented by a variable and be 1000€.
For authentication you can use the code from exercise 4 of the project. 10 which has already been implemented.
As long as the PIN is correct the program will proceed to the options menu above and execute the transaction.
In every transaction to inform the user about the balance of the account after the transaction.

*/

int main(void) { // Main function where the program execution begins.

    int x, y, z, t = 1000, i = 0; // Declare variables for PIN entry, menu option, transaction amount, account balance, and counter for wrong attempts.

    printf("PUT MONEY (PUSH 1)\nPULL MONEY (PUSH 2)\nUPDATE REST (PUSH 3)\n"); // Display menu options.

    while (i <= 3) { // Start loop for PIN entry, with a maximum of 3 attempts.

        scanf("%d", &x); // Read PIN entered by the user.

        if (x == 2345) { // Check if the entered PIN is correct.

            scanf("%d", &y); // Read the chosen menu option.

            if (y == 1) { // If the user wants to deposit money.

                scanf("%d", &z); // Read the amount to be deposited.

                printf("%d", t + z); // Print the updated account balance after depositing.

                break; // End the loop.

            }

            if (y == 2) { // If the user wants to withdraw money.

                scanf("%d", &z); // Read the amount to be withdrawn.

                printf("%d", t - z); // Print the updated account balance after withdrawing.

                break; // End the loop.

            }

            if (y == 3) { // If the user wants to update balance.

                printf("%d", t); // Print the current account balance.

                break; // End the loop.

            }

            break; // End the loop.

        }

        if (i == 2) { // If the maximum number of PIN attempts is reached.

            printf("Wrong pin 3 times. Card withheld"); // Display message about withholding the card.

            break; // End the loop.

        }

        else { // If the entered PIN is incorrect but attempts remain.

            i = i + 1; // Increment the attempt counter.

        }

    }

}