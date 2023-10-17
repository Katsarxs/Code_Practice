#include <stdio.h>
#include <limits.h>

int main() {

    printf("%hhi %hhi\n", CHAR_MIN, CHAR_MAX);

    printf("%hhi %hhi\n", SCHAR_MIN, SCHAR_MAX);

    printf("%u\n", UCHAR_MAX);

    printf("%hd %hd\n", SHRT_MIN, SHRT_MAX);

    printf("%hu\n", USHRT_MAX);

    printf("%d %d\n", INT_MIN, INT_MAX);

    printf("%u\n", UINT_MAX);

    printf("%ld %ld\n", LONG_MIN, LONG_MAX);

    printf("%lu\n", ULONG_MAX);

    printf("%lld %lld\n", LLONG_MIN , LLONG_MAX);

    printf("%llu\n", ULLONG_MAX);

}