package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity13 extends Activity {

    MediaPlayer mediaPlayer;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter13);

        ImageButton button13 = this.findViewById(R.id.button13);
        Button buttonLetters13 = findViewById(R.id.buttonLetters13);
        Button buttonSyllables13 = findViewById(R.id.buttonSyllables13);
        ImageButton buttonNextLetter13 = findViewById(R.id.buttonNextLetter13);

        playSound1();

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity13.this, Activity12.class);
                startActivity(intent);
            }
        });
        buttonLetters13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity13.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSyllables13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity13.this, ActivitySyllables.class);
                startActivity(intent);
            }
        });
        buttonNextLetter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity13.this, Activity14.class);
                startActivity(intent);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter13);
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
