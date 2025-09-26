def precedence(op):
    if op in ('+', '-'):
        return 1
    if op in ('*', '/'):
        return 2
    return 0

def infix_to_postfix(expression):
    stack = []
    output = ""
    for char in expression:
        if char.isalnum():  
            output += char
        elif char == '(':
            stack.append(char)
        elif char == ')':
            while stack and stack[-1] != '(':
                output += stack.pop()
            stack.pop()
        else:   
            while stack and precedence(stack[-1]) >= precedence(char):
                output += stack.pop()
            stack.append(char)
    while stack:
        output += stack.pop()
    return output


expr = "(A+B)*C"
print("Postfix:", infix_to_postfix(expr))
