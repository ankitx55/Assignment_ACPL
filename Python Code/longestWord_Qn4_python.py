def find_longest_word(words_list):
    word_len = []
    for n in words_list:
        word_len.append((len(n), n))
    word_len.sort()
    return word_len[-1][0]

words_list = input("Enter a list of words separated by space:- ").split()
print(find_longest_word(words_list))