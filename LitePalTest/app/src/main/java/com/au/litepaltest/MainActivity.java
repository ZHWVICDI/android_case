package com.au.litepaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createDatabase=(Button)findViewById(R.id.create_database);
        Button addData=(Button)findViewById(R.id.add_data);

        createDatabase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Connector.getDatabase();
            }
        });
        addData.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                    Book book=new Book();
                book.setName("the Da VINci code");
                Book book = new Book();
                book.setName("The Da Vinci Code");
                book.setAuthor("Dan Brown");
                book.setPages(454);
                book.setPrice(16.96);
                book.setPress("Unknow");
                book.save();
            }
        });
    }
}
