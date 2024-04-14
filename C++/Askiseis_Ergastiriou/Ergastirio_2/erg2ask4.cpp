#include <iostream>
#include <string>

using namespace std;

class Person {

private:

    Person(string firstName, string lastName, int ageNumber) {

        name = firstName;

        surname = lastName;

        age = ageNumber;

    }

public:

    void print() {

        cout << "Onomatepwnymo: " << name << " " << surname << ", Hlikia : " << age << endl;

    }

};

int main() {

    Person p("John", "Pappas", 30);

    p.print();

    Person q;

    q.print();

}
