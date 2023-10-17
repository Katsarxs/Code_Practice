#include <stdio.h>
#include <limits.h>

int main() {

    /*

    Range Of Values

    */

    printf("Char Minimum : %hhi Maximum : %hhi\n\n", CHAR_MIN, CHAR_MAX);

    printf("Signed Char Minimum : %hhi Maximum : %hhi\n\n", SCHAR_MIN, SCHAR_MAX);

    printf("Unsigned Char Minmum : %d Maximum : %u\n\n", 0, UCHAR_MAX);

    printf("Short Minimum : %hd Maximum : %hd\n\n", SHRT_MIN, SHRT_MAX);

    printf("Unsigned Short Minimum : %d Maximum : %hu\n\n", 0, USHRT_MAX);

    printf("Int Minimum : %d Maximum : %d\n\n", INT_MIN, INT_MAX);

    printf("Unsigned Int Minimum : %d Maximum : %u\n\n", 0, UINT_MAX);

    printf("Long Minimum : %ld Maximum : %ld\n\n", LONG_MIN, LONG_MAX);

    printf("Unsigned Long Minimum : %d Maximum : %lu\n\n", 0, ULONG_MAX);

    printf("Long long Minimum : %lld Maximum : %lld\n\n", LLONG_MIN , LLONG_MAX);

    printf("Unsigned Long Long Minimum : %d Maximum : %llu\n\n", 0, ULLONG_MAX);

}