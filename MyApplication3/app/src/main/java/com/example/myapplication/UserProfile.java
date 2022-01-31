package com.example.myapplication;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserProfile extends Fragment {

    RecyclerItems recyclerItems;
    RecyclerView recyclerView;

    View view;
    @SuppressLint("StaticFieldLeak")
    private static UserProfile single_instance = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.userprofiletab1, container, false);
        return view;
    }

    private UserProfile()
    {

    }
    public static UserProfile getInstance()
    {
        if(single_instance == null)
        {
            single_instance = new UserProfile();
        }
        return single_instance;
    }

    public void updateRecyclerView(List<User>users)
    {
        recyclerView =  view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerItems = new RecyclerItems(getContext(), users);
        recyclerView.setAdapter(recyclerItems);
        recyclerItems.notifyDataSetChanged();
    }
}
