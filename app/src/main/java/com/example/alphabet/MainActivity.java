package com.example.alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;

    private AudioManager audioManager;

    ImageButton imageButton1,imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7,
            imageButton8, imageButton9, imageButton10, imageButton11, imageButton12, imageButton13, imageButton14,
            imageButton15, imageButton16, imageButton17, imageButton18, imageButton19, imageButton20, imageButton21,
            imageButton22, imageButton23, imageButton24, imageButton25, imageButton26, imageButton27, imageButton28,
            imageButton29, imageButton30, imageButton31, imageButton32;

    Button buttonSyllables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageButton1 = findViewById(R.id.imageButton1);
        this.imageButton2 = findViewById(R.id.imageButton2);
        this.imageButton3 = findViewById(R.id.imageButton3);
        this.imageButton4 = findViewById(R.id.imageButton4);
        this.imageButton5 = findViewById(R.id.imageButton5);
        this.imageButton6 = findViewById(R.id.imageButton6);
        this.imageButton7 = findViewById(R.id.imageButton7);
        this.imageButton8 = findViewById(R.id.imageButton8);
        this.imageButton9 = findViewById(R.id.imageButton9);
        this.imageButton10 = findViewById(R.id.imageButton10);
        this.imageButton11 = findViewById(R.id.imageButton11);
        this.imageButton12 = findViewById(R.id.imageButton12);
        this.imageButton13 = findViewById(R.id.imageButton13);
        this.imageButton14 = findViewById(R.id.imageButton14);
        this.imageButton15 = findViewById(R.id.imageButton15);
        this.imageButton16 = findViewById(R.id.imageButton16);
        this.imageButton17 = findViewById(R.id.imageButton17);
        this.imageButton18 = findViewById(R.id.imageButton18);
        this.imageButton19 = findViewById(R.id.imageButton19);
        this.imageButton20 = findViewById(R.id.imageButton20);
        this.imageButton21 = findViewById(R.id.imageButton21);
        this.imageButton22 = findViewById(R.id.imageButton22);
        this.imageButton23 = findViewById(R.id.imageButton23);
        this.imageButton24 = findViewById(R.id.imageButton24);
        this.imageButton25 = findViewById(R.id.imageButton25);
        this.imageButton26 = findViewById(R.id.imageButton26);
        this.imageButton27 = findViewById(R.id.imageButton27);
        this.imageButton28 = findViewById(R.id.imageButton28);
        this.imageButton29 = findViewById(R.id.imageButton29);
        this.imageButton30 = findViewById(R.id.imageButton30);
        this.imageButton31 = findViewById(R.id.imageButton31);
        this.imageButton32 = findViewById(R.id.imageButton32);
        this.buttonSyllables = findViewById(R.id.buttonSyllables);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity6.class);
                startActivity(intent);
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity7.class);
                startActivity(intent);
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity8.class);
                startActivity(intent);
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity9.class);
                startActivity(intent);
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity10.class);
                startActivity(intent);
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity11.class);
                startActivity(intent);
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity12.class);
                startActivity(intent);
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity13.class);
                startActivity(intent);
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity14.class);
                startActivity(intent);
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity15.class);
                startActivity(intent);
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity16.class);
                startActivity(intent);
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity17.class);
                startActivity(intent);
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity18.class);
                startActivity(intent);
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity19.class);
                startActivity(intent);
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity20.class);
                startActivity(intent);
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity21.class);
                startActivity(intent);
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity22.class);
                startActivity(intent);
            }
        });
        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity23.class);
                startActivity(intent);
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity24.class);
                startActivity(intent);
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity25.class);
                startActivity(intent);
            }
        });
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Activity26.class);
            startActivity(intent);
            }
        });
        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity27.class);
                startActivity(intent);
            }
        });
        imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity28.class);
                startActivity(intent);
            }
        });
        imageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity29.class);
                startActivity(intent);
            }
        });
        imageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Activity30.class);
            startActivity(intent);
            }
        });
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity31.class);
                startActivity(intent);
            }
        });
        imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity32.class);
                startActivity(intent);
            }
        });

        buttonSyllables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSyl = new Intent(MainActivity.this, ActivitySyllables.class);
                startActivity(intentSyl);
            }
        });

        // AudioManager audio settings for adjusting the volume
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

    }


//    public void playSound1( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter1);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    // When users click on the button "Буква Б"
//    public void playSound2( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter2);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }

//    public void playSound3( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter3);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }

//    public void playSound4( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter4);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound5( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter5);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound6( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter6);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound7( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter7);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//    public void playSound8( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter8);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound9( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter9);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound10( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter10);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound11( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter11);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound12( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter12);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound13( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter13);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound14( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter14);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound15( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter15);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound16( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter16);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound17( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter17);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound18( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter18);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound19( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter19);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound20( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter20);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound21( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter21);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound22( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter22);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//    public void playSound23( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter23);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound24( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter24);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound25( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter25);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound26( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter26);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound27( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter27);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound28( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter28);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound29( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter29);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound30( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter30);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound31( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter31);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }
//
//    public void playSound32( )  {
//        mediaPlayer = MediaPlayer.create(this, R.raw.letter32);
//        mediaPlayer.setLooping(false);
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
//        {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //При готовности к проигрыванию запуск вывода звука:
//                mp.start();
//                isActive = true;
//            }
//        });
//        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayer.release();
//                isActive = false;
//            }
//        });
//    }

}
