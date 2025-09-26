def valid_postpix(expression):
    stack = 0
    for char in expression:
        if char.isdigit() or char.isalnum():
            stack += 1
        elif char in "+-*/" :
            if stack < 2:
                return False
            stack -= 1
        else:
            return False
        
    return stack == 1

exp = input("Enter a postfix notation: ")
print(valid_postpix(exp))


        
