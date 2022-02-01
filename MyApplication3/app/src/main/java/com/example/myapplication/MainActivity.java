package com.example.myapplication;
///*** imported classes***///
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,SearchInterface {
    EditText search;
    TextView title, searchIcon, filterIcon;
    ProfileDatas profileDatas;
    UserProfile userProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchIcon = findViewById(R.id.floating_search_1);
        title = findViewById(R.id.title);
        search = findViewById(R.id.search);
        filterIcon = findViewById(R.id.filter);
        ViewPager viewPager = findViewById(R.id.vpPager);
        FragmentAdapter viewPagerAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
       TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        searchIcon.setOnClickListener(this);
        filterIcon.setOnClickListener(this);
        userProfile = UserProfile.getInstance();
        getUserDetails();



    }

    @Override
    protected void onStart() {
        super.onStart();
        getUserDetails();
    }



    public void getUserDetails() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String URL = "https://bb5d0c19-fcad-4fb2-afdf-df1eacc4ac33.mock.pstmn.io/ajinshad/tasks/users";
        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    SharedPreferences.Editor editor = getApplicationContext().getSharedPreferences("PREFS_NAME", 0).edit();
                    editor.putString("USER_LIST_RESPONSE", response);
                    editor.apply();
                    Gson gson = new Gson();
                    profileDatas = gson.fromJson(response, ProfileDatas.class);
                    List<User> userList = profileDatas.getUsers();
                    userProfile.updateRecyclerView(userList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error", error.toString());
            }
        });
        queue.add(request);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floating_search_1:
                if (search.getVisibility() == View.VISIBLE) {
                    search.setVisibility(View.GONE);
                    title.setVisibility(View.VISIBLE);
                    filterIcon.setVisibility(View.VISIBLE);
                } else {
                    search.setVisibility(View.VISIBLE);
                    title.setVisibility(View.GONE);
                    filterIcon.setVisibility(View.GONE);
                }
                search.setText("");
                checkTextChanged();
                break;
            case R.id.filter:
                search.setVisibility(View.GONE);
                title.setVisibility(View.VISIBLE);
                filterIcon.setVisibility(View.VISIBLE);
                openMyDialog();
                break;
            default:
                break;
        }
    }

    private void checkTextChanged()
    {
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                updateFragment(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void updateFragment(CharSequence text) {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("PREFS_NAME", 0);
        String response = prefs.getString("USER_LIST_RESPONSE", "OK");
        Gson gson = new Gson();
        List<User> user = new ArrayList<>();
        profileDatas = gson.fromJson(response, ProfileDatas.class);
            if(prefs.getString("input","ok").equals("name")) {
                user = profileDatas.getUsers().stream().filter(word -> word.getName().toLowerCase().contains(text.toString().toLowerCase()))
                        .collect(Collectors.toList());
            }
           else if(prefs.getString("input","ok").equals("dob")) {
                user = profileDatas.getUsers().stream().filter(word -> word.getDob().toLowerCase().contains(text.toString().toLowerCase()))
                        .collect(Collectors.toList());
            }
           else if(prefs.getString("input","ok").equals("address")) {
                user = profileDatas.getUsers().stream().filter(word -> word.getAddress().toLowerCase().contains(text.toString().toLowerCase()))
                        .collect(Collectors.toList());
            }
           else if(prefs.getString("input","ok").equals("mobile")) {
                user = profileDatas.getUsers().stream().filter(word -> word.getPhone().getMobile().toLowerCase().contains(text.toString().toLowerCase()))
                        .collect(Collectors.toList());
            }
        userProfile.updateRecyclerView(user);
    }
    private void openMyDialog() {
        MyDialog dialog = new MyDialog(this, this);
        dialog.show();
    }

    @Override
    public void updateRecyclerview(List<User> users) {
        userProfile.updateRecyclerView(users);
    }
}