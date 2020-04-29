package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity26 extends Activity {

    MediaPlayer mediaPlayer;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter26);

        ImageButton button26 = this.findViewById(R.id.button26);
        Button buttonLetters26 = findViewById(R.id.buttonLetters26);
        Button buttonSyllables26 = findViewById(R.id.buttonSyllables26);
        ImageButton buttonNextLetter26 = findViewById(R.id.buttonNextLetter26);

        playSound1();

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity26.this, Activity25.class);
                startActivity(intent);
            }
        });
        buttonLetters26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity26.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSyllables26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity26.this, ActivitySyllables.class);
                startActivity(intent);
            }
        });
        buttonNextLetter26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(Activity26.this, Activity27.class);
                startActivity(intent);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter26);
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
