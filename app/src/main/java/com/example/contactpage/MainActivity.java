package com.example.contactpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] title={
           "FirstName LastName",
            "FirstName LastName",
            "FirstName LastName",
            "FirstName LastName",


    };

    String[] description={
            "Company name",
            "Company name",
            "Company name",
            "Company name",

    };
    String[] description1={
            "Group",
            "Group",
            "Group",
            "Group",


    };

    Integer[] imgs = {
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
    };
    ListView listView1;

    String[] tit={
            "FirstName ",
            "FirstName ",
            "FirstName ",
            "FirstName ",


    };

    String[] des={
            "Company name",
            "Company name",
            "Company name",
            "Company name",

    };
    String[] des1={
            "Group",
            "Group",
            "Group",
            "Group",


    };

    Integer[] img = {
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MylistAdapter adapter = new MylistAdapter(this,title,description,description1,imgs);

        listView = findViewById(R.id.recent);
        listView.setAdapter(adapter);

        MylistAdapter adapter1 = new MylistAdapter(this,tit,des,des1,imgs);
        listView1 = findViewById(R.id.all);
        listView1.setAdapter(adapter1);





    }
}
