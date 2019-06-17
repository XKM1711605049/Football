package cn.edu.gdpt.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class chaxun extends AppCompatActivity {
    EditText edt_liansai,edt_saiji,edt_lun;
    Button btn_cha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaxun);

        edt_liansai=findViewById(R.id.edt_liansai);
        edt_saiji=findViewById(R.id.edt_saiji);
        edt_lun=findViewById(R.id.edt_lun);
        btn_cha=findViewById(R.id.button);


        btn_cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1111111111111111111111111 = edt_liansai.getText().toString();
                String s222222222222222 = edt_saiji.getText().toString();
                String s333333333333333333333333333333333333 = edt_lun.getText().toString();

                sssssssssssssssssssssssssssssssssssssss(s1111111111111111111111111,s222222222222222,s333333333333333333333333333333333333);
            }
        });

    }

    private void sssssssssssssssssssssssssssssssssssssss(final String s1111111111111111111111111, final String s222222222222222, final String s333333333333333333333333333333333333) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String s = "http://apicloud.mob.com/football/league/queryMatchInfoByRound?key=2b5c9f9b1f018&leagueTypeCn="+s1111111111111111111111111+"&season="+s222222222222222+"&round="+s333333333333333333333333333333333333;
                    OkHttpClient okHttpClient = new OkHttpClient();
                    Response execute = okHttpClient.newCall(new Request.Builder().get().url(s).build()).execute();
                    final Data data = new Gson().fromJson(execute.body().string(), Data.class);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
//                            //拿到结果了——————————————————————————————————————————————————————————————
//                            TextView textView = findViewById(R.id.qqq111);
//                            TextView textView222 = findViewById(R.id.qq222);
//
//                            textView.setText(data.getResult().get(0).getHomeTeamScore());
//                            textView222.setText(data.getResult().get(0).getVisitorsScore());
//
//
//                            TextView textView1dfgvfet = findViewById(R.id.ghawsjwq);
//                            TextView textView1dfgvfeewfdtrft = findViewById(R.id.sdfdw);
//
//                            textView1dfgvfet.setText(data.getResult().get(0).getHomeTeam());
//                            textView1dfgvfeewfdtrft.setText(data.getResult().get(0).getVisitors());

                            JieGuoActivity.data = data;
                            Intent intent=new Intent(getApplication(),JieGuoActivity.class);
                            startActivity(intent);


                        }
                    });
                }catch (Exception e){
                    // Toast.makeText(this, "网络XXX", Toast.LENGTH_SHORT).show();
                }

            }
        }).start();
    }

}
