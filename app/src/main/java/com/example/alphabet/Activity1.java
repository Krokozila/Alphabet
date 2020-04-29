package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity1 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent1;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter1);

        ImageButton button1 = this.findViewById(R.id.button1);
        Button buttonLetters1 = findViewById(R.id.buttonLetters1);
        Button buttonSyllables1 = findViewById(R.id.buttonSyllables1);
        ImageButton buttonNextLetter1 = findViewById(R.id.buttonNextLetter1);

        playSound1();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent1 = new Intent(Activity1.this, Activity32.class);
                startActivity(intent1);
            }
        });
        buttonLetters1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent1 = new Intent(Activity1.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        buttonSyllables1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent1 = new Intent(Activity1.this, ActivitySyllables.class);
                startActivity(intent1);
            }
        });
        buttonNextLetter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent1 = new Intent(Activity1.this, Activity2.class);
                startActivity(intent1);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter1);
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
