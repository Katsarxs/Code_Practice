#include <stdio.h>

int main() {

    double ap, tp, apo, tpo, kas;

    scanf("%lf,%lf %lf,%lf %lf", &ap, &tp, &apo, &tpo, &kas);

    printf("%.2lf", 100 - ((ap * tp) + (apo * tpo)));
}