def replace_word():
    text = input("Enter a sentence:- ")
    old_word = input("Enter the word to be replaced:- ")
    new_word = input("Enter the new replacing word:- ")
    return text.replace(old_word, new_word)

print(replace_word())