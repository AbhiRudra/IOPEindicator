package com.abhishek.iope_indicator;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.text.AutoText;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

   // PhotoView photoView;
    Button b1;
    AutoCompleteTextView t1,t2;
    ImageView i;

    String sources[]={"17", "Office","Main Gate","Canteen","Computer Lab","Physics Lab","Electrical Lab"};
    String destinatons[]={"Canteen","Comp HoD Office","ED","ED2","Electrical Department","Physics Lab","SBI","Workshop","Xerox centre","Computer Lab","Office","Instru Lab",
    "17","24,25,26","Auditorium","Electrical Lab","EXTC","Principle Office","Main Gate","IT HoD Office","Physics Office"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



      // PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
      //  photoView.setImageResource(R.drawable.firstfloor);

        t1=findViewById(R.id.auto1);
        t2=findViewById(R.id.auto2);
         i=findViewById(R.id.i1);
        b1=findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,sources);
        t1.setAdapter(adapter);
        t1.setThreshold(1);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,destinatons);
        t2.setAdapter(adapter1);
        t2.setThreshold(1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sour= t1.getText().toString();
                String dest= t2.getText().toString();

                if(sour.equals("17"))
                {
                    if(dest.equals("Canteen")){i.setImageResource(R.drawable.atocan); }
                   else if(dest.equals("Comp HoD Office")){i.setImageResource(R.drawable.atohoc); }
                   else if(dest.equals("ED")){i.setImageResource(R.drawable.atoed); }
                    else  if(dest.equals("ED2")){i.setImageResource(R.drawable.atoeda); }
                    else if(dest.equals("Main Gate")){i.setImageResource(R.drawable.mtoa);}
                    else if(dest.equals("Physics Lab")){i.setImageResource(R.drawable.atophysicsl); }
                    else if(dest.equals("SBI")){i.setImageResource(R.drawable.atosbi); }
                    else  if(dest.equals("Workshop")){i.setImageResource(R.drawable.atoworkshop); }
                    else  if(dest.equals("Xerox centre")){i.setImageResource(R.drawable.atoxerox); }
                    else  if(dest.equals("Instru Lab")){i.setImageResource(R.drawable.atoinstru); }
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.otoc); }
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.cltoa); }

                        else {i.setImageResource(R.drawable.groundfloorcrop);}
                }

                if(sour.equals("Office"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.otoc);}
                    else if(dest.equals("24,25,26")){i.setImageResource(R.drawable.otobcde);}
                    else if(dest.equals("Auditorium")){i.setImageResource(R.drawable.otoaudi);}
                    else if(dest.equals("Canteen")){i.setImageResource(R.drawable.otocanteen);}
                    else if(dest.equals("Comp HoD Office")){i.setImageResource(R.drawable.otohoc);}
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.otocompl);}
                    else if(dest.equals("ED")){i.setImageResource(R.drawable.otoed);}
                    else if(dest.equals("ED2")){i.setImageResource(R.drawable.otoed2);}
                    else if(dest.equals("Electrical Lab")){i.setImageResource(R.drawable.otoelectricallab);}
                    else if(dest.equals("EXTC")){i.setImageResource(R.drawable.otoextc);}
                    else if(dest.equals("Main Gate")){i.setImageResource(R.drawable.mtooffice);}
                    else if(dest.equals("Physics Lab")){i.setImageResource(R.drawable.otophysicsl);}
                    else if(dest.equals("SBI")){i.setImageResource(R.drawable.otosbi);}
                    else if(dest.equals("Workshop")){i.setImageResource(R.drawable.otoworkshop);}
                    else if(dest.equals("Xerox centre")){i.setImageResource(R.drawable.otoxerox);}

                    else {i.setImageResource(R.drawable.groundfloorcrop);}

                }

                if(sour.equals("Main Gate"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.mtoa);}
                    else if(dest.equals("24,25,26")){i.setImageResource(R.drawable.mtobcde);}
                    else if(dest.equals("Canteen")){i.setImageResource(R.drawable.mtocanteen);}
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.mtocomputerlab);}
                    else if(dest.equals("Comp HoD Office")){i.setImageResource(R.drawable.mtohoc);}
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.mtooffice);}
                    else if(dest.equals("Physics Lab")){i.setImageResource(R.drawable.mtophysicslab);}
                    else if(dest.equals("SBI")){i.setImageResource(R.drawable.mtosbi);}
                    else if(dest.equals("Xerox centre")){i.setImageResource(R.drawable.mtoxeroxcentre);}
                    else if(dest.equals("Principle Office")){i.setImageResource(R.drawable.mtoprinciple);}
                    else if(dest.equals("ED")){i.setImageResource(R.drawable.mtoed);}
                    else if(dest.equals("EXTC")){i.setImageResource(R.drawable.mtoextc);}

                    else {i.setImageResource(R.drawable.groundfloorcrop);}

                }

                if(sour.equals("Canteen"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.atocan);}
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.ctocomplab);}
                    else if(dest.equals("Main Gate")){i.setImageResource(R.drawable.mtocanteen);}
                    else if(dest.equals("Electrical Lab")){i.setImageResource(R.drawable.ctoelectricallab);}
                    else if(dest.equals("Physics Lab")){i.setImageResource(R.drawable.ctophysicslab);}
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.otocanteen);}

                    else {i.setImageResource(R.drawable.groundfloorcrop);}



                }

                if(sour.equals("Computer Lab"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.cltoa);}
                    else if(dest.equals("24,25,26")){i.setImageResource(R.drawable.cltobcde);}
                    else if(dest.equals("Main Gate")){i.setImageResource(R.drawable.mtocomputerlab);}
                    else if(dest.equals("Electrical Lab")){i.setImageResource(R.drawable.cltoelectrical);}
                    else if(dest.equals("Physics Lab")){i.setImageResource(R.drawable.cltophysicslab);}
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.otocompl);}
                    else if(dest.equals("Auditorium")){i.setImageResource(R.drawable.cltoaudi);}
                    else if(dest.equals("Canteen")){i.setImageResource(R.drawable.ctocomplab);}
                    else if(dest.equals("ED2")){i.setImageResource(R.drawable.cltoed2);}
                    else if(dest.equals("EXTC")){i.setImageResource(R.drawable.cltoextc);}
                    else if(dest.equals("IT HoD Office")){i.setImageResource(R.drawable.cltoithod);}
                    else if(dest.equals("Physics Office")){i.setImageResource(R.drawable.cltoithod);}
                    else if(dest.equals("SBI")){i.setImageResource(R.drawable.cltosbi);}
                    else if(dest.equals("Xerox centre")){i.setImageResource(R.drawable.cltoxeroxcentre);}
                    else if(dest.equals("Workshop")){i.setImageResource(R.drawable.cltoworkshop);}

                    else {i.setImageResource(R.drawable.groundfloorcrop);}


                }

                if(sour.equals("Electrical Lab"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.eltoa);}
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.cltoelectrical);}
                    else if(dest.equals("ED")){i.setImageResource(R.drawable.eltoed);}
                    else if(dest.equals("ED2")){i.setImageResource(R.drawable.eltoeda);}
                    else if(dest.equals("SBI")){i.setImageResource(R.drawable.eltosbi);}
                    else if(dest.equals("Canteen")){i.setImageResource(R.drawable.ctoelectricallab);}
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.otoelectricallab);}
                    else if(dest.equals("IT HoD Office")){i.setImageResource(R.drawable.eltoithod);}
                    else if(dest.equals("Physics Office")){i.setImageResource(R.drawable.eltoithod);}


                    else {i.setImageResource(R.drawable.groundfloorcrop);}
                }

                if(sour.equals("Physics Lab"))
                {
                    if(dest.equals("17")){i.setImageResource(R.drawable.atophysicsl);}
                    else if(dest.equals("Computer Lab")){i.setImageResource(R.drawable.cltophysicslab);}
                    else if(dest.equals("Main Gate")){i.setImageResource(R.drawable.mtophysicslab);}
                    else if(dest.equals("Canteen")){i.setImageResource(R.drawable.ctophysicslab);}
                    else if(dest.equals("Office")){i.setImageResource(R.drawable.otophysicsl);}


                    else {i.setImageResource(R.drawable.groundfloorcrop);}
                }






                Snackbar.make(view, "Map from "+sour+" to "+dest+" !", Snackbar.LENGTH_LONG).show();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            Intent toy= new Intent(MainActivity.this,About.class);
            startActivity(toy);

        } else if (id == R.id.nav_map) {
            Intent toy= new Intent(MainActivity.this,Map.class);
            startActivity(toy);
        } else if (id == R.id.nav_mapa) {

            Intent toy= new Intent(MainActivity.this,Mapa.class);
            startActivity(toy);

        } else if (id == R.id.nav_Team) {
            Intent toy= new Intent(MainActivity.this,Team.class);
            startActivity(toy);
        } else if (id == R.id.nav_share) {
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareBody="Here it is..! The IOPE Indicator, Find your own way to your destination! : https://play.google.com/store/search?q=Abhishek%20A.%20Rudrawar&hl=en ";
            String shareSub="IOPE Indicator- get your way on your finger tips!";
            share.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            share.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(share,"Share Using"));
            return true;

        } else if (id == R.id.nav_web) {
            String url= "https://iopelonere.com/";
            Intent toy= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(toy);

        } else if (id == R.id.nav_contact) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+918698381213"));
            startActivity(intent);

        } else if (id == R.id.nav_feedback) {
            Intent myMail = new Intent(Intent.ACTION_SEND);

            myMail.setData(Uri.parse("mail to:"));
            myMail.setType("message/rfc822");
            String to="sopanmasure913@gmail.com";
            String sub="Regarding IOPE-Indicator:";
            myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
            myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
            myMail.putExtra(Intent.EXTRA_TEXT,"Heyy..");
            startActivity(Intent.createChooser(myMail,"send email"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
