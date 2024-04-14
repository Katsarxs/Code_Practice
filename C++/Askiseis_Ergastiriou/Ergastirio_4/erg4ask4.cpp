#include <iostream>
#include <string>

/*

Is there an error in the following program or is it going to execute normally? If there is an error, correct the code.

01 #include <iostream>

02 using namespace std;

03

04 float f(float);

05 double f(double);

06

07 int main() {

08 float x = 15.05;

09 double y = 12.10;

10

11 cout << f(x) << endl;

12 cout << f(y) << endl;

13 cout << f(20);

14

15 return 0;

16 }

17

18 float f(float i) {

19 return i/3.0;

20 }

21

22 double f(double i) {

23 return i/2.0;

24 }

Answer

There is ambiguity because in line 13, in the case of calling the function with an integer parameter (cout << f(20);) the compiler can call both the first function with a float parameter and the second one with a double parameter.
We should do a suitable conversion on the parameter to tell the compiler exactly what we want. e.g. cout << f((double) 20) .
If we call the function e.g. with f(20.0) the function with double parameter will be called by definition.
Alternatively we can call it as f(20.0d) to call the double version or with f(20.0f) to call the float version.

*/

int main() {

    return 0;

}
