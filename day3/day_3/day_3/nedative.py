total = 0
for i in range(5):
    num = int(input("Enter a number: "))
    if num < 0:
        continue
    total += num
    
print("Sum of non-negative numbers:", total)






