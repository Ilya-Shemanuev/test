package com.example.helloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick()
    {
        for(int i=0; i<10;i++){
            int a = i+1;
        }

        EditText edit = (EditText) findViewById(R.id.editText);

        Intent intent = new Intent(MyActivity.this, AboutActivity.class);
        intent.putExtra("key", edit.getText().toString());

        startActivity(intent);
    }
}
