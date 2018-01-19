package com.example.asus.myproject.Message;

/**
 * Created by ASUS on 2018/01/19.
 */

public class InboxMessgGridItem {
    int imgContactPic;
    String txtName,txtMessg;


    public InboxMessgGridItem(){

    }

    public InboxMessgGridItem(int imgContactPic, String txtName, String txtMessg) {
        this.imgContactPic = imgContactPic;
        this.txtName = txtName;
        this.txtMessg = txtMessg;
    }

    public int getimgContactPic() {
        return imgContactPic;
    }

    public void setimgContactPic(int imgContactPic) {
        this.imgContactPic = imgContactPic;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String gettxtMessg() {
        return txtMessg;
    }

    public void settxtMessg(String txtMessg) {
        this.txtMessg = txtMessg;
    }

}
