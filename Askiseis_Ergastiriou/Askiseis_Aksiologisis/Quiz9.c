#include <stdio.h>

int main(void) {

    float myArray[10];

    int i, x = 0, y = 0;

    for (i = 0; i < 10; i++) {

        float a;

        scanf("%f", &a);

        myArray[i] = a;

        if (a >= 5) {

            x += 1;

        }

        else {

            y += 1;

        }

    }

    printf("No of students passed: %d\n", x);

    printf("No of students failed: %d", y);

}