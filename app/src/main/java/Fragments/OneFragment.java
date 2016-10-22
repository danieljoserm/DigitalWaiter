package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import main.salonero.R;
import main.salonero.adapters.adaptermenuitem;
import main.salonero.clases.menuitem;


public class OneFragment extends Fragment {





    private Gson gson = new Gson();
    View rootView;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter Adapter;
    List<menuitem> menuitems;














    public OneFragment() {
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

        rootView = inflater.inflate(R.layout.fragment_one, container, false);
        //return inflater.inflate(R.layout.fragment_one, container, false);

       // menuitem hola= new menuitem("hola",1,2);
        menuitems= new ArrayList<>();
        menuitem hola= new menuitem();
               hola.setnombremenuitem("hola");
        hola.setCantidad(1);
        hola.setprecio(2);


        menuitem hola2= new menuitem();
        hola2.setnombremenuitem("si");
        hola2.setCantidad(2);
        hola2.setprecio(234);

        menuitem hola3= new menuitem();
        hola3.setnombremenuitem("hola");
        hola3.setCantidad(424);
        hola3.setprecio(235);

        menuitem hola4= new menuitem();
        hola4.setnombremenuitem("adios");
        hola4.setCantidad(256);
        hola4.setprecio(2343);


        menuitem hola5= new menuitem();
        hola5.setnombremenuitem("adios");
        hola5.setCantidad(256);
        hola5.setprecio(2343);

        menuitem hola6= new menuitem();
        hola6.setnombremenuitem("adios");
        hola6.setCantidad(256);
        hola6.setprecio(2343);
        menuitem hola7= new menuitem();
        hola7.setnombremenuitem("adios");
        hola7.setCantidad(256);
        hola7.setprecio(2343);


        menuitems.add(hola);
        menuitems.add(hola2);
        menuitems.add(hola3);
        menuitems.add(hola4);
        menuitems.add(hola5);
        menuitems.add(hola6);
        menuitems.add(hola7);




        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerview_menuitem);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

      //  mLayoutManager = new GridLayoutManager(rootView.getContext(), 1);
       // mRecyclerView.setLayoutManager(mLayoutManager);

        Adapter = new adaptermenuitem(menuitems);
        //
          mRecyclerView.setAdapter(Adapter);




        return rootView;



    }

}