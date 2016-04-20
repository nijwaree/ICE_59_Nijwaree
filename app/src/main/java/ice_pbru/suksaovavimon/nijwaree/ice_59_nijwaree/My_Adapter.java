package ice_pbru.suksaovavimon.nijwaree.ice_59_nijwaree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ICE on 20/4/2559.
 */
public class My_Adapter extends BaseAdapter{

    // Explicit
    private Context context;
    private int[] IconInts;
    private String[] titleStrings, detailStrings;

    public My_Adapter(Context context, String[] detailStrings, String[] titleStrings, int[] iconInts) {
        this.context = context;
        this.detailStrings = detailStrings;
        this.titleStrings = titleStrings;
        IconInts = iconInts;
    }

    public My_Adapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        IconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;

    }

    @Override
    public int getCount() {
        return IconInts.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.com_listview, viewGroup, false);

        // for icon
        ImageView IconImageview = (ImageView) view1.findViewById(R.id.imageView);
        IconImageview.setImageResource(IconInts[i]);

        // for title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        // for detail
        TextView detailTextview = (TextView) view1.findViewById(R.id.textView3);
        detailTextview.setText(detailStrings[i]);

        return view1;
    }
} // main class
