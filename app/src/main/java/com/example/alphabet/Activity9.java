package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity9 extends Activity {

    MediaPlayer mediaPlayer;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter9);

        ImageButton button9 = this.findViewById(R.id.button9);
        Button buttonLetters9 = findViewById(R.id.buttonLetters9);
        Button buttonSyllables9 = findViewById(R.id.buttonSyllables9);
        ImageButton buttonNextLetter9 = findViewById(R.id.buttonNextLetter9);

        playSound1();

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity9.this, Activity8.class);
                startActivity(intent);
            }
        });
        buttonLetters9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity9.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSyllables9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity9.this, ActivitySyllables.class);
                startActivity(intent);
            }
        });
        buttonNextLetter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity9.this, Activity10.class);
                startActivity(intent);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter9);
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
