text = input("Enter a string: ")
count = 0
for char in text:
    if char == 'a' or char == 'A':
        count += 1
print("Count of 'a' or 'A':", count)
