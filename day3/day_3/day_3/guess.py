a = int(input("Set the secret number (1-10): "))
print("\n" * 5)  
guess = int(input("Guess the number (1-10): "))

while guess != a:
    if guess > a:
        print("Too high")
    else:
        print("Too low")
    guess = int(input("Try again: "))

print("Correct!")
