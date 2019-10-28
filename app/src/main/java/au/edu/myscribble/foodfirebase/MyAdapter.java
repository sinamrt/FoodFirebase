package au.edu.myscribble.foodfirebase;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

  private ItemClickListener itemClickListener;
    Context context;
    ArrayList<Profile> profiles;

    public MyAdapter(Context c, ArrayList<Profile> p)
    {
        context = c;
        profiles = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.name.setText(profiles.get(position).getName());
        holder.name.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        holder.description.setText(profiles.get(position).getDescription());
         holder.description.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));

         //holder.ratingBar.setNumStars(5);
         holder.ratingBar.setRating(profiles.get(position).getRating());



        Picasso.get().load(profiles.get(position).getUrl()).into(holder.profilePic);

        String url = profiles.get(position).getUrl();

        Picasso.get().load(url).resize(500, 500).into(holder.profilePic);

        holder.setItemClickListener(new ItemClickListener()
        {
            @Override
            public void onClick(View view, int position, boolean isLongClick)
            {


                    String url = profiles.get(position).getUrl();


                String user_Url = profiles.get(position).getUrl();
                String username = profiles.get(position).getName();
                String methodOfCookcing = profiles.get(position).getMethod();
                String ingredients = profiles.get(position).getIngredients();

                 profiles.get(position).getUrl();



                Log.d(TAG, "onClick: clicked on: " + profiles.get(position));

                Toast.makeText(context, "here is " + profiles.get(position) , Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, Profile_activity.class);
                intent.putExtra("image_url", user_Url);
                intent.putExtra("image_name", username);
                intent.putExtra("method",methodOfCookcing);
                intent.putExtra("ingredients",ingredients);

                context.startActivity(intent);






            }

        });
    }

    @Override
    public int getItemCount()
    {
        return profiles.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener
    {


        private ItemClickListener itemClickListener;

        TextView name, description;
        ImageView profilePic;
        Button btn;
        RatingBar ratingBar = (RatingBar) itemView.findViewById(R.id.rate_bar);


        public MyViewHolder(View itemView)
        {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.food_title);



           description = (TextView) itemView.findViewById(R.id.food_description);
            profilePic = (ImageView) itemView.findViewById(R.id.ImgView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);


        }

        public void setItemClickListener(ItemClickListener itemClickListener)
        {
          this.itemClickListener = itemClickListener;
        }


        @Override
        public void onClick(View v)
        {
          itemClickListener.onClick(v,getAdapterPosition(),false);

        }

        @Override
        public boolean onLongClick(View v)
        {

            itemClickListener.onClick(v,getAdapterPosition(),true);

            return true;
        }
    }
    }


