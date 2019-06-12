package cn.edu.gdpt.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main3Activity extends AppCompatActivity {
    int iiiiiii = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button = findViewById(R.id.bbbbbbbbbbbbbbb);

        final int[] ssssss = {
                R.drawable.tted,
                R.drawable.stu,
                R.drawable.bbt,


                R.drawable.did,
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                button.setBackgroundResource(ssssss[iiiiiii]);

                                iiiiiii++;
                                if (iiiiiii == ssssss.length) {
                                    iiiiiii = 0;
                                }
                            }
                        });

                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        }).start();




       new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String s = "http://apicloud.mob.com/football/league/queryMatchInfoByRound?key=2b5c9f9b1f018&leagueTypeCn=德甲&season=2013&round=3";
                    OkHttpClient okHttpClient = new OkHttpClient();
                    Response execute = okHttpClient.newCall(new Request.Builder().get().url(s).build()).execute();
                    final Data data = new Gson().fromJson(execute.body().string(), Data.class);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {


        TextView textView = findViewById(R.id.qqq111);
        TextView textView222 = findViewById(R.id.qq22);

        textView.setText(data.getResult().get(0).getHomeTeamScore());
        textView222.setText(data.getResult().get(0).getVisitorsScore());


        TextView textView1dfgvfet = findViewById(R.id.ghawsjwq);
        TextView textView1dfgvfeewfdtrft = findViewById(R.id.sdfdw);

        textView1dfgvfet.setText(data.getResult().get(0).getHomeTeam());
        textView1dfgvfeewfdtrft.setText(data.getResult().get(0).getVisitors());




                        }
                    });
                }catch (Exception e){
                   // Toast.makeText(this, "网络XXX", Toast.LENGTH_SHORT).show();
                }

            }
        }).start();





    }


    String sssssssssssssssssssssssssss = "{\"msg\":\"success\",\"result\":[{\"date\":\"2013-08-25\",\"homeTeam\":\"柏林赫塔\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"阿德里安-拉莫斯\",\"goalTime\":\"74\"}],\"homeTeamScore\":\"1\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"柏林\",\"round\":3,\"season\":\"2013\",\"situation\":\"奥林匹克球场\",\"status\":3,\"time\":\"00:30\",\"visitors\":\"汉堡\",\"visitorsMatchInfo\":[],\"visitorsScore\":\"0\"},{\"date\":\"2013-08-25\",\"homeTeam\":\"不伦瑞克\",\"homeTeamMatchInfo\":[],\"homeTeamScore\":\"0\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"不伦瑞克\",\"round\":3,\"season\":\"2013\",\"situation\":\"和谐球场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"法兰克福\",\"visitorsMatchInfo\":[{\"goalPlayerNameCn\":\"艾格纳\",\"goalTime\":\"62\"},{\"goalPlayerNameCn\":\"梅耶尔\",\"goalTime\":\"52\"}],\"visitorsScore\":\"2\"},{\"date\":\"2013-08-25\",\"homeTeam\":\"奥格斯堡\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"布拉克\",\"goalTime\":\"36\"},{\"goalPlayerNameCn\":\"哈伊尔-阿尔滕托普\",\"goalTime\":\"6\"}],\"homeTeamScore\":\"2\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"奥格斯堡\",\"round\":3,\"season\":\"2013\",\"situation\":\"SGL球场\",\"status\":3,\"time\":\"23:30\",\"visitors\":\"斯图加特\",\"visitorsMatchInfo\":[{\"goalPlayerNameCn\":\"伊比舍维奇\",\"goalTime\":\"42\"}],\"visitorsScore\":\"1\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"多特蒙德\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"莱万多夫斯基\",\"goalTime\":\"55\"}],\"homeTeamScore\":\"1\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"多特蒙德\",\"round\":3,\"season\":\"2013\",\"situation\":\"伊度纳公园\",\"status\":3,\"time\":\"02:30\",\"visitors\":\"不莱梅\",\"visitorsMatchInfo\":[],\"visitorsScore\":\"0\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"美因茨\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"尼古拉-穆勒\",\"goalTime\":\"78\"},{\"goalPlayerNameCn\":\"楚波莫廷\",\"goalTime\":\"60\"}],\"homeTeamScore\":\"2\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"美因茨\",\"round\":3,\"season\":\"2013\",\"situation\":\"科法斯球场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"沃尔夫斯堡\",\"visitorsMatchInfo\":[],\"visitorsScore\":\"0\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"霍芬海姆\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"萨利霍维奇\",\"goalTime\":\"9\"},{\"goalPlayerNameCn\":\"弗兰德\",\"goalTime\":\"25\"},{\"goalPlayerNameCn\":\"斯特罗布尔\",\"goalTime\":\"77\"}],\"homeTeamScore\":\"3\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"辛斯海姆\",\"round\":3,\"season\":\"2013\",\"situation\":\"内卡竞技场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"弗赖堡\",\"visitorsMatchInfo\":[{\"goalPlayerNameCn\":\"索格\",\"goalTime\":\"13\"},{\"goalPlayerNameCn\":\"古埃德斯\",\"goalTime\":\"29\"},{\"goalPlayerNameCn\":\"弗雷希\",\"goalTime\":\"65\"}],\"visitorsScore\":\"3\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"勒沃库森\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"卡斯特罗\",\"goalTime\":\"72\"},{\"goalPlayerNameCn\":\"萨姆\",\"goalTime\":\"28\"},{\"goalPlayerNameCn\":\"萨姆\",\"goalTime\":\"60\"},{\"goalPlayerNameCn\":\"基斯林\",\"goalTime\":\"23\"}],\"homeTeamScore\":\"4\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"勒沃库森\",\"round\":3,\"season\":\"2013\",\"situation\":\"拜耳球场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"门兴\",\"visitorsMatchInfo\":[{\"goalPlayerNameCn\":\"斯特兰茨尔\",\"goalTime\":\"54\"},{\"goalPlayerNameCn\":\"阿朗戈\",\"goalTime\":\"57\"}],\"visitorsScore\":\"2\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"拜仁慕尼黑\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"罗本\",\"goalTime\":\"78\"},{\"goalPlayerNameCn\":\"里贝里\",\"goalTime\":\"69\"}],\"homeTeamScore\":\"2\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"慕尼黑\",\"round\":3,\"season\":\"2013\",\"situation\":\"安联球场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"纽伦堡\",\"visitorsMatchInfo\":[],\"visitorsScore\":\"0\"},{\"date\":\"2013-08-24\",\"homeTeam\":\"汉诺威96\",\"homeTeamMatchInfo\":[{\"goalPlayerNameCn\":\"胡兹蒂\",\"goalTime\":\"15\"},{\"goalPlayerNameCn\":\"马梅-迪乌夫\",\"goalTime\":\"42\"}],\"homeTeamScore\":\"2\",\"leagueTypeCn\":\"德甲\",\"matchCity\":\"汉诺威\",\"round\":3,\"season\":\"2013\",\"situation\":\"HDI球场\",\"status\":3,\"time\":\"21:30\",\"visitors\":\"沙尔克04\",\"visitorsMatchInfo\":[{\"goalPlayerNameCn\":\"斯扎莱\",\"goalTime\":\"55\"}],\"visitorsScore\":\"1\"}],\"retCode\":\"200\"}";
}
