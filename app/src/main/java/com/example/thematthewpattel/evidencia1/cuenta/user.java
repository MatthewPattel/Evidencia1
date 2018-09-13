package com.example.thematthewpattel.evidencia1.cuenta;

import android.os.Parcel;
import android.os.Parcelable;


public class user implements Parcelable {

    public String sApellidoP, sApellidoM, sNombres, sSexo, sFecha, sEntidad;

    public user() {
        this.sApellidoP="";
        this.sApellidoM="";
        this.sNombres="";
        this.sSexo="";
        this.sFecha="0";
        this.sEntidad="";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(sApellidoP);
        parcel.writeString(sApellidoM);
        parcel.writeString(sNombres);
        parcel.writeString(sSexo);
        parcel.writeString(sFecha);
        parcel.writeString(sEntidad);
    }
    public static final Parcelable.Creator<user> CREATOR = new Parcelable.Creator<user>(){
        public user createFromParcel(Parcel in) {
            return new user(in);
        }

        @Override
        public user[] newArray(int i) {
            return new user[i];
        }
    };

    private user(Parcel in){
        this.sApellidoP = in.readString();
        this.sApellidoM = in.readString();
        this.sNombres = in.readString();
        this.sSexo = in.readString();
        this.sFecha = in.readString();
        this.sEntidad = in.readString();
    }
}

