class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        for(char chars : s.toCharArray()){
            if(chars == '{' || chars== '[' || chars== '('){
                stack.push(chars);
                continue;
            }
              if(chars == '}' || chars== ']' || chars== ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char w = stack.peek();
                char oppisite = '!';
                switch(chars){
                case '}':
                oppisite = '{';
                break;
                case ']':
                oppisite ='[';
                break;
                case ')':
                oppisite = '(';
                break;
                default:
                break;
                }

                if(w == oppisite){
                    stack.pop();
                    continue;
                }return false;
            }

        }
        return stack.isEmpty();
    }
}
