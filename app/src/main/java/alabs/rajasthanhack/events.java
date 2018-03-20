package alabs.rajasthanhack;

/**
 * Created by DHANUSH on 20-03-2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by DHANUSH on 20-03-2018.
 */

public class events extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("CAMEL FESTIVAL", "Annually from the month of karthik,pushkar", R.drawable.camelfestival_pushkar));
        words.add(new Word("ELEPHANT FESTIVAL", "Annually on Holi\n Jaipur", R.drawable.elephant_festival));
        words.add(new Word("FOLK FESTIVAL", "On Sharadh Poornima October\n Jodhpur", R.drawable.folk_festival));
        words.add(new Word("LITERATURE FESTIVAL", "Khumb of literature\n Jaipur", R.drawable.literature_festival));
     //   words.add(new Word("MEWAR FESTIVAL", "Spring season\n Udaipur", R.drawable.mewarfestival));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.background_events
        );
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }


    /**
     * Clean up the media player by releasing its resources.
     */


}