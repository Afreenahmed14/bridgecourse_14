n = int(input("Enter a number: "))

if n == 0:
    print("Factorial: 1 = 1")
else:
    fact = 1
    formula = ""
    for i in range(1, n + 1):
        fact *= i
        formula += str(i)
        if i != n:
            formula += " × "
    print(f"Factorial: {formula} = {fact}")
