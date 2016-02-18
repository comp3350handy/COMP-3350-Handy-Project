package rishabhbhandari.com.handy;

import java.util.ArrayList;

/**
 * Created by rishabhbhandari on 2016-02-17.
 */
public class TextNoteBL
{
    
    TextNotePL textNoteObj;
   // public ArrayList<TextNotePL> noteList=new ArrayList<TextNotePL>();



    public TextNoteBL()
    {

    }

    public void create(String notename, String notelabel, String noteit)
    {
        textNoteObj= new TextNotePL(notename,notelabel,noteit);
    }

}
