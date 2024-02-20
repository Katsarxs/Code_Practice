#include <stdio.h>

/*

Laboratory 15, Exercise 2.

a program that will read 50 student scores (integers 0-10) and display a bar graph with asterisks for each of the scores. Example output:

Grade Frequency
0     **
1     *
...
5     ******
...
9     ****
10    ***

*/

#define NUM_GRADES 50

int main(void) {

    int grades[NUM_GRADES];

    int frequency[11] = {0}; // Frequency array initialized to 0s
    
    // Reading grades from user

    printf("Enter %d grades (0-10):\n", NUM_GRADES);

    for (int i = 0; i < NUM_GRADES; i++) {

        do {

            printf("Grade %d: ", i + 1);

            scanf("%d", &grades[i]);

        } while (grades[i] < 0 || grades[i] > 10); // Validity check

        frequency[grades[i]]++; // Increase frequency for this grade

    }
    
    // Displaying the histogram

    printf("\nGrade\tFrequency\n");

    for (int i = 0; i <= 10; i++) {

        printf("%d\t", i);

        for (int j = 0; j < frequency[i]; j++) {

            printf("*");

        }

        printf("\n");

    }

}