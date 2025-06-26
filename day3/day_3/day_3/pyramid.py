height = int(input("Enter height: "))

for i in range(height):
    for space in range(height - i - 1):
        print(" ", end="")  # Print leading spaces
    for star in range(2 * i + 1):
        print("*", end="")  # Print stars
    print()  # Move to next line
