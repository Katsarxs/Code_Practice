#include <iostream>
#include <string>

/*

Suppose in a program we define the following function:

void functionDefaultParam(double x = 7.3, int y = 4, char z = '*')

Which of the following function calls do you think are correct:

1. functionDefaultParam();
2. functionDefaultParam(2.8);
3. functionDefaultParam(3.2, 0, 'h');
4. functionDefaultParam(9.2, '!');
5. functionDefaultParam(7, 3);

Answer

Correct calls to functionDefaultParam are: 1, 2, 3, and 5.
In the 4th call we want to set values ​​for the 1st and 3rd parameters (for this we pass a real number and a character as parameters) but essentially this way we set a value for the 1st and 2nd parameters.
The 2nd parameter (integer) will take the value of the character '*' based on the Ascii array.

*/

int main() {

    return 0;

}
