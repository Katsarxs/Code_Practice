#include <stdio.h>

int main() {

    float a;

    printf("Bale arithmo : ");

    scanf("%f", &a);

    if (a <= 10) {

        printf("%.2f", (a * 0.02));
    }

    else if (a >= 10 && a <= 60) {

        printf("%.2f", (0.2 + ((a - 10) * 0.025)));

    }

    else if (a >= 60 && a <= 160) {

        printf("%.2f", (1.45 + ((a - 60) * 0.03)));

    }

    else if (a > 160) {

        printf("%.2f", (4.45 + ((a - 160) * 0.04)));

    }

    
}