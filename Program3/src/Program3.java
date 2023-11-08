//Jose Salcedo
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Program3 {
public static String InfixtoPostfix(String s){
    ArrayStackClass stack1 = new ArrayStackClass();
    String formula;
    formula = s;
    stack1.Req(32);
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
            stack1.Push(String.valueOf(c));
        }else if (c=='('){
            stack1.Push("(");
            ++flagp;
        }else if (c==')') {
            ++flagp;
            test--;
            if (stack1.Peek() != null) {
                while (!stack1.Empty() && !stack1.Peek().equals("(")) {
                    postfixops.append(stack1.Pop());
                }


            }


        }else if (c==' '){
            space++;
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
            while(!stack1.Empty()){
                 {
                     if (stack1.Peek()!=null) {
                         if (stack1.Peek().equals("(")) {
                             stack1.Pop();
                         }
                     }
                }
                postfixops.append(stack1.Pop());
            }
        }
        if (r==formula.length()-1){
            while(!stack1.Empty()){
                if (stack1.Peek()!=null) {
                    if (stack1.Peek().equals("(")) {
                        stack1.Pop();
                    }
                }
                postfixops.append(stack1.Pop());
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
    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("C:/Users/Jose Salcedo/IdeaProjects/Program3/src/Program3.txt");
        File ouputfile = new File("C:/Users/Jose Salcedo/IdeaProjects/Program3/src/Program3.out");
        PrintWriter oT = new PrintWriter(ouputfile);
        Scanner inf = new Scanner(inputfile);
        while(inf.hasNextLine()){
            String f=inf.nextLine();
            oT.println(f+"----->"+InfixtoPostfix(f));
            System.out.println(f+"----->"+InfixtoPostfix(f));
        }
        oT.close();
        inf.close();

    }
}










