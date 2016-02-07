package com.example.parakh.colpedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnacademic=(Button) findViewById(R.id.btnacademic);
        btnsecurity=(Button) findViewById(R.id.btnsecurity);
        btnragging=(Button) findViewById(R.id.btnragging);
        btnmai=(Button) findViewById(R.id.btnmai);
        btnstationary=(Button) findViewById(R.id.btnstationary);
        btnfooding=(Button) findViewById(R.id.btnfooding);
        btnemergency=(Button) findViewById(R.id.btnemergency);
        btnpermissions=(Button) findViewById(R.id.btnpermissions);
        btncleanliness=(Button) findViewById(R.id.btncleanliness);
        btnacademic.setOnClickListener(this);
        btnsecurity.setOnClickListener(this);
        btnragging.setOnClickListener(this);
        btnmai.setOnClickListener(this);
        btnstationary.setOnClickListener(this);
        btnfooding.setOnClickListener(this);
        btnemergency.setOnClickListener(this);
        btnpermissions.setOnClickListener(this);
        btncleanliness.setOnClickListener(this);
    }
    private Button btnacademic,btnstationary,btnsecurity,btnfooding,btnemergency,btnpermissions,btnmai,btncleanliness,btnragging;

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
    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.btnacademic:
            Intent intentacademic=new Intent("com.example.parakh.colpedia.academic");
            startActivity(intentacademic);
            break;
        case R.id.btnsecurity:
            Intent intentsecurity=new Intent("com.example.parakh.colpedia.security");
            startActivity(intentsecurity);
            break;
        case R.id.btnstationary:
            Intent intentstationary=new Intent("com.example.parakh.colpedia.stationary");
            startActivity(intentstationary);
            break;
        case R.id.btnfooding:
            break;
        case R.id.btnragging:
            File pdfFile = new File("assests/apue.pdf");
            Uri path = Uri.parse("android.resource://"+getPackageName()+"/apue.pdf");
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(path, "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }


    }
    }

