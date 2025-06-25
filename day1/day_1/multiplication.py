n = int(input("Enter a number: "))

print("Multiplication Table of", n)

for i in range(1, 11):
    print(str(n) + " x " + str(i) + " = " + str(n * i))
