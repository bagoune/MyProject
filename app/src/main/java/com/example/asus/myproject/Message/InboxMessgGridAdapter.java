package com.example.asus.myproject.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myproject.R;

import java.util.ArrayList;

/**
 * Created by ASUS on 2018/01/19.
 */

public class InboxMessgGridAdapter extends BaseAdapter {
    private ArrayList<InboxMessgGridItem> items;
    private static LayoutInflater inflater=null;

    public InboxMessgGridAdapter(Context context, ArrayList<InboxMessgGridItem> items) {
        this.items=items;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView name,message;
        ImageView imgContactPic;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate( R.layout.item_inbox_messg, null);
        holder.name=(TextView) rowView.findViewById(R.id.contactname);
        holder.message=(TextView) rowView.findViewById(R.id.message);
        holder.imgContactPic = (ImageView) rowView.findViewById(R.id.imgContactPic);
        InboxMessgGridItem item = items.get(position);
        holder.name.setText(item.getTxtName());
        holder.message.setText(item.gettxtMessg());
        holder.imgContactPic.setBackgroundResource(item.getimgContactPic());

        return rowView;
    }

}
