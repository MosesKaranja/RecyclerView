package com.example.recylerview;

public class AminoAcidModel {
    String aminoAcidName;
    String aminoAcidAbbreviation;
    String aminoAcidAbbreviationSmall;
    int image;

    public AminoAcidModel(String aminoAcidName, String aminoAcidAbbreviation, String aminoAcidAbbreviationSmall, int image) {
        this.aminoAcidName = aminoAcidName;
        this.aminoAcidAbbreviation = aminoAcidAbbreviation;
        this.aminoAcidAbbreviationSmall = aminoAcidAbbreviationSmall;
        this.image = image;
    }


    public String getAminoAcidName() {
        return aminoAcidName;
    }

    public void setAminoAcidName(String aminoAcidName) {
        this.aminoAcidName = aminoAcidName;
    }

    public String getAminoAcidAbbreviation() {
        return aminoAcidAbbreviation;
    }

    public void setAminoAcidAbbreviation(String aminoAcidAbbreviation) {
        this.aminoAcidAbbreviation = aminoAcidAbbreviation;
    }

    public String getAminoAcidAbbreviationSmall() {
        return aminoAcidAbbreviationSmall;
    }

    public void setAminoAcidAbbreviationSmall(String aminoAcidAbbreviationSmall) {
        this.aminoAcidAbbreviationSmall = aminoAcidAbbreviationSmall;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
