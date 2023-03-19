package String;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //Initialize a stack to push and pop parentheses
        Stack<Character> bracket = new Stack<>();
        //Initialize i as 0 and n as length of the given string
        int i=0, n=s.length();
        //Loop until all the character are done traversing
        while(i<n){
            //Take a character at position i in string 
            char c = s.charAt(i);
            //If you encounter a opening parentheses push it to the stack
            if(c=='('){
                bracket.push(c);
            }
            //If you encounter a opening parentheses push it to the stack
            else if(c=='['){
                bracket.push(c);
            }
            //If you encounter a opening parentheses push it to the stack
            else if(c=='{'){
                bracket.push(c);
            }
            //If you encounter a closing parentheses 
            //Pop the corresponding opening parentheses it from the stack
            //If you can't find the opening parentheses it means parentheses are not in valid order
            else if(c==')'){
                if(!(bracket.isEmpty()) && bracket.peek() == '(' ){
                    bracket.pop();
                }
                else{
                    return false;
                }
            }
            //If you encounter a closing parentheses 
            //Pop the corresponding opening parentheses it from the stack
            //If you can't find the opening parentheses it means parentheses are not in valid order
            else if(c==']'){
                if(!(bracket.isEmpty()) && bracket.peek() == '['){
                    bracket.pop();
                }
                else{
                    return false;
                }
            }
            //If you encounter a closing parentheses 
            //Pop the corresponding opening parentheses it from the stack
            //If you can't find the opening parentheses it means parentheses are not in valid order
            else if(c== '}'){
                if(!(bracket.isEmpty()) && bracket.peek() == '{'){
                    bracket.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        //If the bracket is empty it means all the closing parentheses have their opening parentheses removed from the stack
        if(bracket.isEmpty()) return true;
        //Return false if the stack still contains few more parentheses
        return false;
}    
}
/*
Time Complexity = O(n)
Space Complexity = O(n)
*/