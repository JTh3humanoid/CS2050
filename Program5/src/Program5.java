
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Stack;

public class Program5 {
        public static String InfixtoPostfix(String s){
            Stack<Object> stack=new Stack<>();
            String formula;
            formula = s;
            StringBuilder postfixnum = new StringBuilder();
            StringBuilder postfixops = new StringBuilder();
            boolean orderofop = false;
            int count=0;
            int flagp=0;
            int space=0;
            int test=0;
            for (int i = 0, r = 0; i < formula.length(); i++, r++) {
                char c = formula.charAt(r);
                if (Character.isDigit(c)||c=='.') {
                    postfixnum.append(c);
                }
                else if (c=='+'||c=='–'||c == '*' || c == '/' || c == '%') {
                    stack.push(String.valueOf(c));
                }else if (c=='('){
                    stack.push("(");
                    ++flagp;
                }else if (c==')') {
                    ++flagp;
                    test--;
                    if (stack.peek() != null) {
                        while (!stack.empty() && !stack.peek().equals("(")) {
                            postfixops.append(stack.pop());
                        }


                    }

                }else if (c==' '){
                    space++;
                    postfixnum.append(c);
                }else{
                    test++;
                }
                if (c == '*' || c == '/' || c == '%'){
                    orderofop=true;

                }
                if (c=='+'||c=='-'){
                    count++;
                }



                if (orderofop&&count>0&&r==formula.length()-1) {
                    while(!stack.empty()){
                        {
                            if (stack.peek()!=null) {
                                if (stack.peek().equals("(")) {
                                    stack.pop();

                                }
                            }
                        }if (!stack.empty())
                        postfixops.append(stack.pop());
                    }
                }
                if (r==formula.length()-1){
                    while(!stack.empty()){
                        if (stack.peek()!=null) {
                            if (stack.peek().equals("(")) {
                                stack.pop();
                            }
                        }
                        postfixops.append(stack.pop());
                    }
                }  if (flagp==1&&r==formula.length()-1){
                    return "not matching parentheses";
                }
                if (flagp>3&&r==formula.length()-1) {
                    return "not matching parentheses";
                }
                if (test>1&&r==formula.length()-1){
                    return "invalid input";
                }

            }
            return String.valueOf(postfixnum.append(postfixops));
        }
        public static void main(String[] args) throws IOException {
            boolean endoffile=false;
            //Path class and code found on Oracle Api documentation
            Path path = FileSystems.getDefault().getPath("Program3.txt");
            Path path1= FileSystems.getDefault().getPath("Program5.out");
            BufferedReader input = new BufferedReader(new FileReader(String.valueOf(path)));
            BufferedWriter out = new BufferedWriter(new FileWriter(String.valueOf(path1)));
            while(!endoffile){
                    String f= input.readLine();
                    if(f==null){
                        endoffile=true;
                    }else{
                        out.write("\n"+f + "----->" + InfixtoPostfix(f));
                        System.out.println(f + "----->" + InfixtoPostfix(f));
                    }
            }
            out.close();
            input.close();

        }
    }



