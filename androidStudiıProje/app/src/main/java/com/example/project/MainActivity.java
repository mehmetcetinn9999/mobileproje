package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.widget.RelativeLayout;
import android.widget.SearchView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private RelativeLayout relativeLayout;
    private SearchView searchView;
    private ArrayAdapter<String> adapter;
    private String[] topics= {"Events","User Questions",};
    private String[] price= {"500TL"};
    private String[] date= {"11.11.2024"};
    private int[] view1= {R.drawable.images};
    private String[] text= {"İstanbul'un kalbinde yer alan İstanbul Üniversitesi, tarihi dokusu ve gençlik enerjisiyle seni bekliyor! Kampüsümüzü gezerek tarihi binalarımızın arasında kaybol, kütüphanelerimizde kitap kokusunu içine çek ve öğrenci kulüplerimizin renkli etkinliklerine katıl. Üniversite hayatını yakından tanımak için harika bir fırsat!"};
    private Intent intent;
    static public Bitmap viewf1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.main_activity_listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,topics);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (topics[i].equals("User Questions")) {
                    Intent intent = new Intent(MainActivity.this, UserQuestionsActivity.class);
                    startActivity(intent);
            } else {
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("topics",topics[i]);
                    intent.putExtra("text",text[i]);
                    intent.putExtra("price",price[i]);
                    intent.putExtra("date",date[i]);
                    viewf1 = BitmapFactory.decodeResource(getApplicationContext().getResources(),view1[i]);
                    startActivity(intent);
                                            }
                                        }

        });
    }


}