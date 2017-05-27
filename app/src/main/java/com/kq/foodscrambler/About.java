package com.kq.foodscrambler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_screen);
        getSupportActionBar().setTitle("About");

        TextView aboutText = (TextView) findViewById(R.id.addInformation);

        String aboutAbout = "This application was created by Loren Ivanov and Teodora Dimitrova. " +
                "The idea came from Loren. Every day he struggles when Teodora asks him where they are going to eat. " +
                "So he got tired of thinking where to eat and remembered all the good places they have been. " +
                "He tough that it will be wonderful if he has application which will help him to choose and save places to eat. " +
                "The application not only saves the places but also helps you decide choosing dish to eat. " +
                "The application also has a feature which can suggest new place to eat near you. " +
                "\nGive us заверки, please :)";
        aboutText.setText(aboutAbout);

    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

}
