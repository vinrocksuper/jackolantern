public class runner {
    public static void main(String[] args)
    {
        String[][] features = new String[][]{
                {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
                {" "," ","@"," "," "," "," "," "," "," "," "," "," "," "," ","@"," "," "},
                {" "," "," ","@"," "," "," "," "," "," "," "," "," "," ","@"," "," "," "},
                {" "," "," "," ","@"," "," "," "," "," "," "," "," ","@"," "," "," "," "},
                {" "," "," "," "," ","@"," "," "," "," "," "," ","@"," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
                {" "," "," ","@"," "," "," "," "," "," "," "," "," "," ","@"," "," "," "},
                {" "," "," ","@"," "," "," "," "," "," "," "," "," "," ","@"," "," "," "},
                {" "," "," ","@"," "," "," "," "," "," "," "," "," "," ","@"," "," "," "},
                {" ","@"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","@"},
                {" ","@","@"," "," "," "," "," "," "," "," "," "," "," "," "," ","@","@"},
                {" ","@","@","@"," "," "," "," "," "," "," "," "," "," "," ","@","@","@"},
                {" "," ","@","@","@","@"," "," "," "," "," "," "," "," ","@","@","@"," "},
                {" "," "," ","@","@","@","@","@","@","@","@","@","@","@","@","@","@"," "},
                {" "," "," "," ","@","@","@","@","@","@","@","@","@","@","@","@"," "," "},
                {" "," "," "," "," ","@","@","@","@","@","@","@","@","@","@"," "," "," "},
                {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},

                
                
                
        };



        JackOLantern spooky = new JackOLantern(features);
        System.out.println(spooky.toString());


    }
}


