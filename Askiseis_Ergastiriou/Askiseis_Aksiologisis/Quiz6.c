#include <stdio.h>

int main (void) {

    int x, y, z, t = 1000, i = 0;

    printf("PUT MONEY (PUSH 1)\nPULL MONEY (PUSH 2)\nUPDATE REST (PUSH 3)\n");

    while (i <= 3) {

        scanf("%d", &x);

        if (x == 2345) {

            scanf("%d", &y);

            if (y == 1) {

                scanf("%d", &z);

                printf("%d", t + z);

                break;

            }

            if (y == 2) {

                scanf("%d", &z);

                printf("%d", t - z);

                break;

            }

            if (y == 3) {

                printf("%d", t);

                break;

            }

            break;

        }

        if (i == 2) {

            printf("Wrong pin 3 times. Card withheld");

            break;

        }

        else {

            i = i + 1;

        }

    }
    
}