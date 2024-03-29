package com.example.commondisease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listViewId);
        final String[] deease_name = getResources().getStringArray(R.array.Disease_Name);

         ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.diseases_view,R.id.textViewId,deease_name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*String value = deease_name[position];
                Toast.makeText(MainActivityCD.this,value,Toast.LENGTH_LONG).show();*/

                if(position==0){
                    Intent intent = new Intent(MainActivity.this,Disease_1.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(MainActivity.this,Disease_2.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(MainActivity.this,Disease_3.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(MainActivity.this,Disease_4.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(MainActivity.this,Disease_5.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent = new Intent(MainActivity.this,Disease_6.class);
                    startActivity(intent);
                }
                if(position==6){
                    Intent intent = new Intent(MainActivity.this,Disease_7.class);
                    startActivity(intent);
                }
                if(position==7){
                    Intent intent = new Intent(MainActivity.this,Disease_8.class);
                    startActivity(intent);
                }
                if(position==8){
                    Intent intent = new Intent( MainActivity.this,Disease_9.class);
                    startActivity(intent);
                }
                if(position==9){
                    Intent intent = new Intent(MainActivity.this,Disease_10.class);
                    startActivity(intent);


                }

                if(position==10){
                    Intent intent = new Intent(MainActivity.this,Disease_11.class);
                    startActivity(intent);


                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.feedbackId)
        {
            Intent intent = new Intent(MainActivity.this,Feedback.class);
            startActivity(intent);
            return  true;
        }
        if(item.getItemId()==R.id.aboutusId)
        {
            Intent intent = new Intent(MainActivity.this,About.class);
            startActivity(intent);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}



