# Arithmetic expressions and operators
print(3+2, 8 ** 2, 19/5, 19//5, 19%5)
print(3+2, 8 ** 2, 19/5, 19//5, 19%5, sep='#')
abs(-5)
int(-7.6)
int(-7.6)
print(round((5 + 6) / 2))
x = 5
x += 1
x **= 2

# Errors
#print(5))
#break = 3
#uvar += 1
#print(17/0)

# Strings
str1 = "Fish & Chips"
str1[7:11]
str1[11:7]
str1.find('chip')
str1.find('Chip')
print('icsd'[1], 'icsd'[2], 'icsd'[2:4])
print('icsd'[-1], 'icsd'[-2], 'icsd'[-4:-1]) # Αρνητικοί δείκτες
print('icsd'[:2])
print('icsd'[2:])
print('icsd'[-3:])
print('icsd'[:-3])
print('Hello' + ' ' + 'World')
print('he'*3)
print(('hurrah-'*2)+'hurrah')
len(str1)
str1.upper()
str1.count('i')
"icsd".capitalize()
"icsd ".rstrip()
"Dougie Jones".upper().count('E')
print(int("7"))
print(float("7"))
print(eval("2 + (3 * 5)"))
print(str(5.5) + '%')

# I/O
input("Please insert your age: ")
int(input("Please insert your age: "))
float(input("Please insert your age: "))
eval(input("Please insert your age: "))
str2 = "This is a " + \
       "one line string"
str3 = """This is a
multiline string"""
str3
print(str3)
print("Hello, " + "World", end='!')
print("0123456789012345678901234567")
print("S/N".ljust(5), "Character".ljust(17), "Rating".rjust(6), sep="")
print('1'.center(5), "Dougie Jones".ljust(17), "10".rjust(6), sep="")
print('2'.center(5), "Dale Cooper".ljust(17), "9".rjust(6), sep="")
print('3'.center(5), "Diane Evans".ljust(17), "9".rjust(6), sep="")