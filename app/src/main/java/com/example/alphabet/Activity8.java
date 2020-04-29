package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity8 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent8;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter8);

        ImageButton button8 = this.findViewById(R.id.button8);
        Button buttonLetters8 = findViewById(R.id.buttonLetters8);
        Button buttonSyllables8 = findViewById(R.id.buttonSyllables8);
        ImageButton buttonNextLetter8 = findViewById(R.id.buttonNextLetter8);

        playSound1();

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent8 = new Intent(Activity8.this, Activity7.class);
                startActivity(intent8);
            }
        });
        buttonLetters8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent8 = new Intent(Activity8.this, MainActivity.class);
                startActivity(intent8);
            }
        });
        buttonSyllables8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent8 = new Intent(Activity8.this, ActivitySyllables.class);
                startActivity(intent8);
            }
        });
        buttonNextLetter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent8 = new Intent(Activity8.this, Activity9.class);
                startActivity(intent8);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter8);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }
}
