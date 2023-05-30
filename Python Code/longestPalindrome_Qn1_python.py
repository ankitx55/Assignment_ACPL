def longest_palindrome(s):
    n = len(s)
    dp = [[False] * n for _ in range(n)]
    ans = ""
    for i in range(n):
        dp[i][i] = True
        ans = s[i]
    for l in range(2, n + 1):
        for i in range(n - l + 1):
            j = i + l - 1
            if l == 2 and s[i] == s[j]:
                dp[i][j] = True
                ans = s[i:j+1]
            elif s[i] == s[j] and dp[i+1][j-1]:
                dp[i][j] = True
                ans = s[i:j+1]
    return ans

string = input("Enter a word:- ");
print(longest_palindrome(string))