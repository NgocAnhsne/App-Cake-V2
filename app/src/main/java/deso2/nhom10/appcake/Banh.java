package deso2.nhom10.appcake;

public class Banh {
    private int id_HinhAnh;
    private String _tenBanh;
    private double _giaBanh;

    public Banh(int id_HinhAnh, String _tenBanh, double _giaBanh) {
        this.id_HinhAnh = id_HinhAnh;
        this._tenBanh = _tenBanh;
        this._giaBanh = _giaBanh;
    }



    public int getId_HinhAnh() {
        return id_HinhAnh;
    }

    public void setId_HinhAnh(int id_HinhAnh) {
        this.id_HinhAnh = id_HinhAnh;
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
}
