import java.sql.SQLOutput;

public class JackOLantern {
    private String [][] faceFeatures;
    public JackOLantern(String[][] features)
    {
        this.faceFeatures = features;
    }
    public void edit(String replace,int row, int column)
    {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        for(int i=0;i<faceFeatures.length;i++)
        {
            for(int j=0;j<faceFeatures[i].length;j++)
            {
                faceFeatures[i][j] = str;
            }
        }
    }
    public String toString()
    {
        String line = "";
        for(String[] x: faceFeatures)
        {
            for(String y:x)
            {
                line += (y);
            }
            line += "\n";
        }
        return line;
    }




}
