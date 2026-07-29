class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        if len(s) < 2:
             return False
        for char in s :
            if char == "[" :
                stack.append("]")
            elif char == "(" :
                stack.append(")")
            elif char == '{':
                stack.append("}")
            else: 
                if len(stack)!= 0 and char == stack.pop():
                    continue
                else:
                    return False
        return len(stack) == 0
            
        