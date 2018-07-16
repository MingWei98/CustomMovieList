package sg.edu.rp.c346.custommovielist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16038911 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    // Create variable for Context, Resource and Objects
    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    // TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MovieItem> objects) {
        super(context, resource, objects);

        // Initialize the variables
        parent_context = context;
        layout_id = resource; // movie_item.xml
        movieList = objects;
    }

    // Method will be called when running one row item
    // Method will be called when scrolling
    // Example if there is 10 rows, this method will be called 10 times
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Get the position of the row using .get(position)
        MovieItem currentItem = movieList.get(position);

        // Use the get___() method defined in MovieItem Class to retrieve the name/date
        String name = currentItem.getName();
        String date = currentItem.getDate();

        // Set the name and date to textView using setText()
        tvName.setText(name);
        tvDate.setText(date);

        return rowView;
    }
}
