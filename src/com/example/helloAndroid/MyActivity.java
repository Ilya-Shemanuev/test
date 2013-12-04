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

    public void onClick(View v)
    {
        EditText edit = (EditText) findViewById(R.id.editText);
        String example; //for commit on GitHu
        //one more comment

        Intent intent = new Intent(MyActivity.this, AboutActivity.class);
        intent.putExtra("key", edit.getText().toString());

        startActivity(intent);
    }
}
