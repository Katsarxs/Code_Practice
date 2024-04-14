#include <iostream> // Include the input/output stream library

using namespace std; // Use the standard namespace

// Define the number of grades as a macro constant
#define numGrades 5

// Define a class named Student
class Student {

private:

    // Declare a private array to store grades
    float grade[numGrades];

    // Declare private variables to store full name and register ID
    string fullName;
    int registerId;

public:

    // Constructor to initialize register ID and full name
    Student(int registerId1, string fullName2) {

        // Assign values to register ID and full name
        registerId = registerId1;
        fullName = fullName2;

    }

    // Method to read grades into the grade array
    void readArrays() {

        // Iterate over the array and read grades
        for (int i = 0; i < numGrades; i++) {

            cin >> grade[i]; // Read grade from standard input

        }

    }

    // Method to calculate and print results
    void calcAndprintResults() {

        // Declare variables to store sum, average, and result
        float sum = 0;
        string result;

        // Calculate sum of grades
        for (int i = 0; i < numGrades; i++) {

            sum += grade[i]; // Add grade to sum

        }

        // Calculate average grade
        float average = (sum / numGrades);

        // Determine result based on average grade
        if (average >= 5) {

            result = " Passed"; // Assign "Passed" if average is greater than or equal to 5

        }

        else {

            result = " Failed"; // Assign "Failed" if average is less than 5
        }

        // Print student's name and average grade
        cout << "Student's Name: " << fullName << endl;
        cout << "Average Grade: " << average << endl;

        // Print student's name and result
        cout << fullName << result << endl;

    }

};


// Main function
int main() {

    // Create 2 instances of the Student class
    Student s1(111, "Odysseas Lardopoulos");
    Student s2(222, "Persefoni Kontou");

    float grade[numGrades]; // Declare an array to store grades

    // Read grades into the array for student 1
    s1.readArrays();

    // Calculate and print results for student 1
    s1.calcAndprintResults();

    cout << endl;

    // Read grades into the array for student 2
    s2.readArrays();

    // Calculate and print results for student 2
    s2.calcAndprintResults();

    return 0; // Return 0 to indicate successful completion of program
}
