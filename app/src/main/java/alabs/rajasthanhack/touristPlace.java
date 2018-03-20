package alabs.rajasthanhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by DHANUSH on 20-03-2018.
 */

public class touristPlace extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("AMER FORT", "16TH Century Hill Top Fort and Palace\n 8 mi", R.drawable.amerfort));
        words.add(new Word("CITY PALACE", "Lavish 1700 s palace complex and Museum\n50mi", R.drawable.citypalace));
        words.add(new Word("HAWA MAHAL", "Pink or Sand Stone - Palace of the winds\n25mi", R.drawable.hawamahal));
        words.add(new Word("JANTHAR MANTHAR", "Instruments for austronomical observation\n40mi", R.drawable.jantarmantar));
        words.add(new Word("MEHRANGARH", "Massive Historic Site with preserved art\28mi", R.drawable.mehrangarh));
        words.add(new Word("UMAID BHAWAN PALACE", "Regal Hotel with a spa and free breakfast\100mi", R.drawable.umaidbhawanpalace));

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


