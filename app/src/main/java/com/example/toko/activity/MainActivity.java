package com.example.toko.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.example.toko.R;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewmanhinhchinh;
    NavigationView navigationView;
    ListView listViewmanhinhchinh;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionBar();
        ActionViewFipper();
    }

    private void ActionViewFipper (){
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fkenh14cdn.com%2Fthumb_w%2F660%2F203336854389633024%2F2021%2F9%2F3%2Fphoto-1-16306723794341580884721.jpg&imgrefurl=https%3A%2F%2Fkenh14.vn%2Flisa-chua-debut-ma-blackpink-da-bi-lo-ca-khuc-moi-mau-sac-khac-han-nhung-ban-hit-truoc-lieu-co-dot-pha-202109031827387.chn&tbnid=iAnemyKuQF41YM&vet=12ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygAegUIARCrAQ..i&docid=lVvPCGjxn82sbM&w=660&h=384&q=blackpink&ved=2ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygAegUIARCrAQ");
        mangquangcao.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia-cdn.laodong.vn%2Fstorage%2Fnewsportal%2F2021%2F9%2F5%2F949891%2FBlackpink.jpg%3Fw%3D414%26h%3D276%26crop%3Dauto%26scale%3Dboth&imgrefurl=https%3A%2F%2Flaodong.vn%2Fgiai-tri%2Fthan-tuong-nu-kpop-hot-nhat-youtube-lisa-jennie-blackpink-ap-dao-iu-949891.ldo&tbnid=5phYp8H4aJwWWM&vet=12ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygDegUIARCzAQ..i&docid=xkQsiIaevN3RjM&w=414&h=276&itg=1&q=blackpink&ved=2ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygDegUIARCzAQ");
        mangquangcao.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.vov.vn%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Flarge%2Fpublic%2F2021-07%2FAEN20210714004700315_01_i_P4.jpg&imgrefurl=https%3A%2F%2Fvov.vn%2Fgiai-tri%2Fnghe-si%2Fblackpink-gia-nhap-mang-xa-hoi-weverse-cung-bts-873764.vov&tbnid=DEee-qsJzK_0GM&vet=12ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygHegUIARC8AQ..i&docid=BsODIyzwjYMlkM&w=1200&h=831&q=blackpink&ved=2ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygHegUIARC8AQ");
        mangquangcao.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.baogiaothong.vn%2Fupload%2Fimages%2F2021-2%2Farticle_img%2F2021-04-05%2Fimg-bgt-2021-blackpink-la-nhom-nhac-kpop-hang-dau-heienj-nay-1617591127-width1280height768.jpg&imgrefurl=https%3A%2F%2Fwww.baogiaothong.vn%2Fcong-thuc-thanh-cong-tren-toan-cau-cua-nhom-nhac-nu-blackpink-d501562.html&tbnid=RYGxJLdDDxtN_M&vet=12ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygPegUIARDQAQ..i&docid=2EIXiTMjS0W2rM&w=700&h=420&q=blackpink&ved=2ahUKEwijsr7K3e_yAhXpK7cAHSCOA8UQMygPegUIARDQAQ");
        for(int i=0;i<mangquangcao.size();i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }
    private void ActionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void Anhxa() {
        toolbar = (Toolbar) findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        recyclerViewmanhinhchinh = (RecyclerView) findViewById(R.id.recyclerview);
        navigationView = (NavigationView) findViewById(R.id.navigationview);
        listViewmanhinhchinh = (ListView) findViewById(R.id.listviewmanhinhchinh);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
    }

}