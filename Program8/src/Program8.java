//Jose Salcedo
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
public class Program8 {

    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("Dracula");
        Path path1=FileSystems.getDefault().getPath("analysis.txt");
        BufferedReader input = new BufferedReader(new FileReader(String.valueOf(path)));
        BufferedWriter output= new BufferedWriter(new FileWriter(String.valueOf(path1)));
        tools t =new tools();
        boolean notendoffile=true;
        while (notendoffile) {
            String test = input.readLine();
            if (test==null){
                notendoffile=false;
            }else {
                test = test.toLowerCase();
                String[] sentence = t.CleanUp(test);
                for (int i = 0; i < sentence.length; ) {
                    String thingtoinsert = sentence[i];
                    if (!thingtoinsert.isEmpty()) {
                        t.callinsert(thingtoinsert);
                    }
                    i++;

                }
            }

        }
        t.callpostOrder();
        output.write("Jose Salcedo" +
                "\nnumber of nodes: "+t.counter+" \nheight: "+t.findheigth());
        int compare= (int) (t.Maxnodes()-t.counter);
        output.write("\nNodes not used based on max num of nodes "+ compare);
        input.close();
        output.close();


    }
}
