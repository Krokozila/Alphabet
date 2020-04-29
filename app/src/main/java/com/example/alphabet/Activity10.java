package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity10 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent10;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter10);

        ImageButton button10 = this.findViewById(R.id.button10);
        Button buttonLetters10 = findViewById(R.id.buttonLetters10);
        Button buttonSyllables10 = findViewById(R.id.buttonSyllables10);
        ImageButton buttonNextLetter10 = findViewById(R.id.buttonNextLetter10);

        playSound1();

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent10 = new Intent(Activity10.this, Activity9.class);
                startActivity(intent10);
            }
        });

        buttonLetters10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent10 = new Intent(Activity10.this, MainActivity.class);
                startActivity(intent10);
            }
        });

        buttonSyllables10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent10 = new Intent(Activity10.this, ActivitySyllables.class);
                startActivity(intent10);
            }
        });

        buttonNextLetter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent10 = new Intent(Activity10.this, Activity11.class);
                startActivity(intent10);
            }
        });
    }
    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter10);
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
