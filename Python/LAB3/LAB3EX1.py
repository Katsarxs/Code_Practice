# Tuples, Lists, Dictionaries
t = ('a', 3, 'test')
print(t)

x = 4
y = 7
(x, y) = (y, x)
print(x, y)

places = [("New York", 9000), ("Paris", 11000), ("London", 8000)]
print("Population of {0} is {1}".format(places[0][0], places[0][1]))
print(f"Population of {places[0][0]} is {places[0][1]}")
places.sort(reverse=True)
print(places)

list1 = [1, 4, 7, 9]
tuple(list1)
list1 = [7, -5, 34, 6]
list1.sort()
print(list1)
my_dict={1:'one'}
print(my_dict[1])
my_dict[2]='two'
print(my_dict)
list(my_dict)
print(2 in my_dict)
list1 = [(1,"One"), (2,"Two"), (3,"Three")]
dict(list1)
print(list1)

# Logical operators and expressions
print(chr(167)) # ASCII Code 167 = AsCII Character §
print(ord("G")) # ASCII Character G = ASCII Code 71
print(5 > 7)
print("cat" == "cab")
print("fun" in "funky")
print("x" not in "Summer")
n = 3
print((n > 2) and (n <= 100))
print(2 < n <= 100)