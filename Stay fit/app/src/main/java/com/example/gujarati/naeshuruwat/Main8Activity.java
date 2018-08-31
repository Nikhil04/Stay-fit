package com.example.gujarati.naeshuruwat;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



    public class Main8Activity extends AppCompatActivity {

        // CONNECTION_TIMEOUT and READ_TIMEOUT are in milliseconds
        public static final int CONNECTION_TIMEOUT = 10000;
        public static final int READ_TIMEOUT = 15000;
        private RecyclerView mRVFishPrice;
        private AdapterElectronics mAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActionBar actionbar = getSupportActionBar();
            actionbar.hide();
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_electronics);
            //Make call to AsyncTask
            new AsyncFetch().execute();
        }

        private class AsyncFetch extends AsyncTask<String, String, String> {
            ProgressDialog pdLoading = new ProgressDialog(Main8Activity.this);
            HttpURLConnection conn;
            URL url = null;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                //this method will be running on UI thread
                pdLoading.setMessage("\tLoading...");
                pdLoading.setCancelable(false);
                pdLoading.show();

            }

            @Override
            protected String doInBackground(String... params) {
                try {

                    // Enter URL address where your json file resides
                    // Even you can make call to php file which returns json data
                    url = new URL("http://192.168.43.106/project/alldata_electronics.php");

                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return e.toString();
                }
                try {

                    // Setup HttpURLConnection class to send and receive data from php and mysql
                    conn = (HttpURLConnection) url.openConnection();
                    conn.setReadTimeout(READ_TIMEOUT);
                    conn.setConnectTimeout(CONNECTION_TIMEOUT);
                    conn.setRequestMethod("GET");

                    // setDoOutput to true as we recieve data from json file
                    conn.setDoOutput(true);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    return e1.toString();
                }

                try {

                    int response_code = conn.getResponseCode();

                    // Check if successful connection made
                    if (response_code == HttpURLConnection.HTTP_OK) {

                        // Read data sent from server
                        InputStream input = conn.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                        StringBuilder result = new StringBuilder();
                        String line;

                        while ((line = reader.readLine()) != null) {
                            result.append(line);
                        }

                        // Pass data to onPostExecute method
                        return (result.toString());

                    } else {

                        return ("unsuccessful");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    return e.toString();
                } finally {
                    conn.disconnect();
                }


            }

            @Override
            protected void onPostExecute(String result) {

                //this method will be running on UI thread

                pdLoading.dismiss();
                List<DataElectronics> data = new ArrayList<>();

                pdLoading.dismiss();
                try {
                    Log.d("TAG", result);
                    JSONArray jArray = new JSONArray(result);


                    // Extract data from json and store into ArrayList as class objects
                    for (int i = 0; i < jArray.length(); i++) {

                        JSONObject json_data = jArray.getJSONObject(i);

                        Log.d("TAG", json_data.getString("name1"));
                        Log.d("TAG", json_data.getString("price1"));
                        Log.d("TAG", json_data.getString("quantity1"));
                        Log.d("TAG", json_data.getString("warranty1"));
                        Log.d("TAG", json_data.getString("des1"));
                        Log.d("TAG", json_data.getString("image"));
                        DataElectronics data1 = new DataElectronics();
                        Log.d("TAG", "data set in electronics getset");

                        data1.dataname = json_data.getString("name1");
                        data1.dataprice = json_data.getString("price1");
                        data1.dataquantity = json_data.getString("quantity1");
                        data1.datawarranty = json_data.getString("warranty1");
                        data1.datadesc = json_data.getString("des1");
                        data1.dataImage = json_data.getString("image");
                        Log.d("TAG1", "Server result" + "" + json_data.getString("image"));
                        //
                        data.add(data1);
                    }

                    // Setup and Handover data to recyclerview
                    mRVFishPrice = (RecyclerView) findViewById(R.id.fishPriceList);
                    mAdapter = new AdapterElectronics(Main8Activity.this, data);
                    mRVFishPrice.setAdapter(mAdapter);
                    mRVFishPrice.setLayoutManager(new LinearLayoutManager(Main8Activity.this));

                } catch (JSONException e) {
                    Toast.makeText(Main8Activity.this, e.toString(), Toast.LENGTH_LONG).show();
                }

            }

        }

    }


