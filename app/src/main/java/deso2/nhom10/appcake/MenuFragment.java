package deso2.nhom10.appcake;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MenuFragment extends Fragment {

    public MenuFragment() {
        // Required empty public constructor
    }
    ListView lvMenu;
    List<Banh> list = new ArrayList<Banh>();
    BanhAdapter adapter;
    final int CODE_REQUEST = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        lvMenu = getView().findViewById(R.id.lvMenu);

        list.add(new Banh(R.drawable.ic_macaronphap, "Bánh Macaron Pháp", 320.000));
        list.add(new Banh(R.drawable.ic_banhtaomy, "Bánh Táo Mỹ", 230.000));
        list.add(new Banh(R.drawable.ic_traicaymy, "Bánh trái cây", 300.000));
        list.add(new Banh(R.drawable.ic_banhdau, "Bánh dâu tây", 200.000));
        list.add(new Banh(R.drawable.ic_banhmamxoi, "Bánh mâm xôi", 500.000));
        list.add(new Banh(R.drawable.ic_banhsocolate, "Bánh socolate", 180.000));
        list.add(new Banh(R.drawable.ic_banhtraicaykho, "Bánh trái cây khô", 300.000));

//        adapter = new BanhAdapter(this, R.layout.fragment_menu_item, list);

        lvMenu.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_menu, container, false);


    }

}