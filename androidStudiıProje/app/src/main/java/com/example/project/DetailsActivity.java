package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {
    private TextView detailsActivityTopic1,price1,date1;
    private ImageView viewF1;
    private TextView text1;
    private Intent get_intent;
    private String text_,detailsActivityTopic1_,viewF1_,date1_,price1_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        detailsActivityTopic1 =findViewById(R.id.detailsActivityTopic);
        text1 =findViewById(R.id.text12);
        viewF1 =findViewById(R.id.viewF);
        date1 =findViewById(R.id.date);
        price1 =findViewById(R.id.price);

        get_intent =getIntent();

        detailsActivityTopic1_=get_intent.getStringExtra("topics");
        text_=get_intent.getStringExtra("text");
        price1_=get_intent.getStringExtra("price");
        date1_=get_intent.getStringExtra("date");

        if(!TextUtils.isEmpty(detailsActivityTopic1_) && !TextUtils.isEmpty(text_)){
            detailsActivityTopic1.setText(detailsActivityTopic1_);
            text1.setText(text_);
            viewF1.setImageBitmap(MainActivity.viewf1);
            date1.setText(date1_);
            price1.setText(price1_);
    }}
}