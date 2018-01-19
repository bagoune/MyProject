package com.example.asus.myproject.Message;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.asus.myproject.R;

import java.util.ArrayList;

public class InboxMessageActivity extends AppCompatActivity {
    private AppCompatActivity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inbox_message );

        context=this;

        GridView gridView = (GridView) findViewById(R.id.grdInboxMessgGridView);

        ArrayList<InboxMessgGridItem> InboxMessgGridItem =new ArrayList<>();

        InboxMessgGridItem item1=new InboxMessgGridItem();
        item1.setTxtName("namecontact1");
        item1.settxtMessg("helllllllo");
        item1.setimgContactPic(R.drawable.img_sticker);

        InboxMessgGridItem item2=new InboxMessgGridItem(R.drawable.img_sticker,"namecontact2","sallllllam");

        InboxMessgGridItem.add(item1);
        InboxMessgGridItem.add(item2);

        gridView.setAdapter(new InboxMessgGridAdapter(this,InboxMessgGridItem));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menumessg, menu);
            MenuItem update_item = menu.add(0, 2, 1, "Item 3");
            update_item.setIcon(R.drawable.ic_search);
            update_item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return true;
    }

}
