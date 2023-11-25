#include <stdio.h>
#include <math.h>

float get_bmi(float, int), print_status(float);

float a, height;

int weight;

int main(void) {

    do {

        scanf("%f %d", &height, &weight);

        if (height == 0 || weight == 0) {

            break;
            
        }

        a = get_bmi(height, weight);

        print_status(a);

    } while(1);
    

}

float get_bmi(float height, int weight) {

    float x = (weight / pow(height, 2));

    return x;

}

float print_status(float y) {

    if (y < 18.5) {

        printf("Ellipovares\n");

    }

    else if (y >= 18.5 && y < 25) {

        printf("Fysiologiko\n");

    }

    else if (y >= 25 && y < 30) {

        printf("Ypervaro\n");

    }

    else if (y >= 30){

        printf("Pachysarko\n");

    }

}