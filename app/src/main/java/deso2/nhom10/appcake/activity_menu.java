package deso2.nhom10.appcake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;

public class activity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

        public static class activityMenu implements Serializable{
            private int _idHinhAnh;
            private String _tenBanh;
            private double _giaBanh;
            private String _donGia;

            public activityMenu(int _idHinhAnh, String _tenBanh, double _giaBanh, String _donGia) {
                this._idHinhAnh = _idHinhAnh;
                this._tenBanh = _tenBanh;
                this._giaBanh = _giaBanh;
                this._donGia = _donGia;
            }

            public int get_idHinhAnh() {
                return _idHinhAnh;
            }

            public void set_idHinhAnh(int _idHinhAnh) {
                this._idHinhAnh = _idHinhAnh;
            }

            public String get_tenBanh() {
                return _tenBanh;
            }

            public void set_tenBanh(String _tenBanh) {
                this._tenBanh = _tenBanh;
            }

            public double get_giaBanh() {
                return _giaBanh;
            }

            public void set_giaBanh(double _giaBanh) {
                this._giaBanh = _giaBanh;
            }

            public String get_donGia() {
                return _donGia;
            }

            public void set_donGia(String _donGia) {
                this._donGia = _donGia;
            }
        }


}