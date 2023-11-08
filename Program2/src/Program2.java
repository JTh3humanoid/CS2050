//Jose Salcedo
//Assignment 2 or Program 2 in canvas
//the methods in order are to add, subtract,multiply and divide by inputs a and b
//Also the last two methods are to find the sine of a right triangle and the hypotenuse
//I imported number format because the test only wants two decimal places
import java.text.NumberFormat;
public class Program2  {



    public static double add(double a, double b) {
        double sum;
        sum=a+b;
        return sum;
    }


    public static double subtract(double a, double b) {
        double Subsum;
        //Subsum means sum of the subtraction
        Subsum=a-b;
        return Subsum;
    }

    public static double multiply(double a, double b) {
        //Mupsum means sum of multiplication
        double Mupsum;
        Mupsum= a * b;
        //Stops the -0 value from ever happening
        if (Mupsum==-0){
            Mupsum=0;
        }
        return Mupsum;
    }


    public static double divide(double a, double b) throws ArithmeticException {
        double Divsum;
        //Divsum means sum of the divided
        Divsum=a/b;
        //If b=0 it will make the compiler throw a ArithmeticException
        if (b==0) Divsum = 1 / 0;
        return Divsum;
    }


    public static double sineOfAngle(double oppSide, double hyp) {
        double SumSine;
        //Sum of the sine
        SumSine=oppSide/hyp;
        NumberFormat df= NumberFormat.getInstance();
        df.setMaximumFractionDigits(2);
        //makes the string a double
        return Double.parseDouble(df.format(SumSine));
    }

    // TODO #6: finish the method's implementation - assume right triangle
    //This is confusing but all im doing is making all side squared by multiplying
    //them by themselves and then adding it all together to find C or the hypotenuse

    public static double hypOfTriangle(double sideA, double sideB) {
        double aSquared;
        aSquared=sideA*sideA;
        double bSquared;
        bSquared=sideB*sideB;
       double cnSquared;
       cnSquared=aSquared+bSquared;
       double HypSum;
       HypSum=Math.sqrt(cnSquared);
       NumberFormat nf = NumberFormat.getInstance();
       nf.setMaximumFractionDigits(2);
       //makes the string a double
        return Double.parseDouble(nf.format(HypSum));
    }


    public static void main(String[] args){

        System.out.println("Sum for add "+Program2.add(1,2)+
            "\nSum for sub "+Program2.subtract(2,2)+
            "\nSum for mup "+Program2.multiply(2,2)+
            "\nSum for div "+Program2.divide(2,2)+
            "\nSum for Sine "+Program2.sineOfAngle(10,5)+
            "\nSum for Hyp "+Program2.hypOfTriangle(2,2));


    }
}

