truthTable =[
 ')',
 '}',
 ']'
]
pairs ={   
 '(':')',
 '{':'}',
 '[':']'
}

def checkbrackets(input):
    count = 0;
    for character in input:
        if(character in truthTable):
            count -= 1
        else:
            count += 1  

    return count == 0

def checkbracketsUsingStack(input):
    stack = []
    for character in input:
        if character in pairs:
            stack.append(character)
        else:
            if not stack:
                return False
            if pairs[stack.pop()] != character:
                return False
    
    print (stack)
    return len(stack) == 0

print (checkbrackets("{{[]}}"))
print (checkbrackets("{{[}}"))
print (checkbracketsUsingStack("{{[]}}"))
print (checkbracketsUsingStack("{{[}}"))