import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        for (int i = 0; i<=2; i++ ) {
            int songlist;
            int genrecheck;
            String Title;
            String Artist;
            String Genre;

            System.out.println("Enter Title of the album");
            Title = input.nextLine();
            System.out.println("Enter Artist");
            Artist = input.nextLine();
            System.out.println("""
                    Enter Genre
                    Please select by number
                    You only have four choices:
                    1.hip-hop
                    2.easy listening
                    3.orchestral
                    4.your parents
                    5.theatre
                    (If it is not a number between 1-5 or another invalid choice is made
                    it will be easy listening to default)
                    """);
            genrecheck = input.nextInt();
            if (genrecheck == 1) {
                Genre = "hip-hop";
            } else if (genrecheck == 3) {
                Genre = "orchestral";
            } else if (genrecheck == 4) {
                Genre = "your parents";
            } else if (genrecheck == 5) {
                Genre = "theatre";
            } else Genre = "easy listening";
            System.out.println("Enter number of songs");
            songlist = input.nextInt();
            Album A = new Album(Title, Artist, Genre, songlist);
            System.out.println(A.toString());

        }


    }


}
