#include <stdio.h>
#include <math.h>

int main() {

    float a,b,c;

    //printf("Grapse a : ");
    scanf("%lf", &a);

    //printf("Grapse b : ");
    scanf("%lf", &b);

    //printf("Grapse c : ");
    scanf("%lf", &c);

    float d = ((pow(b, 2)) - (4*a*c));

    if (d>0) {

        float x1 = (((-b) + (sqrt(d))) / (2*a));

        float x2 = (((-b) - (sqrt(d))) / (2*a));

        printf("x1=%lf,x2=%lf", x1, x2);

    } else if (d == 0) {

        float x = ((-b) / (2*a));

        printf("x=%lf", x);

    } else {

        printf("Den exei lysi");

    }
}