package com.sixtech.paulchidi.cuweb;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends ListActivity {


    protected  String pWebsites[] = {
            "DataCenter",
            "Student Portal",
            "Moodle",
            "Covenant university",
            "Chaplaincy",
            "Ice 2018",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayAdapter<String> aaCuweb = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, pWebsites );
        setListAdapter(aaCuweb);




    }



    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        if (position ==1){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("http://portal.covenantuniversity.edu.ng/"));
            startActivity(intent);


        }
       else if (position == 0){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("Datacenter.cu"));
            startActivity(intent);

        }
        else if (position == 2){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("http://moodle2.covenantuniversity.edu.ng/"));
            startActivity(intent);

        }
        else if (position == 3){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("http://covenantuniversity.edu.ng/"));
            startActivity(intent);

        }
        else if (position == 4){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("http://chaplaincy.covenantuniversity.edu.ng/"));
            startActivity(intent);

        }
        else if (position == 5){
            Intent intent = new Intent(this, ViewWebsite.class);
            intent.setData(Uri.parse("http://ice2018.com/"));
            startActivity(intent);

        }

            super.onListItemClick(l, v, position, id);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
