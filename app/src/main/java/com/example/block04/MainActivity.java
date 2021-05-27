package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = MediaPlayer.create(this,R.raw.chidi_blauri);
        Switch switchlooping = (Switch) findViewById(R.id.switch_looping);
        switchlooping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                music.setLooping(isChecked);
            }
        });

    }

    public void start(View v)
    {
        music.start();
    }
    public void stop(View v)
    {
        if (music.isPlaying())
        music.pause();
    }
}
