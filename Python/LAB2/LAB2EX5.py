#Splitting full name to name and surname from input
userInput = input("Enter your full name : ") # Taking full name
name = userInput.split(" ") # Splitting the names
print(f"Name: {name[0]} Surname: {name[1]}") # Printing each one