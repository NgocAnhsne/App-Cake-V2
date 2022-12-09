package deso2.nhom10.appcake;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BanhAdapter extends ArrayAdapter<Banh> {
    private Activity context;
    private int idLayout;
    private List<Banh> list = new ArrayList<Banh>();
    final int CODE_REQUEST = 1;

    public BanhAdapter(Activity context, int idLayout, List<Banh> list) {
        super(context, idLayout, list);

        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(idLayout, null);

        //Ánh xạ
        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.txtTen);
        TextView txtGia = view.findViewById(R.id.txtGia);

        ImageView imgHinh2 = view.findViewById(R.id.imgHinh2);
        TextView txtTen2 = view.findViewById(R.id.txtTen2);
        TextView txtGia2 = view.findViewById(R.id.txtGia2);

        //đổ dữ liệu
        Banh acMenu = list.get(i);
        return view;
    }



}
