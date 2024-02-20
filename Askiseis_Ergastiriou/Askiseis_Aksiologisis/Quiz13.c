#include <stdio.h>
#include <stdlib.h>

float average(int *marks,int n);

int main(void) {
    int *marks, n,i;
    printf("How many numbers are you gonna insert?: ");
    scanf("%d", &n);

    marks=malloc(sizeof(int)*n);

    for (i=0;i<n;i++){

        printf("grapse to stoixio gia tin thesi %i \n",i);
        scanf("%i",&marks[i]);

    }


    printf("Average of the inserted numbers is: %f",average(marks,n));


    free(marks);
    return 0;
}

float average(int *marks,int n){

    float sum=0;
    int i;

    for (i=0;i<n;i++){

        sum+=marks[i];
    }


    return sum/n;
}