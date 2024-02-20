#include <stdio.h>
#define rows 3
#define colums 3

int main(void) {

    int table1[rows][colums], table2[rows][colums], i, j, table3[rows][colums];

    for (i = 0; i < rows; i++) {

        for (j = 0; j < colums; j++) {

            scanf("%d", &table1[i][j]);

        }

    }

    for (i = 0; i < rows; i++) {

        for (j = 0; j < colums; j++) {

            scanf("%d", &table2[i][j]);

        }

    }

    for (i = 0; i < rows; i++) {

        for (j = 0; j < colums; j++) {

            table3[i][j] = table1[i][j]+table2[i][j];

        }

    }

    printf("The result array is:");

    puts("");

    for (i=0; i<rows; i++) {

        for (j=0; j<colums; j++) {

            printf("%4d", table3[i][j]);

        }

        puts("");

    }
    
    return 0;

}