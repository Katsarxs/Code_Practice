#include <stdio.h>

/*

Laboratory 5, Exercise 4.

Calculate how many bytes type integers, characters, floats, and doubles consume on the computer to compile C programs.

Result :

Integer : 4 Bytes
Character : 1 Bytes
Float : 4 Bytes
Double : 8 Bytes

*/

int main(void) {

    printf("Integer : %d Bytes\n", sizeof(int));

    printf("Character : %d Bytes\n", sizeof(char));

    printf("Float : %d Bytes\n", sizeof(float));

    printf("Double : %d Bytes\n", sizeof(double));

}