#include <stdio.h>
#include <limits.h>

int main() {

    char a_char; // Byte : 1, Range : -128 to +127, Format : %c

    signed char a_signed_char; // Byte : 1, Range : -128 to +127, Format : %c

    unsigned char a_unsigned_char; // Byte :1, Range : 0 to +255, Format : %c

    /*

    Bytes : 2, Range : -32,768 to +32,767, Format : %hd

    */

    short a_short;

    short int a_short_int;

    signed short a_signed_short;

    signed short int a_signed_short_int;

    /*

    Bytes : 2, Range : 0 to +65,535, Format : %hu

    */

    unsigned short a_unsigned_short;

    unsigned short int a_unsigned_short_int;

    /*

    Bytes : 2, Range : -2,147,483,648 to +2,147,483,647, Format : %d

    */
   
    int a_int;

    signed a_signed;

    signed int a_signed_int;

    /*

    Bytes : 2, Range : 0 to +4,294,967,295, Format : %u

    */

    unsigned a_unsigned;

    unsigned int a_unsigned_int;

    /*

    Bytes : 4, Range : -2147483648 to +2147483647, Format : %ld

    */

    long a_long;

    long int a_long_int;

    signed long a_signed_long;

    signed long int a_signed_long_int;

    /*

    Bytes : 4, Range : 0 to +4,294,967,295, Format : %lu

    */

    unsigned long a_unsigned_long;

    unsigned long int a_unsigned_long_int;

    /*

    Bytes : 8, Range : -9,223,372,036,854,775,808 to +9223372036854775807, Format : %lld

    */

    long long a_long_long;

    long long int a_long_long_int;

    signed long long a_signed_long_long;

    signed long long int a_signed_long_long_int;

    /*

    Bytes : 8, Range : 0 to +18,446,744,073,709,551,615, Format : %llu

    */

    unsigned long long a_unsigned_long_long;

    unsigned long long int a_unsigned_long_long_int;

   
}