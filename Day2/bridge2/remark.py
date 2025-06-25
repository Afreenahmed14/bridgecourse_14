score = int(input("Enter your score (0-100): "))

if 90 <= score <= 100:
    print("Excellent")
elif 80 <= score <= 89:
    print("Very Good")
elif 70 <= score <= 79:
    print("Good")
elif 60 <= score <= 69:
    print("Pass")
elif 0 <= score < 60:
    print("Fail")
else:
    print("Invalid score. Please enter a number between 0 and 100.")
#Switch statements only match specific values, not ranges.
#In this problem, we need to check ranges like 90–100, 80–89.
#To handle such conditions, if-elif-else is the better and more flexible choice.