class Solution {
    int power(String str){
        int pow=0;
        char c=str.charAt(0);
        switch(c){
            case '+':
            case '-':
                pow=1;
                break;
            case '*':
            case '/':
                pow=2;
                break;
        }
        return pow;
    }
    List<String> nums(String s,List<String> nums){
        String n="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                n+=c;
            }else if(c=='+' || c=='-' || c=='*' || c=='/'){
                nums.add(n);
                nums.add(c+"");
                n="";
            }
        }
        if(n!="")nums.add(n);
        return nums;
    }

    List<String> postfix(List<String> nums){
        List<String> post=new ArrayList<>();
        Stack<String> stack=new Stack<>();

        for(String ele : nums){
            if(!ele.equals("+") && !ele.equals("-") && !ele.equals("*") && !ele.equals("/")){
                post.add(ele);
            }else{
                while(!stack.isEmpty() && power(stack.peek()) >= power(ele)){
                    String el=stack.pop();
                    post.add(el);
                }
                stack.push(ele);
            }
        }
        while(!stack.isEmpty()) post.add(stack.pop());
        return post;
    }
    int posCal(List<String> nums){
        Stack<Integer> stack=new Stack<>();
        for(String ele : nums){
            if(!ele.equals("+") && !ele.equals("-") && !ele.equals("*") && !ele.equals("/")){
                stack.push(Integer.parseInt(ele));
            }
            else{
                char c=ele.charAt(0);
                int n1 , n2;
                switch(c){
                    case '+':
                        n1=stack.pop();
                        n2=stack.pop();
                        stack.push(n2+n1);
                        break;
                    case '-':
                        n1=stack.pop();
                        n2=stack.pop();
                        stack.push(n2-n1);
                        break;
                    case '*':
                        n1=stack.pop();
                        n2=stack.pop();
                        stack.push(n2*n1);
                        break;
                    case '/':
                        n1=stack.pop();
                        n2=stack.pop();
                        stack.push(n2/n1);
                        break;
                }
            }
        }
        return stack.peek();
    }
    public int calculate(String s) {
        List<String> nums=new ArrayList<>(); 
        nums=nums(s,nums);
        if(nums.size()<=1) return Integer.parseInt(nums.get(0));
        nums=postfix(nums);
        int ans=posCal(nums);
        return ans;
    }
}