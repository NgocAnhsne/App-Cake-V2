package deso2.nhom10.appcake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_Favotite extends ArrayAdapter {
    @Override

    public int getCount() {
        return favoriteActivityList.size();
    }
    private Context context;
    private int layout;
    private List<FavoriteActivity> favoriteActivityList;

    public Adapter_Favotite(Context context, int layout, List<FavoriteActivity> favoriteActivityList) {
        super(context, layout, favoriteActivityList);
        this.context = context;
        this.layout = layout;
        this.favoriteActivityList = favoriteActivityList;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        // anh xa view
        TextView textView = (TextView) view.findViewById((R.id.txtTen));
        TextView textView1 = (TextView) view.findViewById((R.id.txtGia));
        ImageView imageView = (ImageView) view.findViewById(R.id.imageviewHinh);

        // gan gia tri
        FavoriteActivity favoriteActivity = favoriteActivityList.get(i);

        textView.setText(favoriteActivity.getTen());
        textView1.setText(favoriteActivity.getGia());
        imageView.setImageResource(favoriteActivity.getHinh());

        textView.setText(favoriteActivity.getTen());
        textView1.setText(favoriteActivity.getGia());
        imageView.setImageResource(favoriteActivity.getHinh());

        return view;
    }
}
