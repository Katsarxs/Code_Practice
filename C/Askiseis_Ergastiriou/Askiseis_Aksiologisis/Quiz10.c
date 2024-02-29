#include <stdio.h> // Include standard input/output library.

/*

Assessment Exercise 10

Implement a program in C that reads 10 student grades (float grades) and stores them in a table. If for some score the value it receives is not in the interval [0.0, 10.0] display a message and read again until a correct score is given.
At the end the program should display,
a) the average of the scores (to one decimal place);
b) the number of scores that were higher than the average and
c) to search if there is a score of 10 and the position it was found in the table. If there is more than one 10, display the position of the last one in the table. If there is no 10 to display message: “No grades having 10”.

*/

int main(void) { // Main function where the program execution begins.

    int i, average_grades = 0, table[10], is_there_ten, position; // Declare variables for loop control, average calculation, storing grades, and checking for the presence of a grade of 10.

    float grade, all_grades = 0, average_grade; // Declare variables for individual grade, total grades, and average grade.

    for (i = 0; i < 10;) { // Loop to read and validate grades for 10 students.

        printf("Enter Grade : "); // Prompt the user to enter a grade.

        scanf("%f", &grade); // Read the grade input.

        if (grade < 0 || grade > 10) { // Check if the grade is outside the valid range.

            continue; // Skip to the next iteration if the grade is invalid.

        }

        if (grade == 10) { // Check if the grade is 10.

            is_there_ten = 1; // Set flag indicating presence of grade 10.

            position = i; // Record the position of grade 10.

        }

        all_grades += grade; // Add the grade to the total.

        table[i] = grade; // Store the grade in the table.

        i++; // Move to the next student.

    }

    average_grade = (all_grades / 10); // Calculate the average grade.

    for (i = 0; i < 10;) { // Loop to count grades above average.

        if (table[i] >= average_grade) { // Check if the grade is above or equal to the average.

            average_grades++; // Increment the count of grades above average.

        }

        i++; // Move to the next grade.

    }

    printf("\nAverage of grades: %.1f", average_grade); // Print the average grade.

    printf("\nGrades above average: %d", average_grades); // Print the count of grades above average.

    if (is_there_ten == 1) { // Check if grade 10 was found.

        printf("\nPosition of grade 10: %d", position); // Print the position of grade 10.

    }

    else { // If grade 10 was not found.

        printf("\nNo grades having 10"); // Print a message indicating no grade of 10 was found.

    }

}