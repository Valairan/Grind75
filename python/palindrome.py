def isPalindrom(input):
    filtered = ''.join(char.lower() for char in input if char.isalnum())
    return filtered == filtered[::-1]

is_palindrome = lambda s: (cleaned := "".join(character for character in s if character.isalnum()))== cleaned[::-1]
is_anagram = lambda s1, s2: ({character: s1.count(character) for character in s1 if character.isalnum()}) == ( {character: s2.count(character) for character in s1 if character.isalnum()})

print (is_palindrome("tomato"))
print (is_palindrome("yo banana boy"))

print (is_anagram("tomato", "potato"))
print (is_anagram("listen", "silent")) 