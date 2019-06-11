package cn.edu.gdpt.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
int iiiiiii = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button = findViewById(R.id.bbbbbbbbbbbbbbb);

        final int[] ssssss = {
                R.drawable.did,
                R.drawable.dre,
                R.drawable.fid,
                R.drawable.did,
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
            while (true){
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        button.setBackgroundResource(ssssss[iiiiiii]);

                        iiiiiii++;
                        if (iiiiiii==ssssss.length){
                            iiiiiii=0;
                        }
                    }
                });

                Thread.sleep(1000);
            }
                }catch (Exception e){

                }
            }
        }).start();
    }
}
