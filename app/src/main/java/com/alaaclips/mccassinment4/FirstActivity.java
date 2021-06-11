package com.alaaclips.mccassinment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {


    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);


        Intent i = new Intent(this, MainActivity.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  i.putExtra("button","https://r1---sn-oxfnu5g2n-b15e.googlevideo.com/videoplayback?expire=1623448307&ei=k4bDYOvKLK74xN8P1ZuCqAE&ip=5.226.137.241&id=o-ADqAe2GxGbuKcdPSB4_FuhFDrrbhXwxDGSZw9Se4ZS-N&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=veaUIA2tCzd5vv6Xbg5C4GsF&gir=yes&clen=48311663&ratebypass=yes&dur=1067.723&lmt=1580034194576217&fexp=24001373,24007246&c=WEB&txp=5531432&n=iMYakgKXKuf9IGneGXI&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAIOIp0ZGyZ_vRMIqREaVQH4XO47i-RYMnrVxHrGeRcnAAiEA6jNyLxveIjoly01pS_SUJh3evDcnKdrnrcb3zrqxcUE%3D&redirect_counter=1&rm=sn-aigezs7e&req_id=22544c3a2136a3ee&cms_redirect=yes&ipbypass=yes&mh=Y-&mip=206.62.153.96&mm=31&mn=sn-oxfnu5g2n-b15e&ms=au&mt=1623426776&mv=m&mvi=1&pcm2cms=yes&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pcm2cms,pl&lsig=AG3C_xAwRQIhAP1HzZhldQn8vaFvEIt4mdeQ3ytKcgw5p70ZZJMyIHsHAiAih6EfGzUp4k5olz08AwRpTU6dT9mMH_OsV9mxreyhVg%3D%3D");

                startActivity(i);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i.putExtra("button","https://r5---sn-npoeenl7.googlevideo.com/videoplayback?expire=1623448527&ei=b4fDYJyNEP6A6dsPo6isgA8&ip=36.81.177.104&id=o-ACUevxf-i36Jjk9DFPBKoCH-KLziKdWoU4UeWdqZfNIh&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=4bq5MyfVylevKnFUt_AJfUoF&gir=yes&clen=14112554&ratebypass=yes&dur=319.413&lmt=1575168160810875&fexp=24001373,24007246&c=WEB&txp=5531432&n=M013L9y4iZ3BK_IPPbC&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhANCJCRpwW19Nw20BHGowoimAQMy1upYbVwM8Mnrlwkd3AiB7fZqeN0fWGH4T8ceuvr4B_-S7XohrkF7XjpVLj-c5iw%3D%3D&redirect_counter=1&rm=sn-2uuxa3vh-n0cd76&req_id=183e695d2b76a3ee&cms_redirect=yes&ipbypass=yes&mh=GV&mm=29&mn=sn-npoeenl7&ms=rdu&mt=1623426780&mv=m&mvi=5&pl=26&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgaNggCYQVZWu544OzSc1f3vaSnFF4cby1vuhTiII-QC4CIQCbo5CtfUczQK9a73zBWDr_PpsNY9I-QwzNco0QA0kgrA%3D%3D");

                startActivity(i);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i.putExtra("button","https://r8---sn-n8v7kne6.googlevideo.com/videoplayback?expire=1623448603&ei=u4fDYLDeH4uq7AShwaSQCg&ip=213.230.97.10&id=o-AEwuQHypEh-dY9WuDpWmwv67gQtJd38M1J2qnXiQEcs3&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=rwkDuWRPSHkLG478KpK5rpwF&gir=yes&clen=329606367&ratebypass=yes&dur=7253.774&lmt=1601124850284010&fexp=24001373,24007246&c=WEB&txp=5530422&n=NNYgahLEz49qnB_QQ_k&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgJkb4ymzRRABDzgpnF0WRjOUGgPFAv-9cYzT4PVD5GAsCIBH78k1x_ra7QLxDaJkmIfI29RZ31XiFamDzm165rZwO&rm=sn-01oxu-u5ns7r,sn-ug5onuxaxjvh-n8vz7r&req_id=19e3511c29d3a3ee&ipbypass=yes&redirect_counter=2&cms_redirect=yes&mh=Oe&mm=30&mn=sn-n8v7kne6&ms=nxu&mt=1623426749&mv=m&mvi=8&pl=23&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwQwIgGQD_AwKlgJLK6Y4Ajsar9RaGF_9q-oBgpnsbzrmaCvsCHyXe9Ij_GDylKvIdr3dhNQT200J57wY6NOg75A6wA9E%3D");

                startActivity(i);

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i.putExtra("button","https://r4---sn-4g5e6nzl.googlevideo.com/videoplayback?expire=1623448737&ei=QYjDYPbtLMX18gTfsp7gBA&ip=173.195.15.211&id=o-ANGq5lAHkgiu7aSorHWpb9KcPKspEVcbPzOxphU1CPc2&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=LR9k2xYR-gW1SEHCmP27FMgF&gir=yes&clen=31385970&ratebypass=yes&dur=1704.089&lmt=1615634192336686&fexp=24001373,24007246&c=WEB&txp=5430434&n=Jus4j0MgxVA6F-PGa2t&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgOcmdrJBNLNN9HzX7ao1XWX0YPOpcEV7XynwpPR31pdoCIC6HqU8rpODfbrSF0ssT3hzpkg6kgPVL4C8VT5B6fZED&rm=sn-ab5eee7z&req_id=21e075bf8d09a3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-oxfnu5g2n-b15e7l&cms_redirect=yes&mh=1T&mip=206.62.153.96&mm=29&mn=sn-4g5e6nzl&ms=rdu&mt=1623427016&mv=m&mvi=4&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgKYFWJPJrY9KHrlVCNQs6Z3IkekbEXIieC5P5n8B2DmECIQDQUVbUWexJrHsX75IjvTZUZRAkKwgun25bQN5bE0jZIQ%3D%3D");

                startActivity(i);

            }
        });


    }


}