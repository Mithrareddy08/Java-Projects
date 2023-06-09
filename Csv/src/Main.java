import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        List<List<String>> Lastname = new ArrayList<>();
        Scanner s = new Scanner(new File("C:\\Users\\Mithra Reddy\\Documents\\Student.csv"));
        s.useDelimiter(",");
        while (s.hasNext())
        {
            System.out.print(s.next());
        }
        s.close();
        Comparator<List<String>> comp = new Comparator<List<String>>() {
            public int compare(List<String> marksLine1, List<String> marksLine2) {
                return Integer.valueOf(marksLine1.get(7)).compareTo(Integer.valueOf(marksLine2.get(7)));
            }
        };
        //Sorting using the comparator
        Collections.sort(Lastname, comp);

    }
}