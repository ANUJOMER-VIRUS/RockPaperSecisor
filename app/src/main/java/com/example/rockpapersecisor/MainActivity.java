package com.example.rockpapersecisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  static    int cscore=0;
 static int pscore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView computer_move_img=findViewById(R.id.computer_move_img);
        ImageView rock_btn=findViewById(R.id.rock_btn);
        ImageView paper_btn=findViewById(R.id.paper_btn);
        ImageView scissor_btn=findViewById(R.id.scissors_btn);

        TextView winner_tv=findViewById(R.id.winner_tv);
        ImageView user_move_img=findViewById(R.id.user_move_img);
        TextView player_score=findViewById(R.id.player_score);
        TextView computer_score=findViewById(R.id.computer_score);
        Button restart_btn=findViewById(R.id.restart_btn);
        computer_score.setText("0");
        player_score.setText("0");

        restart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear_score();
            }

            private void clear_score() {
                computer_score.setText("0");
                player_score.setText("0");
                winner_tv.setText("");
                user_move_img.setImageResource(R.drawable.question_mark);
                computer_move_img.setImageResource(R.drawable.question_mark);

            }
        });
        scissor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_move_img.setImageResource(R.drawable.scissors);
                int comp_move=(int)Math.floor(Math.random()*(3));
                if(comp_move==0){
                    computer_move_img.setImageResource(R.drawable.rock);
                    winner_tv.setText("Computer has won");
                   cscore++;
                   computer_score.setText(""+cscore);

                }
                else if(comp_move==1){
                    computer_move_img.setImageResource(R.drawable.paper);
                    winner_tv.setText("Playerr has won");
                    pscore++;
                    player_score.setText((""+pscore));
                }
                else{
                    computer_move_img.setImageResource(R.drawable.scissors);
                    winner_tv.setText("Draw");
                }

            }
        });

         paper_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 user_move_img.setImageResource(R.drawable.paper);
                 int comp_move=(int)Math.floor(Math.random()*(3));
                 if(comp_move==0){
                     computer_move_img.setImageResource(R.drawable.rock);
                     winner_tv.setText("Player has won");
                     pscore++;
                     player_score.setText(""+pscore);

                 }
                 else if(comp_move==1){
                     computer_move_img.setImageResource(R.drawable.paper);
                     winner_tv.setText("Draw");

                 }
                 else{
                     computer_move_img.setImageResource(R.drawable.scissors);
                     winner_tv.setText("Computer has won");
                     cscore++;
                     computer_score.setText(""+cscore);
                 }
             }
         });
         rock_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 user_move_img.setImageResource(R.drawable.rock);
                 int comp_move=(int)Math.floor(Math.random()*(3));
                 if(comp_move==0){
                     computer_move_img.setImageResource(R.drawable.rock);
                     winner_tv.setText("Draw");


                 }
                 else if(comp_move==1){
                     computer_move_img.setImageResource(R.drawable.paper);
                     winner_tv.setText("Computer has won");
                     cscore++;
                     computer_score.setText(""+cscore);
                 }
                 else{
                     computer_move_img.setImageResource(R.drawable.scissors);
                     winner_tv.setText("Player has won");

                     pscore++;
                     player_score.setText(""+pscore);
                 }
             }
         });
    }
}