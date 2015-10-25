package test.myapplication;

/**
 * Created by Austin on 10/24/2015.
 */
public class Globals {
    private static Globals instance;

    public String book;
    public int chapter;
    public int verse;

    private Globals(){};

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance=new Globals();
        }
        return instance;
    }

    public void fillData(String book1, int ch1, int v1)
    {
        book = book1;
        chapter = ch1;
        verse = v1;

    }
}
