package alabs.rajasthanhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by DHANUSH on 20-03-2018.
 */

public class hotelStay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("JAIPUR CITY", "90 M AWAY\n 3.5 stars ", R.drawable.jaipurcity));
        words.add(new Word("DRS HOTEL", "1.8 mi AWAY\n3.5 stars", R.drawable.drs));
        words.add(new Word("DON JOHN", "2 mi AWAY\n3.6 stars", R.drawable.donjon));
        words.add(new Word("VACH INN", "3 mi AWAY\n4 stars", R.drawable.vachi_inn));
        words.add(new Word("HARSH PARADISE", " 2 mi AWAY\n3.8 stars", R.drawable.harsh_paradise));
        words.add(new Word("FLAGSHIP 250", "5 mi AWAY\n 4.5 stars", R.drawable.flagship250));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_hotel);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }


    /**
     * Clean up the media player by releasing its resources.
     */


}


