package sg.edu.rp.c346.id17032457.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Declare the variable
    Button btnLoadURL;
    WebView wvMPage;
    EditText etUrl;

    //Arraylist
    ArrayList<String> alWebsite;
    ArrayAdapter<String> aaWebsite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMPage = findViewById(R.id.webViewMyPage);
        etUrl = findViewById(R.id.editTextUrl);
        alWebsite = new ArrayList<>();


        aaWebsite= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alWebsite);

        // implement the onClick method for the button, to load the grab url in webview
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.grab.com/sg/";
                wvMPage.loadUrl(url);

                // This is the implement part
                String list = etUrl.getText().toString();
                alWebsite.add(list);
                aaWebsite.notifyDataSetChanged();



            }
        });
    }
}
