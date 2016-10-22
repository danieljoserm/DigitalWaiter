package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import main.salonero.R;
import main.salonero.adapters.CustomAdapter;
import main.salonero.clases.DataModel;
import main.salonero.clases.menuitem;


public class Fragment2 extends Fragment {


    private static ArrayList<DataModel> data;

    View rootView;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter Adapter;
    List<menuitem> menuitems;
    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment2, container, false);





        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }


        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //  mLayoutManager = new GridLayoutManager(rootView.getContext(), 1);
        // mRecyclerView.setLayoutManager(mLayoutManager);

        Adapter = new CustomAdapter(data);
        //
        mRecyclerView.setAdapter(Adapter);


        return rootView;



    }

}
