# Functions
def my_function(a) :
    if a > 0:
        b = 3 * a + 5
    else:
        b = -3 * a + 5
    return b

print(my_function(1))

# Alias
alias = my_function
alias(1)

# Type
def multi_input_function(val):
    if type(val) == str:
        return 'str'
    elif type(val) == int:
        return 'int'
    elif type(val) == bool:
        return 'bool'
    else:
        return 'else'

print(multi_input_function("String"))
print(multi_input_function(1))
print(multi_input_function(True))
print(multi_input_function(1.1))

# For loop
theTeam=['George','Alex','Nick','Chris','Nicky']
for person in theTeam:
    print("%s is in the team" % person)
range(10)
print(list(range(10)))
for i in range(1,20,3): # Start: 1, Final: 20, Step(s): 3
    print(i)