package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.List;

public class MyDialog extends Dialog implements android.view.View.OnClickListener {

    public Activity activity;

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText input;
    TextView ok, cancel;
    ProfileDatas profileDatas;
    SharedPreferences.Editor editor;
    SearchInterface searchInterface;
    RadioButton name,dob,address,Mobile;

    public MyDialog(Activity activity,SearchInterface searchInterface) {
        super(activity);
        this.activity = activity;
        this.searchInterface = searchInterface;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editor = getContext().getSharedPreferences("PREFS_NAME", 0).edit();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.my_dialouge);
        radioGroup = findViewById(R.id.radiogroup);
        input = findViewById(R.id.input);
        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        name = findViewById(R.id.radio0);
        dob = findViewById(R.id.radio1);
        address = findViewById(R.id.radio2);
        Mobile = findViewById(R.id.radio3);
        input.setText("");
        ok = findViewById(R.id.btn_okay);
        cancel = findViewById(R.id.btn_cancel);
        setChecked();
        selectOptions(radioGroup);
        checkTextChanged();
        input.setOnClickListener(this);
        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    private void selectOptions(RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                SharedPreferences.Editor editor = getContext().getSharedPreferences("PREFS_NAME", 0).edit();
                switch (checkedId) {
                    case R.id.radio0:
                        editor.putString("name", "Name");
                        editor.apply();
                        break;
                    case R.id.radio1:
                        radioButton.getId();
                        editor.putString("name", "DOB");
                        editor.commit();
                        break;
                    case R.id.radio2:
                        editor.putString("name","ADDRESS");
                        editor.commit();
                        break;
                    case R.id.radio3:
                        editor.putString("name", "mobile");
                        editor.commit();
                        break;
                    default:
                        break;
                }
                checkTextChanged();
            }
        });
    }

    private void checkTextChanged()
    {
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                updateRecyclerView(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void setChecked() {
        SharedPreferences prefs = getContext().getSharedPreferences("PREFS_NAME", 0);
        String Name = prefs.getString("name", "Name");
        if(Name.equalsIgnoreCase("Name"))
        {
            name.setChecked(true);
        }
        else if(Name.equalsIgnoreCase("dob"))
        {
            dob.setChecked(true);
        }
        else if(Name.equalsIgnoreCase("address"))
        {
            address.setChecked(true);
        }
        else
        {
            Mobile.setChecked(true);
        }
    }


    private void updateRecyclerView(String text) {
        {
            try {
                SharedPreferences prefs = getContext().getSharedPreferences("PREFS_NAME", 0);
                String response = prefs.getString("USER_LIST_RESPONSE", "ok");
                Gson gson = new Gson();
                profileDatas = gson.fromJson(response, ProfileDatas.class);
                List<User> user = new ArrayList<>();
                for (int i = 0; i < profileDatas.getUsers().size(); i++) {
                    if (text.equalsIgnoreCase(profileDatas.getUsers().get(i).getName())) {
                        user.add(profileDatas.getUsers().get(i));
                    } else if (text.equalsIgnoreCase(profileDatas.getUsers().get(i).getDob())) {
                        user.add(profileDatas.getUsers().get(i));
                    } else if (text.equalsIgnoreCase(profileDatas.getUsers().get(i).getAddress())) {
                        user.add(profileDatas.getUsers().get(i));
                    } else if (text.equalsIgnoreCase(profileDatas.getUsers().get(i).getPhone().getMobile())) {
                        user.add(profileDatas.getUsers().get(i));
                    }

                }
                searchInterface.updateRecyclerview(user);
            } catch (IllegalStateException | JsonSyntaxException exception) {
                Log.d("message",exception.getMessage());
            }
        }
    }


    @Override
    public void onClick(View v) {
        if (ok.getId() == v.getId() || cancel.getId() == v.getId()) {
            dismiss();
        }

    }

}