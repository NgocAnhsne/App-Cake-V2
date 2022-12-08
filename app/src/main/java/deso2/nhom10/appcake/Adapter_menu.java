package deso2.nhom10.appcake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_menu extends BaseAdapter  {
    private Context context;
    private int layout;
    private List<activity_menu.activityMenu> menuList = new ArrayList<activity_menu.activityMenu>();
    final int CODE_REQUEST = 1;

    public Adapter_menu(Context context, int layout, List<activity_menu.activityMenu> menuList) {
        this.context = context;
        this.layout = layout;
        this.menuList = menuList;
    }

    @Override
    public int getCount() {
        return menuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        //Ánh xạ
        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.txtTen);
        TextView txtGia = view.findViewById(R.id.txtGia);

        ImageView imgHinh2 = view.findViewById(R.id.imgHinh2);
        TextView txtTen2 = view.findViewById(R.id.txtTen2);
        TextView txtGia2 = view.findViewById(R.id.txtGia2);

        //đổ dữ liệu
        activity_menu.activityMenu acMenu = menuList.get(i);
        return view;
    }



}
