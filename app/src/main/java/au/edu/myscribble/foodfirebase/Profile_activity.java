package au.edu.myscribble.foodfirebase;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

//import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import static android.widget.Toast.LENGTH_SHORT;

public class Profile_activity extends AppCompatActivity
{

    private static final String TAG = "Profile activity";

    String description;
    private Picasso picasso = Picasso.get();

    Profile profile;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activity);





        String imageName = getIntent().getStringExtra("image_name");
        String user_image = getIntent().getStringExtra("image_url");
        String method =  getIntent().getStringExtra("method");
        String ingredients=  getIntent().getStringExtra("ingredients");


        TextView name = findViewById(R.id.Profile_Title);
        ImageView imageview = findViewById(R.id.Profile_Image);
        TextView foodingre = (TextView)findViewById(R.id.ingredients);
        TextView cooking = findViewById(R.id.method);





        name.setText(imageName);
        foodingre.setText(ingredients);
        cooking.setText(method);

       Log.d(TAG ,"this is " + user_image);

         Toast.makeText(getApplicationContext(),"this is " + user_image,LENGTH_SHORT).show();

        Log.d(TAG ,"this is " + imageName);

        Toast.makeText(getApplicationContext(),"this is " + imageName,LENGTH_SHORT).show();





        Picasso.get().load(user_image).into(imageview);

        name.setText(imageName);


    }


}

