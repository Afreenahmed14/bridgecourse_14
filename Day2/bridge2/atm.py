print("ATM Menu:")
print("1. Check Balance")
print("2. Withdraw")
print("3. Deposit")
print("4. Exit")

choice = int(input("Enter your choice (1-4): "))

match choice:
    case 1:
        print("Checking balance...")
    case 2:
        print("Withdrawing money...")
    case 3:
        print("Depositing money...")
    case 4:
        print("Exiting... Thank you!")
    case _:
        print("Invalid choice. Please select between 1 and 4.")
