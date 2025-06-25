n1= int(input("Enter first number: "))
n2 = int(input("Enter second number: "))     
if n1 > n2:
    print("Greater number is: " + str(n1))   
elif n2 > n1:   
    print("Greater number is: " + str(n2))
else:
    print("Both numbers are equal: " + str(n1))