def precedence(operator):
    if operator in ('+', '-'):
        return 1
    if operator in ('*', '/'):
        return 2
    return 0

def infix_to_postfix(expression):
    operator_stack = []
    postfix = ""
    for token in expression:
        if token.isalnum():  
            postfix += token
        elif token == '(':
            operator_stack.append(token)
        elif token == ')':
            while operator_stack and operator_stack[-1] != '(':
                postfix += operator_stack.pop()
            operator_stack.pop()
        else:   
            while operator_stack and precedence(operator_stack[-1]) >= precedence(token):
                postfix += operator_stack.pop()
            operator_stack.append(token)
    while operator_stack:
        postfix += operator_stack.pop()
    return postfix


input_expr = "(A+B)*C"
print("Postfix:", infix_to_postfix(input_expr))
