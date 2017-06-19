package com.example.admin.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
        Switch switchMusic;
        MediaPlayer musicPlayer; //MediaPlayer는 음악관련 클래스
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchMusic=(Switch)findViewById(R.id.switch_music); //참조값 대입
        musicPlayer=MediaPlayer.create(this,R.raw.music);
        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchMusic.isChecked()){ //isChecked는 불리언타입이라 이때true 반환
                    musicPlayer.start();
                }
                else
                    musicPlayer.pause();
            }
        });
    }

    //액티비티가 중지될때 나타나는
    @Override
    protected void onStop() {
        super.onStop();
        musicPlayer.stop();
    }
}
