public class Main {  // Main class where the program execution starts
    public static void main(String args[]) {  // Main method, the entry point for the program
        Person[] persons = new Person[3];  // Create an array to hold 3 Person objects
        persons[0] = new Person("Maria", 20);  // Create a new Person object with name "Maria" and age 20, and store it in the first position of the array
        persons[1] = new Person("Anna", 25);  // Create a new Person object with name "Anna" and age 25, and store it in the second position of the array
        persons[2] = new Person("Nikos", 40);  // Create a new Person object with name "Nikos" and age 40, and store it in the third position of the array

        for (Person person : persons) // Loop through each Person object in the 'persons' array and print their details
            System.out.println(person);  // Print the string representation of each Person (name and age)

        for (Person person : persons) // Loop through each Person object again and add 2 years to their age
            person.addYears(2);  // Add 2 years to the age of each person

        for (Person person : persons) // Loop through each Person object again and print their updated details
            System.out.println(person);  // Print the updated string representation of each Person (name and new age)
    }
}