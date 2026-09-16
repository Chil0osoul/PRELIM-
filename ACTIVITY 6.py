while True:
    print("\nStudent grade calculator")
    
    
    javascore = float(input("Java Programming Score: "))
    cscore = float(input("C Programming Score: "))
    datascore = float(input("Data Handling Score: "))
    
    ave = (javascore + cscore + datascore) / 3
    
    
    if ave >= 90:
        grade = "A"
    elif ave >= 80:
        grade = "B"
    elif ave >= 75:
        grade = "C"
    else:
        grade = "F"
        
    
    print(f"\nAverage: {ave:.2f}")
    print(f"Grade: {grade}")
    
    
    while True:
        choice = input("Do you want to continue? (YES/NO): ").strip().upper()
        if choice == "YES":
            break
        elif choice == "NO":
            print("Program Terminated. Thank you!")
            exit()
        else:
            print("Invalid input. Please type YES or NO.")