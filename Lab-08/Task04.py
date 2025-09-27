def is_valid_postfix(expr):
    operand_count = 0
    for symbol in expr:
        if symbol.isdigit() or symbol.isalnum():
            operand_count += 1
        elif symbol in "+-*/":
            if operand_count < 2:
                return False
            operand_count -= 1
        else:
            return False
    return operand_count == 1

postfix_expr = input("Enter a postfix notation: ")
print(is_valid_postfix(postfix_expr))
