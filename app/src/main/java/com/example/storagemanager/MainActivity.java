package com.example.storagemanager;

import android.content.Context;
import android.os.Bundle;
import android.os.storage.StorageManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv.setText("");
        StorageManager manager = (StorageManager) getSystemService(Context.STORAGE_SERVICE);
        //   List<StorageVolume> volumes = manager.getStorageVolumes();
        //  tv.setText(volumes.get(0).getDescription(this));
    }

    private void print(String str) {
        tv.append(str + "\n");
    }

    private void newLine() {
        print("");
    }

}


