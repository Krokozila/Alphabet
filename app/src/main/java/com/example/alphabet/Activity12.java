package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity12 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent12;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter12);

        ImageButton button12 = this.findViewById(R.id.button12);
        Button buttonLetters12 = findViewById(R.id.buttonLetters12);
        Button buttonSyllables2 = findViewById(R.id.buttonSyllables12);
        ImageButton buttonNextLetter11 = findViewById(R.id.buttonNextLetter12);

        playSound1();

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent12 = new Intent(Activity12.this, Activity11.class);
                startActivity(intent12);
            }
        });
        buttonLetters12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent12 = new Intent(Activity12.this, MainActivity.class);
                startActivity(intent12);
            }
        });
        buttonSyllables2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent12 = new Intent(Activity12.this, ActivitySyllables.class);
                startActivity(intent12);
            }
        });
        buttonNextLetter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent12 = new Intent(Activity12.this, Activity13.class);
                startActivity(intent12);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter12);
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
