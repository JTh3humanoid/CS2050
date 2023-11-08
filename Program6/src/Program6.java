//Jose Salcedo
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program6 {

    public static double SelctionSorttimed(int[]SelSiarray){
        long SeStart, Seend;
        double Setime;
        int selsize = SelSiarray.length;
        SeStart=System.nanoTime();
        for (int i=0;i<selsize-1;i++){
            int minumum = i;
            for (int j=i+1;j<selsize;j++){
                if (SelSiarray[j]<SelSiarray[minumum]) {
                    minumum = j;
                    int temp = SelSiarray[minumum];
                    SelSiarray[minumum] = SelSiarray[i];
                    SelSiarray[i] = temp;
                }
            }

        }
        Seend=System.nanoTime();
        Setime=Seend-SeStart;
        return Setime;
    }


    public static double BubbleSorttimed(int[] BSiarray){
        int temp;
        double BSrealtime;
        long BSstart ,Bsend;
        int BSsize=BSiarray.length;
        BSstart=System.nanoTime();
        for (int i=0; i<BSsize-1;i++){
            for (int j = i+1;j<BSsize; j++){
                if (BSiarray[j]<BSiarray[i]){
                   temp=BSiarray[i];
                   BSiarray[i]=BSiarray[j];
                   BSiarray[j]=temp;
                }
            }
        }
        Bsend=System.nanoTime();
        BSrealtime=Bsend-BSstart;
        return BSrealtime;
    }
    public static double sortArray(ArrayList<Integer>Iarray){

        long start,end;
        double realtime;
        start=System.nanoTime();
        Collections.sort(Iarray);
        end=System.nanoTime();
        realtime=end-start;
        return realtime;
    }
    public static double insertSort(int[]Iinsertarray) {
        double irealtime;
        long istart, iend;
        int isize = Iinsertarray.length;
        istart=System.nanoTime();
        for (int i = 1; i < isize; ++i){
            int compare = Iinsertarray[i];
            int previous=i-1;
            while (previous>=0 && Iinsertarray[previous]>compare){
                Iinsertarray[previous+1]=Iinsertarray[previous];
                previous=previous-1;
            }
            Iinsertarray[previous+1]=compare;
        }
        iend=System.nanoTime();
        irealtime=iend-istart;
        return irealtime;
    }
    public static double StringBubbleSort(String[] in){
        String temp;
        double srealtime;
        long Astart ,Aend;
        int Asize=in.length;
        Astart=System.nanoTime();
            for (int n=0;n<Asize-1;n++){
                String co;
                co=in[n];
                for (int j=n+1;j<Asize;j++){
                    int flag=co.compareTo(in[j]);
                    if (flag>0){
                        temp=in[n];
                        in[n]=in[j];
                        in[j]=temp;
                    }

                }
            }
            Aend=System.nanoTime();
            srealtime=Aend-Astart;
        return srealtime;
    }
    public static double StringSelectionSort(String[] args){
        long Start, Eend;
        double Stime;
        int ssize = args.length;
        Start=System.nanoTime();
        for (int i=0;i<ssize-1;i++){
            int minumum = i;
            String c;
            c=args[i];
            for (int j=i+1;j<ssize;j++){
                int Selflag=c.compareTo(args[j]);
                if (Selflag>0) {
                    minumum = j;
                    String temp = args[minumum];
                    args[minumum] = args[i];
                    args[i] = temp;
                }
            }

        }
        Eend=System.nanoTime();
        Stime=Eend-Start;
        return Stime;
    }
    public static double SinsertSort(String[]SIinsertarray) {
        double sirealtime;
        long sistart, siend;
        int sisize =SIinsertarray.length;
        sistart=System.nanoTime();
        for (int i = 1; i < sisize; ++i){
            String compare = SIinsertarray[i];
            int previous=i-1;
            int isflag = SIinsertarray[previous].compareTo(compare);
            while (previous>=0 && isflag>0){
                SIinsertarray[previous+1]=SIinsertarray[previous];
                previous=previous-1;
            }
            SIinsertarray[previous+1]=compare;
        }
        siend=System.nanoTime();
        sirealtime=siend-sistart;
        return sirealtime;
    }
    public static double Stringarraysort(ArrayList<String> inp){
        long start,end;
        double realtime;
        start=System.nanoTime();
        Collections.sort(inp);
        end=System.nanoTime();
        realtime=end-start;
        return realtime;
    }



     public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("NumbersInFile.txt");
        Path path1 = FileSystems.getDefault().getPath("results.txt");
        Path path2 = FileSystems.getDefault().getPath("StringsInFIle");
        BufferedReader input = new BufferedReader(new FileReader(String.valueOf(path)));
        BufferedReader input2= new BufferedReader(new FileReader(String.valueOf(path2)));
        BufferedWriter output= new BufferedWriter(new FileWriter(String.valueOf(path1)));
        int Twenk=20000;
        int Tenk=10000;
        boolean endoffile=false;
        boolean endoffilestring=false;
        int[]inputBS=new int[Twenk];
        int[]inputSelS=new int[Twenk];
        ArrayList<Integer> inputSyssort = new ArrayList<>();
        int[]inputIS=new int[Twenk];
        String []inputStringBS=new String[Tenk];
        String[]inputStringSels=new String[Tenk];
        ArrayList<String>inputStringSysort= new ArrayList<>();
        String[]inputSIS=new String[Tenk];
        int x= 2+2;
        for (int p=0;!endoffile;p++){
            String f= input.readLine();
            if (f==null){
                endoffile=true;
            }else {
                inputBS[p]= Integer.parseInt(f);
                inputSelS[p]=Integer.parseInt(f);
                inputSyssort.add(Integer.valueOf(f));
                inputIS[p]=Integer.parseInt(f);
            }

        }input.close();
        for (int count=0;!endoffilestring;count++){
            String inputarr=input2.readLine();
            if (inputarr==null){
                endoffilestring=true;
            }else {
                inputStringBS[count]=inputarr;
                inputStringSels[count]=inputarr;
                inputStringSysort.add(inputarr);
                inputSIS[count]=inputarr;
            }
        }input2.close();
        output.write("Jose Salcedo");
            output.write("\nSelection sort" +
                    " nano seconds to sort "+inputSelS.length+" integers= "+SelctionSorttimed(inputSelS));
        output.write("\nBubble sort nano seconds to sort "+inputBS.length+" integers= " +
                BubbleSorttimed(inputBS));
         output.write("\nSystem sort nano seconds to sort "+inputSyssort.size()+" integers= " +
                 sortArray(inputSyssort));
         output.write("\nInsert sort nano seconds to sort "+inputIS.length+" integers= " +
                 insertSort(inputIS));
         output.write("\nSelection nano seconds to sort "+inputStringSels.length+" Strings= " +
                 StringSelectionSort(inputStringSels));
         output.write("\nBubble Sort nano seconds to sort "+inputStringBS.length+" Strings= " +
                 StringBubbleSort(inputStringBS));
         output.write("\nSystem sort nano seconds to sort "+inputStringSysort.size()+" Strings= " +
                 Stringarraysort(inputStringSysort));
         output.write("\nInsert sort nano seconds to sort "+inputSIS.length+" Strings= "+
                 SinsertSort(inputSIS));
        output.close();








    }

}
