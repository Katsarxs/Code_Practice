#include <iostream> // Include the input/output stream library
#include <string> // Include the string library

/*

Assessment Exercise 3

Create a class that represents a student.
The student is described by first name, last name, registration number and 2 courses attended in the current semester.
To define the course you should define and use a class (Course) which represents a course.
A course is described by its course code, lab grade and final written exam grade.
The Course class should contain a function that calculates and returns the final grade of the course (40% lab grade + 60% final written exam grade).
The Student class should contain a constructor to initialize the first name, last name and registration number.
In addition, it should contain two functions, one for entering the data for each of the courses (code and grades) and one for displaying all the student's data as well as the final grade for each course.
In the main function define a Student object and display their elements as described in the following table.
The data comes from the standard input (stdin), i.e. from the user.

*/

using namespace std; // Use the standard namespace

class Course { // Define a class named Course

public:

    int codeNumber; // Public member variable to store course code number

    double scoreErg; // Public member variable to store workshop score

    double scoreFinal; // Public member variable to store final exam score

    Course(int cdn, double scrg, double scrf) { // Constructor for Course class

        codeNumber = cdn; // Initialize course code number

        scoreErg = scrg; // Initialize workshop score

        scoreFinal = scrf; // Initialize final exam score

    }

    double calcAndprintScore() { // Member function to calculate and print total score

        return (((40 * scoreErg) / 100) + ((60 * scoreFinal) / 100)); // Calculate and return total score

    }

};

class Student { // Define a class named Student

private:

    string first_name; // Private member variable to store student's first name

    string last_name; // Private member variable to store student's last name

    string registerId; // Private member variable to store student's registration ID

public:

    double one, two, three, four; // Public member variables to store course scores

    int cd1, cd2; // Public member variables to store course code numbers

    Student(string fnm, string lnm, string rgsd) { // Constructor for Student class

        first_name = fnm; // Initialize first name

        last_name = lnm; // Initialize last name

        registerId = rgsd; // Initialize registration ID

    }

    void inputData() { // Member function to input course data for the student

        cin >> cd1; // Input first course code

        cin >> one; // Input score for the first course's workshop

        cin >> two; // Input score for the first course's final exam

        cin >> cd2; // Input second course code

        cin >> three; // Input score for the second course's workshop

        cin >> four; // Input score for the second course's final exam
    }

    void showResult() { // Member function to display student's results

        Course crs1(cd1, one, two); // Create first Course object with input data

        Course crs2(cd2, three, four); // Create second Course object with input data

        cout << "To onoma tou foititi einai: " << first_name << " " << last_name << endl; // Output student's name

        cout << "o kwdikos tou: " << registerId << endl; // Output student's registration ID

        cout << "Ta stoixeia twn mathimatwn tou einai" << endl << endl; // Output course data header

        cout << "Kwdikos tou mathimatos: " << crs1.codeNumber << endl; // Output first course code

        cout << "Vathomologia ergastiriou: " << crs1.scoreErg << endl; // Output first course workshop score

        cout << "Vathomologia exetasis: " << crs1.scoreFinal << endl; // Output first course final exam score

        cout << "Teliki Vathmologia: " << crs1.calcAndprintScore() << endl << endl; // Output total score for first course

        cout << "Kwdikos tou mathimatos: " << crs2.codeNumber << endl; // Output second course code

        cout << "Vathomologia ergastiriou: " << crs2.scoreErg << endl; // Output second course workshop score

        cout << "Vathomologia exetasis: " << crs2.scoreFinal << endl; // Output second course final exam score

        cout << "Teliki Vathmologia: " << crs2.calcAndprintScore(); // Output total score for second course
    }

};

int main() { // Main function

    string n, l, k; // Declare variables to store name, last name, and registration ID

    cin >> n; // Input student's first name

    cin >> l; // Input student's last name

    cin >> k; // Input student's registration ID

    Student std1(n, l, k); // Create Student object with input data

    std1.inputData(); // Input course data for the student

    std1.showResult(); // Display student's results

    return 0; // Return 0 to indicate successful completion

}
