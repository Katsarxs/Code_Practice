# Calculate and show the doubled words in a text
text = "one two two seven six three one five seven five five eight six four three"
list_text = text.split()
new_list = {}
for word in set(list_text):
    new_list[word] = 0
for word in list_text:
    new_list[word] += 1
print(new_list)