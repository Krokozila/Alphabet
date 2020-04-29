package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity4 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent4;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter4);

        ImageButton button4 = this.findViewById(R.id.button4);
        Button buttonLetters4 = findViewById(R.id.buttonLetters4);
        Button buttonSyllables4 = findViewById(R.id.buttonSyllables4);
        ImageButton buttonNextLetter4 = findViewById(R.id.buttonNextLetter4);

        playSound1();

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent4 = new Intent(Activity4.this, Activity3.class);
                startActivity(intent4);
            }
        });
        buttonLetters4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent4 = new Intent(Activity4.this, MainActivity.class);
                startActivity(intent4);
            }
        });
        buttonSyllables4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent4 = new Intent(Activity4.this, ActivitySyllables.class);
                startActivity(intent4);
            }
        });
        buttonNextLetter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent4 = new Intent(Activity4.this, Activity5.class);
                startActivity(intent4);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter4);
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
