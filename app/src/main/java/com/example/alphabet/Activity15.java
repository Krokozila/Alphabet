package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity15 extends Activity {

    MediaPlayer mediaPlayer;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter15);

        ImageButton button15 = this.findViewById(R.id.button15);
        Button buttonLetters15 = findViewById(R.id.buttonLetters15);
        Button buttonSyllables15 = findViewById(R.id.buttonSyllables15);
        ImageButton buttonNextLetter15 = findViewById(R.id.buttonNextLetter15);

        playSound1();

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity15.this, Activity14.class);
                startActivity(intent);
            }
        });
        buttonLetters15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity15.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSyllables15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity15.this, ActivitySyllables.class);
                startActivity(intent);
            }
        });
        buttonNextLetter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity15.this, Activity16.class);
                startActivity(intent);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter15);
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
