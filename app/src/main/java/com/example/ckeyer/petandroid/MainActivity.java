package com.example.ckeyer.petandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt_test,bt_start,bt_status;
    private TextView text_status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取控件
        bt_start = (Button)this.findViewById(R.id.bt_Start);
        bt_status = (Button)this.findViewById(R.id.bt_status);
        bt_test = (Button)this.findViewById(R.id.bt_test);
        text_status = (TextView)this.findViewById(R.id.text_status);
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

    public void onClickBtTest(View v ){
        this.text_status.setText("Download you with my self");
    }

    public void onClickBtStart(View v){

        byte[] data = "abc".getBytes();
        String text = Hash.HmacSha1("123",data);
        this.text_status.setText(text);
    }
}
