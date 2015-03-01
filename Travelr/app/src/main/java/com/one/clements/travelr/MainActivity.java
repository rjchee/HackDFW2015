package com.one.clements.travelr;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.LocationServices;

import java.io.IOException;
import java.util.List;


public class MainActivity extends ActionBarActivity{

    private static final String[] AIRPORT_CODES = {"ATL", "LAX", "ORD", "DFW", "DEN", "JFK", "SFO",
            "CLT", "LAS", "PHX", "MIA", "IAH", "EWR", "MCO", "SEA", "MSP", "DTW", "BOS", "PHL",
            "LGA", "FLL", "BWI", "IAD", "MDW", "DCA", "SLC", "HNL", "SAN", "TPA", "PDX", "STL",
            "HOU", "BNA", "AUS", "MCI", "OAK", "MSY", "SNA", "RDU", "CLE", "SJC", "SMF", "SJU",
            "DAL", "PIT", "RSW", "IND", "MKE", "CMH", "OGG", "PBI", "CVG", "BDL", "BUF", "JAX",
            "ABQ", "ANC", "MEM", "OMA", "ONT", "BUR", "PVD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, AIRPORT_CODES);
        ((AutoCompleteTextView)findViewById(R.id.SourceTextField)).setAdapter(adapter);
        ((AutoCompleteTextView)findViewById(R.id.DestinationTextField)).setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClickGo(View view) {
        AutoCompleteTextView sourceView = (AutoCompleteTextView)findViewById(R.id.SourceTextField);
        AutoCompleteTextView destView = (AutoCompleteTextView)findViewById(R.id.DestinationTextField);
    }
}
