package com.example.layout2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.CalendarContract;

import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.layout2.R;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);



        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Learning Buddy is an intuitive programming app designed to streamline the learning process for beginners. With its user-friendly interface and comprehensive curriculum, Learning Buddy offers a diverse range of programming languages and concepts, catering to various skill levels and interests. ")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("atharvpotdar924@gmail.com")
                .addWebsite("www.learn-buddy.com")
                .addYoutube("https://youtube.com/@atharvpotdar4807?si=pe0jAnlFUySjQaYH")   //Enter your youtube link here (replace with my channel link)
                .addInstagram("https://www.instagram.com/atharv_potdar924?igsh=MTY4bTFqdm9xenV2Mw==")    //Your instagram id
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Learning Buddy", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contactus.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
