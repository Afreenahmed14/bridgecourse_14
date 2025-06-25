n1 = int(input("Enter first number: "))
n2 = int(input("Enter second number: "))
print("Choose operation: +  -  *  /")
op = input("Enter operator: ")
match op:
    case '+':
        print("Addition: " + str(n1 + n2))
    case '-':
        print("Subtraction: " + str(n1 - n2))
    case '*':
        print("Multiplication: " + str(n1 * n2))
    case '/':
        if n2 != 0:
            print("Division: " + str(n1 / n2))
        else:
            print("Cannot divide by zero.")

