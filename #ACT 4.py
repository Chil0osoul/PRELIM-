#ACT 4

#Write a Python program that prompts the user for the cost of two items to be purchased.
#  Then prompt the user for their payment. If they enter an amount that is less than the total cost
#  of the two items, print a message that tells them how much they still owe.
# Otherwise, print a message that thanks them for their payment and tells them how much change
# they will receive.

cost = int(input("Enter 1st item cost: "))
cost2 = int(input("Enter 2st item cost: "))
owe = cost + cost2
pay = int(input("Enter payment for the items: "))

    
if owe == pay:
    print("Thank you for your purchase.")   
elif owe > pay :
    total = owe - pay
    print(f"You still owe: {total} to pay")
        


