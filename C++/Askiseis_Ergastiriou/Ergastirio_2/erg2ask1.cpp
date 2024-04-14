#include <iostream> // Include the input/output stream library
#include <string> // Include the string library

using namespace std; // Use the standard namespace

class studentClass { // Define a class called studentClass

private:

    string firstName; // Declare a private string variable for the first name

    string lastName; // Declare a private string variable for the last name

    int registrationID; // Declare a private integer variable for the registration ID

    float hisScore; // Declare a private float variable for the score

    string scoreSymbol; // Declare a private string variable for the score symbol

public:

    void getStudentData() { // Define a function to get student data

        cout << "Enter First Name : "; // Prompt the user to enter the first name

        cin >> firstName; // Read the input for the first name

        cout << "Enter Last Name : "; // Prompt the user to enter the last name

        cin >> lastName; // Read the input for the last name

        cout << "Enter Registration ID : "; // Prompt the user to enter the registration ID

        cin >> registrationID; // Read the input for the registration ID

        cout << "Enter Score : "; // Prompt the user to enter the score

        cin >> hisScore; // Read the input for the score

    }

    void getScoreResult() { // Define a function to get the score result

        if (hisScore >= 9.0) { // Check if the score is greater than or equal to 9.0

            scoreSymbol = "A"; // Assign 'A' to the score symbol if the condition is true

        }

        else if (hisScore >= 7.0 && hisScore < 9.0) { // Check if the score is between 7.0 and 9.0

            scoreSymbol = "B"; // Assign 'B' to the score symbol if the condition is true

        }

        else { // If none of the above conditions are true

            scoreSymbol = "C"; // Assign 'C' to the score symbol

        }

    }

    void showScore() { // Define a function to show the score

        cout << "Student " << firstName << " " << lastName << " with registration ID " << registrationID << " wrote : " << scoreSymbol << endl; // Display the student's information and score symbol

    }

};

int main() { // Define the main function

    studentClass student1; // Create an object of the studentClass

    student1.getStudentData(); // Call the function to get student data

    student1.getScoreResult(); // Call the function to get the score result

    student1.showScore(); // Call the function to show the score

}
