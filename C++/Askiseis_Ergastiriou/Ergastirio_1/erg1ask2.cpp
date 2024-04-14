/*

Laboratory 1, Exercise 2.

a) "Film Rental" Scenario

Suppose you and your friends decide to rent a movie from a local movie rental store.

For this purpose, you use the relevant online application, in which you have a customer code. Essentially, the movie rental scenario is as follows:

"Nikos Pappas with code 176 who lives at 9 Aesopou Street in Gerakas with phone number 2106014567 is a customer of the "MovieArt" store at 5 Pefkon Street in Gerakas and after requesting access to the application and identifying himself as a customer, he rents the movie with no. 1412, "Oppenheimer" which is stored at this particular movie rental store."

a) Based on this scenario identify the objects and then the classes involved in developing a movie rental application.

b) Describe each of the participating classes, i.e. identify the properties, functions and how the classes relate to each other, based on the scenario.

c) Create a diagram to represent the classes of the Movie Rental application and their relationships.

Result :

a) We notice that the main objects involved in the scenario are:

1. Nikos Pappas (Customer)

2. MovieArt (Store)

3. Oppenheimer (Movie)

So the 3 main classes for the application are Customer, Store and Movie.

b) The properties of the classes derived from the script are:

1. Customer: Name, Surname, Code, Address, Telephone

2. Store: Name, Address

3. Film: Title, Number

The relationships described in the script between the participating objects are:

1. "Nikos Pappas" (Customer) IS A CUSTOMER of "MovieArt" (Store)

2. "Nikos Pappas" (Client) RENTS "Oppenheimer" (Film)

3. 'MovieArt' (Store) STORES 'Oppenheimer' (Movie)

Based on the above relationships, the minimum actions that objects must support, i.e. the functions/methods that must be implemented in classes are:

1. Client: RequestLogin(), RequestRent()

2. Store: AuthenticateCustomer(), SaveMovie()

3. Movie: Rent()

*/