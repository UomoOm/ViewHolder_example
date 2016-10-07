package om.studies.om.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class Adapter extends ArrayAdapter<String> {


    public Adapter(Context context, List<String> list) {
        super(context, R.layout.list_item, list);


    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        View root = inflater.inflate(R.layout.list_item, parent, false);
//        TextView text = (TextView) root.findViewById(R.id.textView);
//        text.setText(getItem(position));
//
//        return  root;
        ViewHolder holder;
        View rowView = convertView;
        if (rowView == null) {
            rowView = inflater.inflate(R.layout.list_item, null, true);
            holder = new ViewHolder();
            holder.textView = (TextView) rowView.findViewById(R.id.textView);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }


        holder.textView.setText(getItem(position));

        return rowView;


    }

    class ViewHolder {
        public TextView textView;
    }
}


