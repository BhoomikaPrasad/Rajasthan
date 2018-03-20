package alabs.rajasthanhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by DHANUSH on 20-03-2018.
 */

public class restStay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ONE ONE", "Italian,Mexican\n 8 mi", R.drawable.oneone));
        words.add(new Word("DRAGON HOUSE", "Chinese\n 3 mi", R.drawable.dragon_house));
        words.add(new Word("GIARDINO", "Traditional rajasthani food\n 4 mi", R.drawable.giardino));
        words.add(new Word("MODERN KITCHEN", "International dishes\n 7.2 mi", R.drawable.jaipur_modern_kitchen));
        words.add(new Word("KABAB FACTORY", "Halal cut Non-Veg\n 10 mi", R.drawable.kabab_factory));
        words.add(new Word("SUVARNA MAHAL", "Veg cuisines \n 8 mi", R.drawable.suvarna_mahal));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.background_restaurant
        );
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }


    /**
     * Clean up the media player by releasing its resources.
     */


}


