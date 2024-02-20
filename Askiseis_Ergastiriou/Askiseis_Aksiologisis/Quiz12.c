#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 10
#define M 6
#define P 12

int main(void) {

    int i, j, code_input;

    scanf("%d", &code_input);

    int arr1[N][M] = {

        {15, 20, 12, 8, 7, 0},
        {15, 14, 13, 9, 15, 10},
        {20, 15, 20, 2, 10, 18},
        {4, 2, 20, 9, 2, 15},
        {9, 7, 15, 7, 1, 16},
        {3, 20, 17, 20, 12, 15},
        {15, 1, 0, 16, 10, 12},
        {12, 9, 0, 8, 10, 20},
        {11, 14, 11, 12, 11, 18},
        {6, 5, 6, 20, 7, 3}

    };

    int arr2[N][M] = {

        {7, 2, 1, 11, 5, 10},
        {20, 7, 4, 18, 2, 15},
        {7, 15, 8, 19, 14, 18},
        {0, 12, 18, 11, 2, 9},
        {12, 2, 7, 8, 6, 3},
        {15, 20, 1, 20, 18, 0},
        {2, 4, 8, 5, 8, 15},
        {0, 13, 11, 20, 2, 7},
        {4, 11, 7, 12, 10, 4},
        {12, 0, 17, 13, 20, 13}

    };

    int code[N] = {9987, 8830, 4217, 9448, 7509, 3916, 8746, 9951, 6394, 2099};

    int arr[10][12];

    for (i = 0; i < N; i++) {

        for (j = 0; j < M; j++) {

            arr[i][j] = arr1[i][j];

        }
        
    }

    for (i = 0; i < N; i++) {

        for (j = M; j < P; j++)
        {
            arr[i][j] = arr2[i][j - 6];

        }
        
    }

    int sum = 0;

    for (i = 0; i < N; i++) {

        for (j = 0; j < P; j++) {

            // printf("%d ", arr[i][j]);

            sum += arr[i][j];

        }
        
    }

    printf("Q1: %d", sum);

    int line;

    int found = 0;

    for (i = 0; i < N; i++) {
        
        if (code[i] == code_input) {
            
            found = 1;

            line = i;
        
            break;

        }

    }

    if (found)  {

        int max, maxi[0];

        for (j = 0; j < P; j++) {
            
            if (arr[line][j] > maxi[0]) {
                
                max = j;

                maxi[0] = arr[line][j]; 

            }
        
        }

        printf("\nQ2: %d", max + 1);

    }
    
    else {
        
        printf("\nQ2: Book not found");
    
    }
    
}