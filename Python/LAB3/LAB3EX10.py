# Checking for palindrome input text
userInput = str(input("Enter text: "))
reversed_userInput = userInput[::-1]
if reversed_userInput == userInput:
    print("It is")
else:
    print("It is not")