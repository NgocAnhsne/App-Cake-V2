package deso2.nhom10.appcake;

public class Banh {
    private int maBanh, id_HinhAnh;
    private String _tenBanh,_giaBanh, sizeBanh;

    public Banh(int maBanh, int id_HinhAnh, String _tenBanh, String _giaBanh, String sizeBanh) {
        this.maBanh = maBanh;
        this.id_HinhAnh = id_HinhAnh;
        this._tenBanh = _tenBanh;
        this._giaBanh = _giaBanh;
        this.sizeBanh = sizeBanh;
    }

    public int getMaBanh() {
        return maBanh;
    }

    public void setMaBanh(int maBanh) {
        this.maBanh = maBanh;
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

    public String get_giaBanh() {
        return _giaBanh;
    }

    public void set_giaBanh(String _giaBanh) {
        this._giaBanh = _giaBanh;
    }

    public String getSizeBanh() {
        return sizeBanh;
    }

    public void setSizeBanh(String sizeBanh) {
        this.sizeBanh = sizeBanh;
    }
}
