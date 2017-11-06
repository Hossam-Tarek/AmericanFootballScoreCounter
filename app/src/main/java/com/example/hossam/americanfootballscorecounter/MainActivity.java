package com.example.hossam.americanfootballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixPointsTeamA(View v)
    {
        scoreTeamA += 6;
        displayTeamA();
    }

    public void addThreePointsTeamA(View v)
    {
        scoreTeamA += 3;
        displayTeamA();
    }

    public void addTwoPointsTeamA(View v)
    {
        scoreTeamA += 2;
        displayTeamA();
    }

    public void addOnePointTeamA(View v)
    {
        scoreTeamA++;
        displayTeamA();
    }

    public void displayTeamA()
    {
        TextView tv = (TextView) findViewById(R.id.score_team_a);
        tv.setText(String.valueOf(scoreTeamA));
    }

    public void addSixPointsTeamB(View v)
    {
        scoreTeamB += 6;
        displayTeamB();
    }

    public void addThreePointsTeamB(View v)
    {
        scoreTeamB += 3;
        displayTeamB();
    }

    public void addTwoPointsTeamB(View v)
    {
        scoreTeamB += 2;
        displayTeamB();
    }

    public void addOnePointTeamB(View v)
    {
        scoreTeamB++;
        displayTeamB();
    }

    public void displayTeamB()
    {
        TextView tv = (TextView) findViewById(R.id.score_team_b);
        tv.setText(String.valueOf(scoreTeamB));
    }

    public void reset(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA();
        displayTeamB();
    }
}





