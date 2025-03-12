# The task is to generate a random integer between 1 and 10
# and let the user guess it. Minigame Lukewarm - Cold
import random

randomNumber = random.randint(1, 10) # Generate integer between 1 and 10
print(randomNumber)
while True:
    userInput = int(input("Enter number: ")) # Input an integer
    if userInput == randomNumber: # Correct
        print("Correct!")
        break
    elif -2 <= userInput - randomNumber <= 2: # Close - Lukewarm
        print("Lukewarm")
    elif (userInput - randomNumber > 2) or (userInput - randomNumber < -2): # Far - Cold
        print("Cold")
    else:
        print("Oops, something went wrong...")
