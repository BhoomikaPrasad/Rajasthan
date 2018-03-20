package alabs.rajasthanhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by DHANUSH on 20-03-2018.
 */

public class find_traveller extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("AMAR", "Android Developer\n AGE 35", R.drawable.apple));
        words.add(new Word("JOHN MARTIN", "Govt Officer\nAGE 26", R.drawable.bag));
        words.add(new Word("DEVANSHU MISHRA", "Photographer\nAGE 27", R.drawable.cat));
        words.add(new Word("ASHUTOSH TIWARY", "CRICKETER\nAGE 40", R.drawable.dog));
        words.add(new Word("AAKASH SINGH", "Singer \nAGE 28", R.drawable.elephant));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }


    /**
     * Clean up the media player by releasing its resources.
     */


}

