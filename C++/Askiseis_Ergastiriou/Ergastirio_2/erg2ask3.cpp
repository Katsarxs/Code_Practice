#include <iostream> // Including the input-output stream header file
#include <string> // Including the string header file

using namespace std; // Using the standard namespace

class creditCard { // Defining a class named creditCard

private:

    string creditCardId; // Declaring a private string variable to store credit card ID

    string nameofCardOwner; // Declaring a private string variable to store the name of the card owner

    float creditCardCashLimit; // Declaring a private float variable to store the credit card cash limit

    int creditAmount; // Declaring a private integer variable to store the credit amount

public:

    void getCreditCardData() { // Defining a public member function to get credit card data

        cout << "Enter Name : "; // Prompting the user to enter the name

        cin >> nameofCardOwner; // Reading the name of the card owner from the user

        cout << "Enter Credit Card Number : "; // Prompting the user to enter the credit card number

        cin >> creditCardId; // Reading the credit card number from the user

        cout << "Enter Cash Limit : "; // Prompting the user to enter the cash limit

        cin >> creditCardCashLimit; // Reading the cash limit from the user

    }

    void calculateCreditAmount() { // Defining a public member function to calculate credit amount

        if (creditCardCashLimit >= 1750) { // Checking if the cash limit is greater than or equal to 1750

            creditAmount = 1750; // Setting the credit amount to 1750

        }

        else if (creditCardCashLimit >= 750 && creditCardCashLimit < 1750){ // Checking if the cash limit is between 750 and 1750

            creditAmount = 750; // Setting the credit amount to 750
        }

        else if (creditCardCashLimit < 750) { // Checking if the cash limit is less than 750

            creditAmount = 0; // Setting the credit amount to 0
        }

    }

    void showCreditAmount() { // Defining a public member function to display the credit amount

        cout << "Credit Amount: " << creditAmount; // Displaying the credit amount

    }

};

int main() { // Defining the main function

    creditCard card1; // Creating an object of class creditCard

    card1.getCreditCardData(); // Calling the function to get credit card data

    card1.calculateCreditAmount(); // Calling the function to calculate credit amount

    card1.showCreditAmount(); // Calling the function to display the credit amount

    return 0; // Returning 0 to indicate successful execution

}
