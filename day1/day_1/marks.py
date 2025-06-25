marks = int(input("Enter your marks (0 - 100): "))
if marks > 100 or marks < 0:
    print("Invalid marks entered.")
elif marks >= 90 and marks <= 100:
    print("Grade: A")
elif marks >= 80:
    print("Grade: B")
elif marks >= 70:
    print("Grade: C")
elif marks >= 60:
    print("Grade: D")
elif marks < 60:
    print("Grade: F")


  
