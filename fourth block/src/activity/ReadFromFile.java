package activity;

import java.io.*;
import java.util.ArrayList;

class ReadFromFile {

    private ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String content = reader.readLine();
            while (content != null){
                lines.add(content);
                content = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        return lines;
    }

    String[][] getInfoFromFile(String fileName) throws IOException {
        ArrayList<String> lines = readFile(fileName);
        String[][] songListInfo = new String[lines.size()][];

        for(int i = 0; i < songListInfo.length; i++){
            songListInfo[i] = lines.get(i).split(",");
        }

        return songListInfo;
    }
}
