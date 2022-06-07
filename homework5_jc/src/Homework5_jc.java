
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework5_jc {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        File file = new File ("test.csv");
        AppData data = new AppData(new String[]{"Value 1", "Value 2", "Value 3"},
                new int[][]{{110, 222, 123},{198, 213, 455}});
        save(data);

        load(file);
    }

    public static void save (AppData data){


            try (PrintWriter writer = new PrintWriter("test.csv")) {

                StringBuilder sb = new StringBuilder();
                for (int i=0; i<data.getHeader().length; i++){
                    sb.append(data.getHeader()[i]);
                    if (i<data.getHeader().length) {
                    sb.append(';');}
                }
                sb.append('\n');
                for (int i=0; i<data.getData().length; i++){
                    for (int j=0; j<data.getData()[i].length; j++){
                    sb.append(data.getData()[i][j]);
                    if (i<data.getData().length && j<data.getData()[i].length) {
                        sb.append(';');}
                     
                } sb.append('\n');
                }


                writer.write(sb.toString());

                System.out.println("done!");

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
    public static void load (File file) throws FileNotFoundException {
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.replaceAll("(^\\s+|\\s+$)", "").split("/n|;");

                lines.add(Arrays.asList(values));
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String header = "";
        int lineNo = 1;
        for (List<String> line : lines) {

       //     for (String value : line) {
           //     if (lineNo == 1) {

                    header = header + Arrays.toString(line.toArray(new String[0]));

          //          data.setHeader(header);
                  //  System.out.println(Arrays.toString(header));

                }
        System.out.println(header);

  //              else {String[] datum = value.split(";");
   //             int[] = Integer
    //                data.setData(datum);
                lineNo++;



    }

    }



