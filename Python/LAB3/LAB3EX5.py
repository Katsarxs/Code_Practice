# List Comprehension
from math import sqrt

# Squared numbers from 1 to 100
numbers_list = [sqrt(i) for i in range(1, 101)]
print(numbers_list)

# Positive numbers from 1 to 100
numbers_positive_list = [i for i in range(1, 101) if i % 2 == 0]
print(numbers_positive_list)