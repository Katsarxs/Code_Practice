#include <stdio.h>
#define N 10
#define M 6

int main (void)
{

    int i,y,flag,thesikod,thesi,kod,x,sum=0,max=0,arr[N][12],arr1[N][M] =
    {
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
    int arr2[N][M] =
    {
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


    for (i=0; i<N; i++)
    {
        for (y=0; y<=6; y++)
        {

            if (y<6)
                arr[i][y]=arr1[i][y];

            else if (y==6)
            {
                for (x=0; x<6; x++)
                    arr[i][y+x]=arr2[i][x];

            }
        }
    }



    for (i=0; i<N; i++)
    {
        for (y=0; y<12; y++)
        {
            sum+=arr[i][y];

        }
    }



    printf("grapse ton kodiko tou biblioy ");
    scanf("%i",&kod);

    for (i=0; i<N; i++)
    {
        if (kod==code[i]) {thesikod=i;
        flag=1;}
    }





    if (flag==1)
    {

        i=0;
        while (1)
        {

            if (arr[thesikod][i]>max)
            {
                max=arr[thesikod][i];
                thesi=i;


            }

            i++;
            if (i==12) break;
        }
        thesi+=1;
    }




    printf("Q1: %i\n",sum);

    if (thesi>0)
        printf("Q2: %i",thesi);
    else printf("Q2: Book not found");




    return 0;
}