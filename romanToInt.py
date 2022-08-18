class Solution:
    def value(self, val):
        if val == 'I':
            return 1
        if val == 'V':
            return 5
        if val == 'X':
            return 10
        if val == 'L':
            return 50
        if val == 'C':
            return 100
        if val == 'D':
            return 500
        if val == 'M':
            return 1000
        return -1
    def romanToInt(self, s):
        result = 0
        i = 0
        while i < len(s):
            s1 = self.value(self, s[i])
            
            if (i+1) < len(s):
                s2 = self.value(self, s[i+1])
                if s1 >= s2:
                    result = result + s1
                    i = i + 1
                else:
                    result = result + s2 - s1
                    i = i + 2
            else:
                result = result + s1
                i = i + 1
        return result
ob = Solution()
s = input()
print("",ob.romanToInt(s))
