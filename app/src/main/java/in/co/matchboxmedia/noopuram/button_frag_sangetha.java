package in.co.matchboxmedia.noopuram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class button_frag_sangetha extends Fragment {


    public button_frag_sangetha() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_button_frag_sangetha, container, false);


        Button b1= view.findViewById(R.id.button_1);
        Button b2= view.findViewById(R.id.button_2);
        Button b3= view.findViewById(R.id.button_3);
        Button b4= view.findViewById(R.id.button_4);
        Button b5= view.findViewById(R.id.button_5);
        Button b6= view.findViewById(R.id.button_6);
        Button b7= view.findViewById(R.id.button_7);
        Button b8= view.findViewById(R.id.button_8);
        Button b9= view.findViewById(R.id.button_9);
        Button b10= view.findViewById(R.id.button_10);
        Button b11= view.findViewById(R.id.button_11);
        Button b12= view.findViewById(R.id.button_12);
        Button b13= view.findViewById(R.id.button_13);
        Button b14= view.findViewById(R.id.button_14);
        Button b15= view.findViewById(R.id.button_15);
        Button b16= view.findViewById(R.id.button_16);
        Button b17= view.findViewById(R.id.button_17);
        Button b18= view.findViewById(R.id.button_18);
        Button b19= view.findViewById(R.id.button_19);
        Button b20= view.findViewById(R.id.button_20);
        Button b21= view.findViewById(R.id.button_21);
        Button b22= view.findViewById(R.id.button_22);
        Button b23= view.findViewById(R.id.button_23);
        Button b24= view.findViewById(R.id.button_24);
        Button b25= view.findViewById(R.id.button_25);
        Button b26 = view.findViewById(R.id.button_26);

        Button n1= view.findViewById(R.id.button_n1);
        Button n2= view.findViewById(R.id.button_n2);
        Button n3= view.findViewById(R.id.button_n3);
        Button n4= view.findViewById(R.id.button_n4);
        Button n5= view.findViewById(R.id.button_n5);



        b1.getBackground().setAlpha(64);
        b2.getBackground().setAlpha(64);
        b3.getBackground().setAlpha(64);
        b4.getBackground().setAlpha(64);
        b5.getBackground().setAlpha(64);
        b6.getBackground().setAlpha(64);
        b7.getBackground().setAlpha(64);
        b8.getBackground().setAlpha(64);
        b9.getBackground().setAlpha(64);
        b10.getBackground().setAlpha(64);
        b11.getBackground().setAlpha(64);
        b12.getBackground().setAlpha(64);
        b13.getBackground().setAlpha(64);
        b14.getBackground().setAlpha(64);
        b15.getBackground().setAlpha(64);
        b16.getBackground().setAlpha(64);
        b17.getBackground().setAlpha(64);
        b18.getBackground().setAlpha(64);
        b19.getBackground().setAlpha(64);
        b20.getBackground().setAlpha(64);
        b21.getBackground().setAlpha(64);
        b22.getBackground().setAlpha(64);
        b23.getBackground().setAlpha(64);
        b24.getBackground().setAlpha(64);
        b25.getBackground().setAlpha(64);

        n1.getBackground().setAlpha(64);
        n2.getBackground().setAlpha(64);
        n3.getBackground().setAlpha(64);
        n4.getBackground().setAlpha(64);
        n5.getBackground().setAlpha(64);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "lelitha-male");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "lelitha-female");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "classicalmusic-male");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "classicalmusic-female");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "mappilapattugroup");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "mappila-male");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "mappila-female");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "sanghaganam");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "sanghaganamwestern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "westernsong");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "nadodisangheetham");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "semiclassicalmusic-hindusthani");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "semiclassicalmusic-karnatic");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "patrioticsong");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "kathakalimusicsingle-male");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "kathakalimusicsingle-female");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "ganamela");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "kavithapaarayanam");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "instrumentmusic");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "thukaleastern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "thukalwestern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "thanthrieastern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "thanthriwestern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "windeastern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "windwestern");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "chendagroup");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "panchavadyamgroup");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "bandmalamgroup");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "chenda");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment=new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "madalam");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act,fragment).commit();
            }
        });


        return view;
     }

}
