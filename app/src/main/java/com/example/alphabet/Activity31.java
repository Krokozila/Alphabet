package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity31 extends Activity {

    MediaPlayer mediaPlayer;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter31);

        ImageButton button31 = this.findViewById(R.id.button31);
        Button buttonLetters31 = findViewById(R.id.buttonLetters31);
        Button buttonSyllables31 = findViewById(R.id.buttonSyllables31);
        ImageButton buttonNextLetter31 = findViewById(R.id.buttonNextLetter31);

        playSound1();

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity31.this, Activity30.class);
                startActivity(intent);
            }
        });
        buttonLetters31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity31.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSyllables31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity31.this, ActivitySyllables.class);
                startActivity(intent);
            }
        });
        buttonNextLetter31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity31.this, Activity32.class);
                startActivity(intent);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter31);
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
