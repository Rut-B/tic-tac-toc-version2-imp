package com.example.rutbiton.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int X_PLAYER = 0;
    private static final int O_PLAYER = 1;
    private boolean GameOver =false;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn_player=X_PLAYER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button)findViewById(R.id.b1);
        b2= (Button)findViewById(R.id.b2);
        b3= (Button)findViewById(R.id.b3);
        b4= (Button)findViewById(R.id.b4);
        b5= (Button)findViewById(R.id.b5);
        b6= (Button)findViewById(R.id.b6);
        b7= (Button)findViewById(R.id.b7);
        b8= (Button)findViewById(R.id.b8);
        b9= (Button)findViewById(R.id.b9);


        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                    turn_player=O_PLAYER;
                    b1.setText("X");
                    }
                    else
                        if (turn_player==O_PLAYER)
                        {
                            turn_player=X_PLAYER;
                            b1.setText("O");
                        }
                }
                checkState();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b2.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b2.setText("O");
                    }
                }
                checkState();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b3.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b3.setText("O");
                    }
                }
                checkState();
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b4.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b4.setText("O");
                    }
                }
                checkState();
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b5.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b5.setText("O");
                    }
                }
                checkState();
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b6.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b6.setText("O");
                    }
                }
                checkState();
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b7.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b7.setText("O");
                    }
                }
                checkState();
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b8.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b8.setText("O");
                    }
                }
                checkState();
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals(""))
                {
                    if(turn_player==X_PLAYER)
                    {
                        turn_player=O_PLAYER;
                        b9.setText("X");
                    }
                    else
                    if (turn_player==O_PLAYER)
                    {
                        turn_player=X_PLAYER;
                        b9.setText("O");
                    }
                }
                checkState();
            }
        });

    }
   public void  checkState(){

        String b1Txt,b2Txt,b3Txt,b4Txt,b5Txt,b6Txt,b7Txt,b8Txt,b9Txt;
        b1Txt=b1.getText().toString();
        b2Txt=b2.getText().toString();
        b3Txt=b3.getText().toString();
        b4Txt=b4.getText().toString();
        b5Txt=b5.getText().toString();
        b6Txt=b6.getText().toString();
        b7Txt=b7.getText().toString();
        b8Txt=b8.getText().toString();
        b9Txt=b9.getText().toString();

        if(b1Txt.equals(b2Txt) &&
           b1Txt.equals(b3Txt) &&
           b1Txt.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
            GameOver=true;
        }
       if(b1Txt.equals(b5Txt) &&
               b1Txt.equals(b9Txt) &&
               b1Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b1Txt.equals(b4Txt) &&
               b1Txt.equals(b7Txt) &&
               b1Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b4Txt.equals(b5Txt) &&
               b4Txt.equals(b6Txt) &&
               b4Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b7Txt.equals(b8Txt) &&
               b7Txt.equals(b9Txt) &&
               b7Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b2Txt.equals(b5Txt) &&
               b2Txt.equals(b8Txt) &&
               b2Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b3Txt.equals(b6Txt) &&
               b3Txt.equals(b9Txt) &&
               b3Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b3Txt.equals(b5Txt) &&
               b3Txt.equals(b7Txt) &&
               b3Txt.equals("X"))
       {
           Toast.makeText(MainActivity.this,"Winner X!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }


       if(b1Txt.equals(b2Txt) &&
               b1Txt.equals(b3Txt) &&
               b1Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b1Txt.equals(b5Txt) &&
               b1Txt.equals(b9Txt) &&
               b1Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b1Txt.equals(b4Txt) &&
               b1Txt.equals(b7Txt) &&
               b1Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b4Txt.equals(b5Txt) &&
               b4Txt.equals(b6Txt) &&
               b4Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b7Txt.equals(b8Txt) &&
               b7Txt.equals(b9Txt) &&
               b7Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b2Txt.equals(b5Txt) &&
               b2Txt.equals(b8Txt) &&
               b2Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b3Txt.equals(b6Txt) &&
               b3Txt.equals(b9Txt) &&
               b3Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(b3Txt.equals(b5Txt) &&
               b3Txt.equals(b7Txt) &&
               b3Txt.equals("O"))
       {
           Toast.makeText(MainActivity.this,"Winner O!",Toast.LENGTH_LONG).show();
           GameOver=true;
       }
       if(GameOver){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
       }
    }
}
