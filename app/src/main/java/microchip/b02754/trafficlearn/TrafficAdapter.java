package microchip.b02754.trafficlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by B02754 on 9/11/2016.
 */
public class TrafficAdapter extends BaseAdapter{
    //Explicit
    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] ints;

    public TrafficAdapter(Context context,
                          String[] titleStrings,
                          String[] detailStrings,
                          int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.traffic_listview,parent,false);
        //Bind Widget
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        //Show view
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);
        imageView.setImageResource(ints[position]);

        return view;
    }
}//Main class
