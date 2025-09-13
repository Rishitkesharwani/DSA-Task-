class Solution(object):
    def addBinary(self, a, b):
        decimal_num=int(a,2)
        decimal_num2=int(b,2)
        
        sum=decimal_num+decimal_num2
        return bin(sum)[2:]
        