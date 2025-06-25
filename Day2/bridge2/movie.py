age = int(input("Enter your age: "))
is_student = input("Are you a student? (yes/no): ").lower() == "yes"
if age < 5 or age > 65:
    price = 5
elif 5 <= age <= 18 and is_student:
    price = 8
else:
    price = 12

print("Ticket price: $", price)
