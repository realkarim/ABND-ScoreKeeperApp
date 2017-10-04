package com.realkarim.apps.scorekeeper;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ScoreActivity extends AppCompatActivity {

    @BindView(R.id.score1)
    TextView score1Text;
    @BindView(R.id.score1up)
    Button score1UpButton;
    @BindView(R.id.score1down)
    Button score1DownButton;
    @BindView(R.id.possession1)
    TextView possession1Text;
    @BindView(R.id.possession1up)
    Button possession1UpButton;

    @BindView(R.id.score2)
    TextView score2Text;
    @BindView(R.id.score2up)
    Button score2UpButton;
    @BindView(R.id.score2down)
    Button score2DownButton;
    @BindView(R.id.possession2)
    TextView possession2Text;
    @BindView(R.id.possession2up)
    Button possession2UpButton;

    private Integer score1 = 0;
    private Integer possession1 = 50;

    private Integer score2 = 0;
    private Integer possession2 = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.score1up)
    public void score1Up(View view) {
        score1++;
        score1Text.setText(score1.toString());
    }

    @OnClick(R.id.score1down)
    public void score1Down(View view) {
        if (score1 > 0)
            score1--;
        score1Text.setText(score1.toString());
    }

    @OnClick(R.id.possession1up)
    public void possession1Up(View view) {
        if (possession1 < 100) {
            possession1++;
            possession2--;
        }
        possession1Text.setText(possession1 + "%");
        possession2Text.setText(possession2 + "%");
    }

    @OnClick(R.id.score2up)
    public void score2Up(View view) {
        score2++;
        score2Text.setText(score2.toString());
    }

    @OnClick(R.id.score2down)
    public void score2Down(View view) {
        if (score2 > 0)
            score2--;
        score2Text.setText(score2.toString());
    }

    @OnClick(R.id.possession2up)
    public void possession2Up(View view) {
        if (possession2 < 100) {
            possession2++;
            possession1--;
        }
        possession1Text.setText(possession1 + "%");
        possession2Text.setText(possession2 + "%");
    }

    @OnClick(R.id.reset)
    public void reset(View view) {
        score1 = 0;
        score1Text.setText(score1.toString());

        possession1 = 50;
        possession1Text.setText(possession1 + "%");

        score2 = 0;
        score2Text.setText(score2.toString());

        possession2 = 50;
        possession2Text.setText(possession2 + "%");
    }
}
