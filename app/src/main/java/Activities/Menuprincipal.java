package Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;



public class Menuprincipal extends AppCompatActivity {

    String TAG = LoginActivity.class.getSimpleName();
    List<menuitem> menuitems;
    private static final String LOG_TAG = Menuprincipal.class.getSimpleName();
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.ic_tab_favourite,
            R.drawable.ic_tab_call,
            R.drawable.ic_tab_contacts
    };



    //dsfsdfdff
//sdfdsfdf








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

  tabLayout = (TabLayout) findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager);
       // setupTabIcons();






      /*  HashMap<String, String> datoslogueo = new HashMap<>();
        datoslogueo.put("name", "danieljoserm@hotmail.com");
        datoslogueo.put("email", "funciona");
        datoslogueo.put("genre", "88345424");

        JSONObject jobject = new JSONObject(datoslogueo);



        VolleySingleton.getInstance(getApplicationContext()).
                addToRequestQueue(
                        new JsonObjectRequest(
                                Request.Method.POST,
                                "http://52.38.158.11/api/clients/",
                                jobject,
                                new Response.Listener<JSONObject>() {

                                    @Override
                                    public void onResponse(JSONObject response) {
                                        // Procesar la respuesta Json
                                        Log.d(TAG, "Error Volley: " + "fsdf");

                                    }
                                },
                                new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        Log.d(TAG, "Error Volley: " + error.toString());
                                    }
                                }

                        )
                );*/






















    }




        private void setupTabIcons() {
            tabLayout.getTabAt(0).setIcon(tabIcons[0]);
            tabLayout.getTabAt(1).setIcon(tabIcons[1]);
            tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        }

        private void setupViewPager(ViewPager viewPager) {


            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
            adapter.addFrag(new OneFragment(), "ONE");
            adapter.addFrag(new Fragment2(), "TWO");
            adapter.addFrag(new Fragment3(), "THREE");
            viewPager.setAdapter(adapter);










        }










    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }




















}
