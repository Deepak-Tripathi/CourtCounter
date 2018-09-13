package com.example.deepak.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA=0;
    int scoreB=0;

    public void ThreePointA(View view)
    {
        scoreA=scoreA+3;
        displayscoreA(scoreA);
    }

    public void TwoPointA(View view)
    {
        scoreA=scoreA+2;
        displayscoreA(scoreA);
    }

    public void FreeThrowA(View view)
    {
        scoreA=scoreA+1;
        displayscoreA(scoreA);
    }

    public void displayscoreA(int scoreA)
    {
        TextView txt=(TextView) findViewById(R.id.PrintScoreA);

        txt.setText(String.valueOf(scoreA));
    }

    public void ThreePointB(View view)
    {
        scoreB=scoreB+3;
        displayscoreB(scoreB);
    }

    public void TwoPointB(View view)
    {
        scoreB=scoreB+2;
        displayscoreB(scoreB);
    }

    public void FreeThrowB(View view)
    {
        scoreB=scoreB+1;
        displayscoreB(scoreB);
    }

    public void displayscoreB(int scoreA)
    {
        TextView txt=(TextView) findViewById(R.id.PrintScoreB);

        txt.setText(String.valueOf(scoreA));
    }
    public void Reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayscoreA(scoreA);
        displayscoreB(scoreB);
    }


}
