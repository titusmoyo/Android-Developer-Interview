package com.zhoubrian.androiddeveloperinterview;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FrontPage extends AppCompatActivity implements View.OnClickListener {

    Button bsimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        bsimple = (Button) findViewById(R.id.bsq);

        bsimple.setOnClickListener(this);

    }//end of onCreate

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.bsq:
                Intent go_To_SimpleQsns=new Intent(FrontPage.this,Simple_question.class);
                startActivity(go_To_SimpleQsns);
                break;
        }

    }//end of onClick..

}//end of FrontPage...
