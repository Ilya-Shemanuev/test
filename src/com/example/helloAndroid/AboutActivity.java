package com.example.helloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Madness
 * Date: 03.12.13
 */
public class AboutActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView txt = (TextView) findViewById(R.id.about_content);
        String message = getIntent().getExtras().getString("key");
        String tmp;

        tmp = txt.getText().toString();

        txt.setText(tmp + "\n\n" + message);
    }
}
