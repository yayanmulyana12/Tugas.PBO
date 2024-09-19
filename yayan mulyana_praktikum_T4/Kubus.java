/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23057_yayan.mulyana_praktikum_T4;

/**
 *
 * @author LENOVO
 */
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}