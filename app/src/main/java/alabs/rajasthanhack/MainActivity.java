package alabs.rajasthanhack;

        import android.content.Intent;
        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.CardView;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ImageView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ImageView tourist= (ImageView) findViewById(R.id.women);

     tourist.setOnClickListener(new View.OnClickListener() {
         // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
             Toast.makeText(MainActivity.this,"SOS sent ",Toast.LENGTH_LONG).show();}
     });


    }
    void detail_tourist(View view){
        Intent intent = new Intent(MainActivity.this,touristPlace.class);
        startActivity(intent);  }
    void detail_hotel(View view){



        Intent intent = new Intent(MainActivity.this,hotelStay.class);
        startActivity(intent);  }
    void detail_rest(View view){
        Intent intent = new Intent(MainActivity.this,restStay.class);
        startActivity(intent);  }

    void detail_people(View view){
        Intent intent = new Intent(MainActivity.this,find_traveller.class);
        startActivity(intent);  }

    void detail_event(View view){
        Intent intent = new Intent(MainActivity.this,events.class);
        startActivity(intent);  }


    void detail_shop(View view){
        Intent intent = new Intent(MainActivity.this,shops.class);
        startActivity(intent);  }

}






