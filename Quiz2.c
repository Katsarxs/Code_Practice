#include <stdio.h>

int main() {

    double x1, x2;

    scanf("%lf %lf", &x1, &x2);

    printf("%.1lf%%", ((x2 - x1) / x1) * 100);

}